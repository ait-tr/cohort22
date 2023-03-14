console.log("Добро пожаловать в JS!");
// ключевое слово let - переменная 
let x = 9;  // сделал переменную числовую
let phrase = "Смеркалось, в воздухе чувствовалось напряжение!"; // строку 
x = 19; // изменил значение в переменной x 
console.log(x);
console.log(phrase);
// ключевое слово const - константа
const y = 10;
// y = 21;
// console.log(y);
console.log("А этот текст выведется в консоль?");
console.log(phrase);
console.log("*".repeat(10));

// getElementById позволяет получить элемент по id 
const button = document.getElementById("btn1");
console.log(button);

// getElementsByClassName по имени класса
let text = document.getElementsByClassName("text");
// получим нулевой элемент этой коллекции 
console.log(text[0]);
// getElementsByTagName по тегу
let textByTeg = document.getElementsByTagName("p");
// выведем элемент колекции под индексом 1:
console.log(textByTeg[1]);

// Создание элемента 
// создали элемент c тегом h2 и в нем ничего нет
const heading = document.createElement("h2");
console.log(heading);
// создали текст для элемента - узелок
const textNode = document.createTextNode("Только свежая информация о Дом-дерево");
// положим текст внутрь h2
heading.appendChild(textNode);
// посмотрели, получилось ли?
console.log(heading);
// прикрепляем к документу внуть бади 
document.body.appendChild(heading);
// Только после этого элемент появился на странице!!!

// Создайте div элемент с текстом: "Я люблю кодить"
// не трогайте html файл
const loveToCodeElement = document.createElement("div");
const lovetoCodeText = document.createTextNode("Я люблю кодить");
loveToCodeElement.appendChild(lovetoCodeText);
document.body.appendChild(loveToCodeElement);

// Другой способ добавить текст или изменить его: 
// создаем элемент
let newDivElement = document.createElement("div");
// изменили текст 
newDivElement.innerText = "А мы продолжаем погружение! Рыбы за иллюминатором";
// newDivElement.innerText = "Другой текст";
// прикрепили в документ
document.body.appendChild(newDivElement);
// получить  значение аттрибута 
let fruit = document.getElementById("aim");
let attributeResult = fruit.getAttribute("class");
console.log(attributeResult);
// попробуем изменить значение на правильное, чтобы апельсин был апельсином по классу
fruit.setAttribute("class", "orange");

// innerHTML - можно добавлять разметки 
let panda = document.getElementById("panda");
panda.innerHTML = "<p> Неожиданно среди рыб появилась мордочка панды</p>";

// 
const bamboo = document.getElementById("bamboo");
bamboo.style.color = "#e6c34d";
bamboo.style.backgroundColor = "#489b25";
bamboo.style.padding = "10px";

// удалить элемент можно при помощи метода remove
// bamboo.remove();

// Слушатели событий 

btn2 = document.getElementById("btn2");
textToChange = document.getElementById("text-change");

// если клик - то срабатывает блок кода 
btn2.addEventListener('click', () => {
  // === оператор сравнения 
  if (textToChange.style.fontWeight === "bold") {
    textToChange.style.fontWeight = "normal";
  } else {
    textToChange.style.fontWeight = "bold";
  }
});