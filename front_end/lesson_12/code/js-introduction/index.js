"use strict"
// Примитивные типы
console.log("Продолжим изучение JS");

let text = "Наш первый стринг";
console.log(text);
text = 'Записали новый текст в переменную';
console.log(text);

let isDrunk = true;
isDrunk = false;
// 
console.log(typeof isDrunk); // boolean
console.log(typeof text);    // string

let num = 9.2;
console.log(typeof num);

let symbol = Symbol('for michail');
console.log(symbol);

let num2;
console.log(num2); // undefined
num2 = null;       // особый тип значения
console.log(num2);

// Операторы
// математические: +, -, *, /, ** - возведение в степень, % - остаток от деления

// операторы сравнения  == - с приведением типа, === - строгое равенство, чтобы тип совпадал 
console.log(1 + 8 == 9); // true
console.log(1 + 8 === 9);// true
console.log(1 == "1");   // true  - приводит тип 

console.log(true == 1);  // true
console.log(true === 1); // false
console.log(1 === "1");  // false 
console.log("*********");
console.log(1 !== "1");  // true
console.log(1 != "1");   // false
// Преобразование типов: coersion иерархия: 1.string 2.number 3.boolean  
// как преобразовать между типами?
// из строки в число: 
let x = Number("1");
console.log(x);
console.log(typeof x);
// 
let y = Number("text");   // когда не получилось привести к числу - NaN
console.log(y);           // NaN - not a number
console.log(typeof y);    // Nan - его тип number 
// второй способ преобразовать в число - добавить плюс перед числом - сахар
let z = 1 + +"2";
console.log(z);
console.log(typeof z);
// из чего-угодно в строку 
let str1 = String(123123);
console.log(str1);
console.log(typeof str1); // string 
// преобразование в boolean
let b = Boolean(1);
console.log(b);       // true
console.log(typeof b);// boolean

let u = Boolean(0);
console.log(u);       // false
console.log(typeof u);// boolean

let p = Boolean("0");
console.log(p);       // true
console.log(typeof p);// boolean

let n = Boolean("");
console.log(n);       // false
console.log(typeof n);// boolean

// используйте ===

// Массивы  
// как создать
let arr1 = [];          // первый способ создать массив
let arr2 = new Array(); // второй способ создать массив
let arr3 = ["Anna", "Natalia", "Nadya"];
// как посмотреть длинну
console.log(arr3.length);  // 3 
// как вывести при помощи цикла в консоль? 
// цикл также работает 
// Node js - установить node.js
for (let i = 0; i < arr3.length; i++) {
  console.log(arr3[i]);  // получили элемент по индексу
}
// а можем записать в массив разные типы?
let arr4 = [0, "Natalia", true];
console.log(arr4);
console.log(arr4[2]);
// если хочу заменить элемент под индексом ноль на 1 
arr4[0] = 1;
console.log(arr4);

// Создайте массив имен музыкантов: John, Bobby, Garry и т.д.
// Нужно используя цикл изменить эти имена и добавить к каждому из них слово "MC "
// Должен получится массив MC John, MC Bobby, и т.д.

let musicians = ["John", "Bobby", "Garry", "Semeon"];
for (let i = 0; i < musicians.length; i++) {
  musicians[i] = "MC " + musicians[i];
}
console.log(musicians);