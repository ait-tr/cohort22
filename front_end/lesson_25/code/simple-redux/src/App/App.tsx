import React from 'react';
import Counter from '../features/counter/Counter';
import Students from '../features/students/Students';
import StudentRegistration from '../features/students/StudentRegistration';
import StudentRemove from '../features/students/StudentRemove';

function App(): JSX.Element {
  return (
    <div className="App">
      <Counter />
      <Students />
      <StudentRegistration />
      <StudentRemove />
    </div>
  );
}

export default App;
