type Props = {food: number};
//в родителе: <Child counter={counter} />
function Child({food}:Props) {
  console.log(food);
  return (
    <p>
      Дочерний компонент
      <span>{food}</span>
    </p>
  )
}

export default Child;