
import React from 'react';
import { useState } from 'react';

function Counter() {
  let [count, setCount] = useState(0);
  // создадим еще одну переменную состояния 
  let [food, setFood] = useState("яблоко");
  // после скобочек указываем тип возвращаемого значения
  function handlePlusClick(): void {
    setCount(count + 1);
  }
  function handleMinusClick(): void {
    setCount(count - 1);
  }
  // создадим еще один обработчик 
  function handleEatApple():void{
    setFood("огрызок");
  }

  // пусть в спан будет "яблоко" --> при нажатии измените на "огрызок"

  return (
    <div>
      <h1>Добро пожаловать в Реакт</h1>
      <button onClick={handleMinusClick}>-</button>
      <span>{count}</span>
      <button onClick={handlePlusClick}>+</button>
      <br />
      <span>{food}</span>  
      <button onClick={handleEatApple}>Съесть яблоко</button>
    </div>
  );
}

export default Counter;