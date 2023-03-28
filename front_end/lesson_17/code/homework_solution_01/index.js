 
// let jsonString = JSON.stringify({age:18, name: "Bob"});
// console.log(jsonString);
// console.log(JSON.parse(jsonString));

async function getGuitarInfo(){
  const response = await fetch("http://127.0.0.1:5500/api/gibson.json");
  const obj = await response.json();
  console.log(obj);
  console.log(obj.model);
  console.log(obj.pickups);
}

getGuitarInfo();