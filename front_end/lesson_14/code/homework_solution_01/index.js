console.log("Привет");

// Задание 3
// напишите метод, который принимает массив и новый элемент и добавляет этот элемент
// в начало массива - ничего не возвращает
let disneyCharackters = ["Tom", "Jerry", "ann"];

function addToBegining(array, element){
  // console.log(array.shift());
  array.unshift(element);
  // console.log(array.push("Extra"));
  // console.log(array.pop());
}
// Методы массива: 
// Начало: shift   - убирает нулевой элемент (и возвращает его), 
//         unshift - добавляет в начало - возвращает длинну массива
// Работают с концом: 
//         push    - добавляет элемент в конец, и возвращает длинну массива 
//         pop     - убирает с конца элемент и возвращает его

addToBegining(disneyCharackters, "Billy");

console.log(disneyCharackters);

// Задание 4 
// напишите метод, который принимает массив с двумя массивами и возвращает 
// глубокую копию этого массива 

// 
let arr1 = [1, 3, 5];
let arr2 = ["asda", "asdas"];
let arr3 = [arr1, arr2];
console.log(arr3);

// 
function deepCopy2D(arr){
  return [...arr[0], ...arr[1]];
}
//
let arr4 = deepCopy2D(arr3);
console.log(arr4);
// мутация arr3 ничего не изменила
arr3[0]= "Привет Михаилу";
console.log(arr4);
// мутируем arr1 
arr1[0] = "Привет Наталье";
console.log(arr4);

// Создайте функцию, которая принимает массив и два параметра, 
// возвращает новый массив (параметр1, исходный массив, параметр2). 
// Параметры расположились в начале и конце нового массива.

function getNewArr(param1, arr, param2){
  return [param1, ...arr, param2];
}

let arrResult = getNewArr("Start", [1, 2, 3, 4], "Finish");
console.log(arrResult);




