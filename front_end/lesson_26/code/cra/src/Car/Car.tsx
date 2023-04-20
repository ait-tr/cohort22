import React from 'react';
import style from './Car.module.css';

type Props = {
  brand: string;
  color: string;
};

function Car(props: Props): JSX.Element {
  const { brand, color } = props;
  return (
    <div className={style.car}>
      Марка машины: {brand}
      Цвет машины: {color}
    </div>
  );
}

export default Car;
