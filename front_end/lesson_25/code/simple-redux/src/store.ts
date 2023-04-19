import { createStore, combineReducers } from 'redux';
import { composeWithDevTools } from 'redux-devtools-extension';
import counterReducer from './features/counter/counterReducer';
import studentsReducer from './features/students/studentsReducer';

const store = createStore(
  combineReducers({
    counter: counterReducer,
    students: studentsReducer,
  }),
  composeWithDevTools()
);

export default store;
export type RootState = ReturnType<typeof store.getState>;
