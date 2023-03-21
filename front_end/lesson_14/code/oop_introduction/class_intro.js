
class Panda {
  constructor(name = "Po", weight = 200) {
    this.name = name;
    this.weight = weight;
  }
  takeWeight() {       // потолстеть на десять киллограм 
    this.weight += 10;
  }
}

const panda = new Panda("Poo", 240);
console.log(panda);

const panda2 = new Panda("Bob");
console.log(panda2);

const panda3 = new Panda(undefined, 300);
console.log(panda3);

const panda4 = new Panda();
console.log(panda4);

class Fruit {
  constructor(color, form) {
    this.color = color,
      this.form = form,
      this.isRipe = false
  }
  becomeRipe() {
    this.isRipe = true;
  }
}
// наследовались от фрукта
class Orange extends Fruit {
  constructor(numberOfSeeds, color, form) {
    super(color, form),
      this.numberOfSeeds = numberOfSeeds
  }
}

const orange = new Orange(14, "orange", "sphere");
console.log(orange);


// Создайте базовый класс аклоголь с полями: объем, название, крепость
// создайте класс мартини с полями model (красная или белое) ;
// наследуйтесь от класса алкоголь
// Создайте экземпляр мартини. 

class Alcohol {
  constructor(title, volume, strenght) {
    this.title = title;
    this.volume = volume;
    this.strenght = strenght;
  }
}

class Martini extends Alcohol {
  constructor(isRed, title, volume, strenght) {
    super(title, volume, strenght);
    this.isRed = isRed;
  }
}

const martiniFiero = new Martini(true, "Fiero", 0.7, 20);
console.log(martiniFiero);



