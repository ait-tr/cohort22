import Action from './types/Action';
import StudentsState from './types/StudentsState';

const initialState: StudentsState = {
  value: [{ name: 'Михаил', age: 30 }, { name: 'Katya', age: 20 }],
};

export default function studentsReducer(
  state: StudentsState = initialState,
  action: Action
): StudentsState {
  switch (action.type) {
    case 'students/add':
      // ...state, value: [...state.value, action.payload]
      return { value: [...state.value, action.payload] };
    case 'students/removeByName':
      //  ...state, value: state.value.filter((student) => student.name !== action.payload)
      return { value: state.value.filter((student) => student.name !== action.payload) };
  }
  return state;
}
