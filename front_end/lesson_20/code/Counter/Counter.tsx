import React, { useState } from 'react';
import style from './Counter.module.css';

function Counter(): JSX.Element {
  const [count, setCount] = useState<number>(0);

  function handlePlusClick(): void {
    setCount(count + 1);
  }
  function handleMinusClick(): void {
    setCount(count - 1);
  }

  return (
    <div className={style.counterBox}>
      <button className={style.button} type="button" onClick={handlePlusClick}>+</button>
      <span>{count}</span>
      <button
        className={style.button}
        type="button"
        onClick={handleMinusClick}
      >
        -
      </button>
    </div>
  );
}

export default Counter;
