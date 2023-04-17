import React from 'react';
import { useSelector, useDispatch } from 'react-redux';
import { RootState } from '../../store';

function Counter(): JSX.Element {
  // вот получили значение переменной из стора
  const value = useSelector((globalState: RootState) => globalState.counter.value);
  //
  const dispatch = useDispatch();
  function hadlePlusClick(): void {
    dispatch({ type: 'counter/plus', payload: 1 });
  }
  function handleMinusClick(): void {
    dispatch({ type: 'counter/minus', payload: 1 });
  }
  function handlePlusTen(): void {
    dispatch({ type: 'counter/plus', payload: 10 });
  }

  return (
    <>
      <button type="button" onClick={handleMinusClick}>-</button>
      {value}
      <button type="button" onClick={hadlePlusClick}>+</button>
      <button type="button" onClick={handlePlusTen}>+10</button>
    </>
  );
}

export default Counter;
