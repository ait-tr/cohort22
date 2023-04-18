// получить центролизованное состояние и
// и замапить студентов

import React from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { RootState } from '../../store';

function Students(): JSX.Element {
  const value = useSelector((globalState: RootState) => globalState.students.value);
  const dispatch = useDispatch();
  return (
    <div>
      <h2>Студенты</h2>
      {value.map((student) => (
        <div>
          {student.name} {student.age}
          <button
            type="button"
            onClick={() =>
              dispatch({
                type: 'students/removeByName', payload: student.name
              })}
          >
            Удалить
          </button>
        </div>
      ))}
    </div>
  );
}

export default Students;
