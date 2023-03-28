const pirate = {
  name: "Jack",
  nickName: "Sparrow",
  age: 40,
  isDrunk: true,
  belongings: ["rome bottle", "smoking pipe", "spyglass", "gun"]
};
//Стандартный вариант
const ageOfPirate = pirate.age;
const isDrunkPirate = pirate.isDrunk;

// Деструктуризация               // свойство : новое имя переменной
let {name, nickName, age, isDrunk, belongings:newBelongings, eduction} = pirate;
console.log(name);
console.log(nickName);
console.log(newBelongings);
console.log(eduction); // undefined

// если хотим сохранить под новым именем переменной 
let {name:pirateName} = pirate;  // 
console.log(pirateName);

//
const tower = {
  title: "Berlin Tower",
  height: 368,
  squareSize: 1326,
  rooms: ["restaurant", "Observation deck"]
}
// сохранить в переменные все поля объекта 
// и вывести в печать 
// * сохраните в отдельную перменную "Observation deck"
let {title, height, squareSize, rooms} = tower;
console.log(title);
// console.log(height);
// console.log(squareSize);
console.log(rooms);
let [,observation] = rooms;  // вариант 1 
let obs = rooms[1];          // вариант 2 того же самого 


// как скопировать все свойства из объекта и добавить новых 
const mordorTower = {
  ...tower,
  hasFlamingEye: true
}
console.log(mordorTower);