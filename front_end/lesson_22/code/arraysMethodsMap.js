console.log("Hehey");

// Метод map
let names = ["Ivan", "John", "Bob"];
// как мы можем получить 
// ["Ivan Petrov", "John Petrov", "Bob Petrov"]
let fullNames = [];
for (let i = 0; i < names.length; i++) {
  // fullNames[i] = names[i] + " Petrov";
  fullNames.push(names[i] + " Petrov")
}
console.log(fullNames);

// map // не мутирует - возвращает новый массив
let fullNames2 = names.map((name) => name + "***");
let fullNames3 = names.map((name) => {      // вот то же самое, но с телом 
  return (name + "***");
});
console.log(names)
console.log(fullNames2);

// 
let ages = [5, 12, 19, 28, 6, 36];
// хотим получить новый массив если возраст меньше 19 включительно - то будет слово ребенок
// если больше то взрослый 
// ['ребенок', 'ребенок', 'ребенок', 'взрослый'... 'взрослый']
let agesAsWords = ages.map((age) => {
  if (age >= 19) {
    return "adult";
  } else {
    return "child";
  }
})
let agesAsWords2 = ages.map((age) => (age >= 19 ? "adult" : "child"));

console.log(agesAsWords);
console.log(agesAsWords2);


let message = 5 > 20 ? "Boom" : "Ooops";


const fruits = ["apple", "mango", "ornage", "banana", "pear"];

// хотим получить новый массив длин из этих слов
// [5, 5, 6, 6, 4]
// ['ELPPA', "OGNAM"...]
const fruitsLength = fruits.map((fruit) => fruit.length);
console.log(fruitsLength);

// 
let reversedCat = "cat".split("").reverse().join("").toUpperCase();
console.log(reversedCat);

const reversedFruits = fruits.map(
  (fruit)=> fruit.split('').reverse().join('').toUpperCase()
  )
// как работает split - в скобочках разделитель 
console.log("h-e-y".split('-')); // [ 'h', 'e', 'y' ]