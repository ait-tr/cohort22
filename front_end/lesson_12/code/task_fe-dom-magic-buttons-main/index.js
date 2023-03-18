// найдем первую кнопку по id
const btn = document.getElementById("magic-btn");
// скопируем ее - получилась вторая кнопка. Ее можно использовать.
const clonedBtn = btn.cloneNode(true);
// задали id
clonedBtn.id = "magic-btn-2";
let toggle = true;


btn.addEventListener('click', () => {
  // при нажатии на первую кнопку
  // работайте с clonedBtn
  // ваш код начинается здесь
  // вариант 1 
  // console.log("Слушатель работает при клике!");
  // const textNode = document.createTextNode("Я изменю тебя");
  // clonedBtn.textContent = "";
  // clonedBtn.appendChild(textNode);
  // console.log(clonedBtn);
  // document.body.appendChild(clonedBtn);

  // вариант 2 
  clonedBtn.textContent = "Я изменю тебя";
// clonedBtn.className = "second-btn";  // вариант а
  clonedBtn.setAttribute("class", "second-btn"); // вариант б
  clonedBtn.style.color = "white";
  clonedBtn.style.backgroundColor = "#a78b71";
  
  if(toggle){
    document.body.appendChild(clonedBtn);
    toggle = false;
  } else {
    clonedBtn.remove();
    toggle = true;
  }
})

// здесь можете создать EventListener для второй кнопки
clonedBtn.addEventListener('click', ()=>{
  btn.style.color = "black";
  btn.style.backgroundColor = "#9c4a1a";
})

