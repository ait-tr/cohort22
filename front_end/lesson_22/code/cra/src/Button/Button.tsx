import React from 'react';

type Props = {
  message: string;
};

function Button(props: Props): JSX.Element {
  const { message } = props;
  return (
    <button type="button">Нажми меня для {message}</button>
  );
}

export default Button;
