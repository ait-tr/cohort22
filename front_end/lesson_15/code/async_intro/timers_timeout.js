// Асинхронность: Timers, EventLoop, Promise, then, fetch

setTimeout(()=>{
  console.log("Я выполнюсь через 5 секунд от начала");
}, 5000);

setTimeout(()=>{
  console.log("А я буду раньше или нет?");
}, 0);

console.log("А я обычный синхронный код");
// сначала выполнится синхронный код, только потом асинхронный 
// EventLoop
// объявили асинхронную функцию с задержкой 

function hello(){
  setTimeout(()=>{
    console.log("Мы хорошо разобрались в EventLoop");
  }, 7000)
}
// если не вызовем саму функцию - ничего не произойдет 
hello();

// напишите функцию, которая принимает слово, 
// и выводит его через 9 секунд
// назовите ее latePrint



function latePrint(word){
  setTimeout(()=>{
    console.log(word)
  }, 9000)
}

latePrint("Привет Евгению")