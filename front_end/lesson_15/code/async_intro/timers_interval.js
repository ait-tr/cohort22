// воспроизводить код через определенное время 

const ourInterval = setInterval(()=>{
  console.log("Я буду печататься каждые 5 секунд");
}, 5000)

// чтобы остановить интервал мы должны использовать 
// функцию clearInterval
// но clearInterval(ourInterval); сразу погасил наш интервал
// поэтому мы поместим его setTimout
setTimeout(()=>{
  clearInterval(ourInterval);
}, 20_000)  // 20 секунд === 20000 ms

// создайте функцию - которая бы выводила фразу "А я же говорила" 
// с интервалом 3 секунды
// чтобы это прекратилось спустя 20 секунд

function iHaveToldYou(){
  const interval = setInterval(()=>{
    console.log("А я же говорила" );
  }, 3_000)
  setTimeout(()=>{
    clearInterval(interval);
  }, 20_000)
}

iHaveToldYou();