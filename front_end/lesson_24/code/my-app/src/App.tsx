import React, { useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { AppDispatch, RootState } from './redux/store';
import { addTodo, editTodo, removeTodo } from './redux/todoSlice';

function App(): JSX.Element {
  const todoList = useSelector((state: RootState) => state);
  const dispatch = useDispatch<AppDispatch>();
  const [description, setDescription] = useState('');
  const [newDescription, setNewDescription] = useState('');
  function handleAddTodo(event: React.FormEvent<HTMLFormElement>): void {
    event.preventDefault();
    console.log(description);
    dispatch(addTodo(description));
  }
  function handleEditTodo(
    event: React.FormEvent<HTMLFormElement>,
    id: string
  ): void {
    event.preventDefault();
    dispatch(editTodo({ newDescription, id }));
  }

  return (
    <>
      <h1>React to-do list App</h1>
      <p>text</p>
      <form action="" onSubmit={(event) => handleAddTodo(event)}>
        <label htmlFor=""> Введите новую задачу</label>
        <input type="text" onChange={(e) => setDescription(e.target.value)} />
        <button type="submit">Создать задачу</button>
      </form>
      <div>
        {todoList.map((e) => (
          <div key={e.id}>
            {e.description}
            <button type="button" onClick={() => dispatch(removeTodo(e.id))}>Удалить</button>
            <form action="" onSubmit={(event) => handleEditTodo(event, e.id)}>
              <input type="text" onChange={(event) => setNewDescription(event.target.value)} />
              <button type="submit">Изменить</button>
            </form>
          </div>
        ))}
      </div>

    </>
  );
}

export default App;
