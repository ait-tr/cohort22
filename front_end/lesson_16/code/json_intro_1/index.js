

// json
async function f2(){
  let response = await fetch('http://127.0.0.1:5500/api/names.json');
  // let data = await response.json();
  console.log(response);
}

f2()