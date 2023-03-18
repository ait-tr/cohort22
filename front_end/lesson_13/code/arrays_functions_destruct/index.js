"use strict"
const LIGHT_GREEN = "#333333";
let x = 9;
let y = 21;
// напишем функцию сложения 
// объявление функции
function sum(a, b) {
  return a + b;
}
// вызов функции
let answer = sum(x, y);
console.log(answer);

// стрелочная функция 
// однострочная 
const sum2 = (a, b) => a + b;
console.log(sum2(5, 10));
// блочная 
const sum3 = (a, b) => {
  return a + b;
}

// напишите функцию с именем getSecond 
// она принимает массив 
// и возвращает его второй элемент (под индексом 1)
// создайте функцию тремя способами выше 

let arr = ["first"];

function getSecond(arr) {
  return arr[1];
}

console.log(getSecond(arr));    // undefined

let arr2 = ["ANdrey", "Anna", "Michail"];
console.log(typeof arr2);       // object
const getSecond2 = (arr) => arr[1];
console.log(typeof getSecond2); // function


const getLast = (arr) => {
  // return arr[arr.length - 1];
  return arr.at(-1);  // укорачивает код 
}
console.log(getLast(arr2));

// code wars - задачи онлайн - java -  javascript - 


// Деструктуризация массивов
// еще одним способом создать массив
// например, у нас массив из имени и возраста
// пример 1
let [a, b] = [12, 16, 17]
console.log(a);
console.log(b);

// пример 2
let arr4 = [9, "Ivan"];
// let age = arr4[0];
// let name = arr4[1];
let [age, name, gender] = arr4;
console.log(gender);

// пример 3
let arr6 = ["Bob", "John", "Garry", "Simon"];
// можем пропускать неинтересующие нас элементы
let [, john, , simon] = arr6;
console.log(john);
console.log(simon);

// пример 4 со звездочкой, пытаемся достать 29
let arr7 = [["single"], [[12, 29], ["img", "Ivan Bodrov", true]]];
let [, [[, number]]] = arr7;
let [[socialStatus], [[yearsInMarrige, dateOfWedding], [image, name1, vegan]]] = arr7;
console.log(number);
// задание  // достаньте только риану и аромат "tulip"
let arr8 = [["dior", 270], [["Angelina Jolly", "Rianna", "Bionce"], "tulip"]];
let [, [[, riana,], tulip]] = arr8;
console.log(riana + " " + tulip);
// пример 5 значения по умолчанию 
// let arr9 = ["Vasya", false];
let arr9 = [];
let [name2 = "Evgeniy", victory = true] = arr9;
console.log(name2 + " " + victory);

// Как копировать массивы? 
// "🦖"
let dinosaurs = ["🦕", "🦕", "🦕"];
let dinosaursCopy = [];
console.log(dinosaurs);
dinosaursCopy = dinosaurs;
console.log(dinosaursCopy);
//  spread синтаксис
let dinosaursCopy2 = [...dinosaurs];
// в чем подвох?
dinosaursCopy[0] = "🦖";     // изменили один массив - поменялись оба
console.log(dinosaurs);      // на самом деле обе переменные содержат 
// ссылку на один и тот же объект-массив
console.log(dinosaursCopy);
console.log(dinosaursCopy2); // 

// Задание 2
// напишите метод, который принимает массив, копирует его - и возвращет копию
const copyArr = (arr) => [...arr]; 
const newArr2 = copyArr(["clock", "fog"]);
// Задание 3
// напишите метод, который принимает массив и новый элемент и добавляет этот элемент
// в начало массива - ничего не возвращает
let element = 8;
let arr10 = [1, 2, 3];
let arr11 = [element, ...arr10];
arr10 = arr11;
console.log(arr10);
// Задание 4 
// напишите метод, который принимает массив с двумя массивами и возвращает 
// глубокую копию этого массива 



