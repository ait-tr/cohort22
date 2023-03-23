let url = fetch("https://aws.random.cat/meow")
.then((value)=>value.json()) // первый then раскрыли promise от фича 
.then((data)=>{              // второй then раскрывает promise от метода .json()
  console.log("****");
  console.log(data)       // { file: 'https://purr.objects-us-east-1.dream.io/i/5711415676_2cb62cd1ef_z.jpg'}
  console.log(data.file); // https://purr.objects-us-east-1.dream.io/i/moo1.png
  return data.file;
});
console.log("Url "+ url); // Url [object Promise]
