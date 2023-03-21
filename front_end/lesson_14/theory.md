
## JS Object, class, prototype

 
Узнать больше об объекте: [ссылка](https://learn.javascript.ru/object)  
Узнать больше о прототипном наследовании: [ссылка](https://learn.javascript.ru/prototype-inheritance)  
Узнать больше о class: [ссылка](https://learn.javascript.ru/class)

Ссылка на презентацию: [JS](https://github.com/ait-tr/cohort22/blob/main/front_end/lesson_12/js.pdf)
Ссылка на учебник по JS: [learn JS](https://learn.javascript.ru/)

### Объекты JavaScript

*Немного теории.*

В JS можно создавать объекты тремя разными способами:
1. используя синтаксис `объект-литерал`
2. используя функции-конструкторы, `prototype` (наиболее нативный для JS метод)
3. используя `class` из ES6 (подход ООП)


**1. Синтаксис объект-литерал**. Когда нам нужен только один экземпляр
объекта, удобно использовать синтаксис объект-литерал. Требуется
”буквально” записать объект, который мы хотим получить,
описать свойства и методы объекта. На первом рисунке
требуется создать человека с именем и фамилией. Также надо добавить метод,
чтобы соединить это в полное имя.

```js
let person = {
 firstName: 'Kweku',
 lastName: 'White',
 fullName: function() {
   return this.firstName + ' ' + this.lastName;
 }
};
person.firstName;
// => 'Kweku'
person.fullName();
// => 'Kweku White'
```
*Рисунок 1*. Использование синтаксиса объект-литерал для представление человека как
объект JavaScript.

**2. Функция-Конструктор**. Если нам нужно создать тестовый объект с похожим
поведением и значениями, мы можем записать его с помощью функции-конструктора. Использование ключевого слова `prototype` позволяет нам распространять свойства и методы на все объекты, созданные данным конструктором.
На втором рисунке мы используем конструктор, чтобы создать двух
людей с теми же атрибутами и поведением что и на 'Рисунок 1'. Конструктор
`Person()` настраивает атрибуты, которые уникальны для каждого экземпляра:
имя и фамилия. Полное имя составляется при помощи метода прототипа `Person.prototype.fullName`.

```js
let Person = function(firstName, lastName) {
 this.firstName = firstName;
 this.lastName = lastName;
};
Person.prototype.fullName = function() {
 return this.firstName + ' ' + this.lastName
};
let grayson = new Person('Grayson', 'Arthur');
grayson.firstName;
// => 'Grayson'
let warner = new Person('Warner', 'Constable');
warner.fullName();
// => 'Warner Constable'
```
*Рисунок 2*. Использование конструктора для представления людей как объекты JavaScript.

**3. ES6-class**
Начиная с ES6 появилась возможность объявлять классы, как это делается в большинстве объектно-ориентированных языках программирования. Рассмотрим тот же пример, но с использованием новой конструкции.

```js
class Person{
  constructor(firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
  fullName() {
    return this.firstName + ' ' + this.lastName;
  }
}

let grayson = new Person('Grayson', 'Arthur');
grayson.firstName;
// => 'Grayson'
let warner = new Person('Warner', 'Constable');
warner.fullName();
// => 'Warner Constable'
```
*Рисунок 3*. Использование `class` для представления людей как объекты JavaScript.
