import Student from './Student';

type Action =
  | { type: 'students/add'; payload: Student }
  | { type: 'students/removeByName'; payload: string }
  ;

export default Action;
