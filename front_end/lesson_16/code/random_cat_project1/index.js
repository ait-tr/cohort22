let img = document.getElementById("cat");


// let url = fetch("https://aws.random.cat/meow")
// .then((value)=>value.json()) // первый then раскрыли promise от фича 
// .then((data)=>{              // второй then раскрывает promise от метода .json()
//   console.log("****");
//   console.log(data)       // { file: 'https://purr.objects-us-east-1.dream.io/i/5711415676_2cb62cd1ef_z.jpg'}
//   console.log(data.file); // https://purr.objects-us-east-1.dream.io/i/moo1.png
//   img.src = data.file;
//   return data.file;
// });
async function wait(){
  let answer = await fetch("https://aws.random.cat/meow");
  console.log("*******");
  console.log(typeof answer);
  console.log("*******");
  let data = await answer.json();
  console.log(data);
  console.log("*******");
  console.log(data.file);
  img.src = data.file;
}

wait();

addEventListener('click', ()=>{
  wait();
});