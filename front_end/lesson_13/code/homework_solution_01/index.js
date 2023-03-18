"use strict"
const numbers = [3, 19, 16, 27, 19, 67, 15, 44, 28];
const numbers2 = new Array(3, 19, 16, 27, 19, 67, 15, 44, 28);

const anotherNumbers = [];
for(let i = 0; i < numbers.length; i++){
  if (numbers[i] % 2 === 0 ){
    anotherNumbers[i] = numbers[i] + 10;
  } else {
    anotherNumbers[i] = numbers[i] - 11;
  }
}
console.log(anotherNumbers);
