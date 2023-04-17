import { createStore, combineReducers } from 'redux';
import { composeWithDevTools } from 'redux-devtools-extension';
import counterReducer from './features/counter/counterReducer';

const store = createStore(
  combineReducers({
    counter: counterReducer,
  }),
  composeWithDevTools()
);

export default store;
export type RootState = ReturnType<typeof store.getState>;
