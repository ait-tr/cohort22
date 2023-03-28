async function getSeven(){
  return 7;
}

let x = getSeven();
// console.log(x);

async function f(){
  let value = await getSeven();
  console.log(value);
}

f();
