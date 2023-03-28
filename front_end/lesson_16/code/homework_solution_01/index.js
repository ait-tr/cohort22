// Задание 1
// Создайте метод getStudent, который возвращает promise - объекта (студент с именем "Max" и возрастом 26), c задержкой 5 секунд.
// Вызовите этот метод - сохраните в переменную.
// Раскройте promise при помощи then, напечатайте имя студента.
// Дополнительно:

// Найдите бесплатное API (мемы или любая тема)

// объект-литерал

function getStudent() {
  return new Promise(function (resolove, reject) {
    setTimeout(() => {
      resolove(student = { name: "Max", age: 26 });
    }, 5000);
  });
}

let promiseStudent = getStudent();
promiseStudent.then((student) => { // student - это произвольное слово - мы сами выбрали, чтобы подходило по смыслу
  console.log(student.name);
});

