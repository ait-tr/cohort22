//  Обозначим проблему:
function getFiveInSevenSec() {
  setTimeout(() => {
    return 5;
  }, 7000)
}
let result = getFiveInSevenSec();
console.log(result); // undefined - потому что синхронный код не дождался значения
// Promise - 
// создали промис 
let promise = new Promise(function(resolved, reject){
  setTimeout(() => {
    resolved(5);
  }, 7000)
});
// но нужно дождаться ответа 
console.log(promise);
// ожидаемся ответа при помощи then
// value - это переменная - в которую сохранилось значение, которое мы ждали
promise.then((value)=>{
  let res = console.log(value);
  // значение будет доступно только в теле колбэка
})
// создадим promise c reject
let promise2 = new Promise(function(resolved, reject){
  setTimeout(() => {
    reject(new Error("Ошибка, ничего не пришло назад"));
  }, 8000)
})

promise2
.catch((err)=>{
  console.log(err);
})
.then((data)=>{
  console.log(data);
})






// создаем промис
// промис с ошибкой 




// создадим функцию, которая возвращает значение через 5 cекунд


// получили занчение number 5 спустя 2 секунды 
