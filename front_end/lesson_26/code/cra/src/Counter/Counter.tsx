import React, { useState } from 'react';
import style from './Counter.module.css';

function Counter(): JSX.Element {
  const [count, setCounter] = useState<number>(0);

  function hadlePlusChange(): void {
    setCounter(count + 1);
  }

  function hadleMinusChange(): void {
    setCounter(count - 1);
  }
  return (
    <div className={style.clickerBox}>
      <button type="button" onClick={hadlePlusChange}>+</button>
      <span>{count}</span>
      <button type="button" onClick={hadleMinusChange}>-</button>
    </div>
  );
}

export default Counter;
