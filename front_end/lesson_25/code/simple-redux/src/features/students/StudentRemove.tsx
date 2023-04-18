import React, { useState } from 'react';
import { useDispatch } from 'react-redux';

function StudentRemove(): JSX.Element {
  const [name, setName] = useState<string>('');
  const dispatch = useDispatch();
  return (
    <>
      <h2>Удаление студента по имени</h2>
      <form
        action=""
        onSubmit={(event) => {
          event.preventDefault();
          dispatch({ type: 'students/removeByName', payload: name });
        }}
      >
        <label htmlFor="">Введите имя</label>
        <input type="text" onChange={(event) => setName(event.target.value)} />
        <button type="submit">Удалить</button>
      </form>
    </>
  );
}

export default StudentRemove;
