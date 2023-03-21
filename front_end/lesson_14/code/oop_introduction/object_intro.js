// Тема: Object
//
// создали объект
let planet = {
  title: "Mars",
  age: 5,
  "number of moons": 8, // если ключ с пробелами, то мы можем написать его в кавычках
  hasLife: false
}
console.log(planet);
// как получить свойство?
console.log(planet.hasLife);
// как записать другое значение по ключу 
// на марсе появилась жизнь
planet.hasLife = true;
// посмотрим изменилось ли?
console.log(planet);
// как можно удалить можно удалить свойство у объекта?
delete planet.age;
console.log(planet);
// когда хотим получить доступ к свойствам с пробелом 
// то придется использовать квадратные скобки и кавычки
planet["number of moons"] = 6;
// открыли шестую луну у марса 

// Задание
// создайте объект с именем dog 
// с полями: пол, возраст, isAgressive, "likes to take a nap".
// после создания измените значение isAgressive на false;
// удалите свойство "likes to take a nap".

const dog = {
  sex: true,
  age: 4,
  isAgressive: true,
  "likes to take a nap": true
}
dog.isAgressive = false;
delete dog["likes to take a nap"];
console.log(dog);

// Прототипное наследование
const animal = {
  age: 0,
  say(){
    console.log("hey!");
  }
}
// Вызовем метод
animal.say();

// Теперь немного устаревшего синтаксиса __proto__ - по два подчеркивания с каждой стороны
const worm = {
  length: 10,
  __proto__: animal   // забрали поля и методы animal
}

console.log(worm);    // length: 10
worm.say();           // hey
console.log(worm.age);// 0 
// если не находит поля у объекта, 
// он смотрит, есть ли такое поле у протитипа 

console.log(worm.__proto__); // можно посмотреть есть ли прототип
// __proto__ - скрытое поле - содержит ссылку на другой объект или null
// ссылки не могут идти по кругу // у объекта может быть только один прототип

// Задание 
// Создайте объект vehicle с полями: speed и с методом: drive.
// Метод должен выводить в консоль фразу "Brrrr-brr"
// Создайте объект car с полем тип бензина(gasType)
// и заберите остальные свойства у прототипа vehicle

const vehicle = {
  speed: 30,
  drive(){
    console.log("Brrr-brr");
  }
}
// создадим объект, наследуемся черз прототип
const car = {
  gasType: 98,
  __proto__: vehicle
}
// теперь вывозвем метод
car.drive(); // Brrr-brr

// **** Информация со звездочкой **** Дополнительно ****
// как посмотреть есть ли ключ?
const exampleObj = {
  color: undefined,
  size: 5
}
console.log(exampleObj.depth); // undefined
console.log(exampleObj.size);  // 5
console.log(exampleObj.color); // undefined
// непонятно есть ли поле, но оно undefined
// или его просто нет 
console.log("color" in exampleObj); // true
console.log("size" in exampleObj); // true
console.log("depth" in exampleObj); // false

// как пройтись по всем ключам-свойствам // как for-each
for(key in exampleObj){
  console.log(key);
}
// если хотим получить значения 
// когда ключ является переменной - мы указываем его в квадратных скобочках 
for(key in exampleObj){
  console.log(exampleObj[key]);
}

