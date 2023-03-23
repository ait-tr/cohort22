// функция которая возвращает промис(а в промисе число 158)
function loadNumber(){
  return new Promise(function(resolved, reject){
    setTimeout(()=>{
      // код какой-нибудь
      resolved(158); // 
    }, 10000)
  })
}

let promiseOfNumber = loadNumber(); // функция вернула промис 
promiseOfNumber.then((value)=>{
 console.log("внутри колбэка " + value);
})

