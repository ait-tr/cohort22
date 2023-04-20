import React from 'react';
import Button from 'react-bootstrap/Button';
import CloseButton from 'react-bootstrap/CloseButton';

function BootstrapPage(): JSX.Element {
  return (
    <div>
      <h2>Изучаем bootstrap</h2>
      <Button variant="danger">Постигнуть тонкости бутстрапа</Button>
      <CloseButton onClick={() => { console.log('click'); }} />
    </div>
  );
}

export default BootstrapPage;
