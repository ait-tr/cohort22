import React, { useContext } from 'react';
import { Shoes } from '../ShoeShop/types/Shues';
import { Context } from '../Layout/Layout';

interface Props {
  shoesObj: Shoes;
}
// <ShoesCard shoesObj={element} apples="apples"/>
// props = {shoesObj:element}
function ShoesCard(props: Props): JSX.Element {
  const { isAdmin, name } = useContext(Context);
  const { shoesObj } = props;
  const {
    id, url, link, title
  } = shoesObj;
  return (
    <li key={id}>
      <a href={link}>
        <span>{title}</span>
        <img src={url} alt="" />
      </a>
      {isAdmin ? <div> Администратор {name}</div> : <div> Специальное предложение  {name}</div>}
    </li>
  );
}

export default ShoesCard;
