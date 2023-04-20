import React, { useEffect, useState } from 'react';
import style from './GenderReveal.module.css';

function GenderReveal(): JSX.Element {
  const [firstName, setFirstName] = useState<string>('');
  const [gender, setGender] = useState<string>('...');

  const handleSubmit = (event: React.FormEvent): void => {
    event.preventDefault();
    async function loadGender(): Promise<void> {
      const response = await fetch(`https://api.genderize.io?name=${firstName}`);
      const obj = await response.json();
      // console.log(obj); // {count: 425630, gender: 'male', name: 'Ivan', probability: 1}
      setGender(obj.gender);
    }
    loadGender();
  };

  // console.log('компонент срендерился - mount');
  useEffect(() => {
    console.log('Use effect firstName');
    // useEffect срабатывает при первом рендере
    // и при любом изменении firstName
  }, [firstName]);

  useEffect(() => {
    console.log('Use effect without dependencies');
    // useEffect при каждом рендеринге
  });

  useEffect(() => {
    console.log('Use effect empty dependencies array');
    // только при первом рендеринге
  }, []);

  return (
    <div className={style.genderBox}>
      <h1>Узнай пол по имени</h1>
      <form action="" method="post" onSubmit={handleSubmit}>
        <label htmlFor="">Введите свое имя (eng)</label>
        <input
          type="text"
          value={firstName}
          onChange={(event) => setFirstName(event.target.value)}
        />
        <button type="submit">
          Узнать пол
        </button>
      </form>
      <div>{gender}</div>
      {/* <Car brand={gender} color={firstName} /> */}
    </div>
  );
}

export default GenderReveal;
