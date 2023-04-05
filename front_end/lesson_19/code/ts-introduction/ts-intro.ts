// неявная типизация 
let x = 9;
console.log(x);

// явная типизация 
let y: number = 10;
console.log(y);
console.log(typeof y); // если хотим узнать тип

let k: number; // объявили переменную типа number
k = 10_000;
console.log(k);

let isDrunk: boolean = true;
let firstName: string = "Vladimir";

// мы можем указать тип используя ключевое слово type 
// можем создать собственный тип
type Gender = 'male' | 'female';
let gender: Gender = "male";

// создадим еще один тип расширеного пола (из трех варантов) на основе предыдущего 
// хотип добавить 
type ExtendedGender = Gender | 'non-binary';
let gender2: ExtendedGender = 'non-binary';

//
type Special = number | boolean; //  
let isSpecial: Special = 123;
let isSpecial2: Special = false;

// cоздали тип
interface User {
  firstName: string;
  age: number;
}
// объект этого типа
let ivan: User = {
  firstName: "ivan",
  age: 29
}
// плюшки
interface Pirate {
  name: string;
  weapon: string;
  parrot?: string; // необязательное поле 
  eyePatchColor?: string;
}

const blackBeard: Pirate = {
  name: "Black Beard",
  weapon: "Pistol",
  eyePatchColor: "black"
}

console.log(blackBeard);

interface BeatifulPirate extends Pirate {
  beard: string;
}

// тип any 
// Функции
// типизация функции в стрелочном стиле 
type ShaveBeard = (pirate: Pirate) => BeatifulPirate;

// сложение 
type Sum = (a: number, b: number) => number;

// можем типизировать при создании функции 
function subtract(a: number, b: number): number {
  return a - b;
}

// типизация массива 
let names: string[] = ["Ivan", "John", "Bob"];
let ages: number[] = [16, 94, 26];

// можно по-другому 
// детализируем тип нашего массива
type Specials = [string, "drunk" | "sober", number | undefined];
// создадим массив указанного типа 
const specials: Specials = ["Dance", "sober", undefined];

// создайте тип для следующего объекта 
// {title: "Berlin", population: 3_400_000, isCapital: true}
// после этого создайте объект с указанием типа 
// su adminUsername 

interface City {
  title: string;
  population: number;
  isCapital: boolean;
}
const berlin: City = { title: "Berlin", population: 3_400_000, isCapital: true };
// по другому тоже можно сделать 
type City2 = {
  title: string,
  population: number,
  isCapital: boolean
}
const moscow:City2 = {title: "Moscow", population: 10_000_000, isCapital:true};
