import { useState } from "react";
import Child from '../Child/Child';

function Counter() {
  let [counter, setCounter] = useState<number>(0);
  // создайте переменную состояния стринг
  // создайте еще один дочерний компонент 
  // пробросте эту переменную в этот дочерний компанент
  function handleMinusClick(): void {
    setCounter(counter - 1);
  }
  function handlePlusClick(): void {
    setCounter(counter + 1);
  }
  return (
    <div>
      <button onClick={handleMinusClick}>-</button>
      <span>{counter}</span>
      <button onClick={handlePlusClick}>+</button>
      <Child food={counter} />
    </div>
  )
}
export default Counter;
