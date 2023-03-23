// - Создайте  классы: Plant, Rose. Роза должна наследовать Растение.
// - Пусть у растения будут поля: рост, возраст. И метод grow, который увеличивает его рост на 10 см.
// - У розы должно быть поле - количество бутонов (numberOfFlowers).
// - Создайте объект класса розы, вызовите метод.
class Plant {
  constructor(height, age) {
    this.height = height;
    this.age = age;
  }
  grow() {
    this.height += 10;
  }
}

class Rose extends Plant {
  constructor(height, age, numberOfFlowers) {
    super(height, age);
    this.numberOfFlowers = numberOfFlowers;
  }
}
const rose = new Rose(120, 4, 24);
console.log(rose);

// Шаблонные строки
let clientName = "Vova";
let familyName = "Ivanov";
// console.log("Привет %s", clientName); // но так никто не делает 
// ` - бэктики или обратные кавычки
console.log(`Привет ${clientName} ${familyName}`);
