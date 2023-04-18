import React, { useState } from 'react';
import { useDispatch } from 'react-redux';

function StudentRegistration(): JSX.Element {
  const [name, setName] = useState<string>('');
  const [age, setAge] = useState<number>(0);
  const dispatch = useDispatch();
  return (
    <>
      <h2>Регистрация студента</h2>
      <form
        action=""
        onSubmit={(event) => {
          event.preventDefault();
          dispatch({ type: 'students/add', payload: { name, age } });
        }}
      >
        <label htmlFor="">Введите имя</label>
        <input type="text" onChange={(event) => setName(event.target.value)} />
        <label htmlFor="">Введите возраст</label>
        <input type="number" onChange={(event) => setAge(Number(event.target.value))} />
        <button type="submit">Зарегистрировать</button>
      </form>
    </>
  );
}

export default StudentRegistration;
