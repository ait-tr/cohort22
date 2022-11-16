public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Zoo!");
        // Построил зоопарк с вольерами, он решил построить 12 мест для животных
        // создать массив для 12 String
        //  сначала мы создаем переменню с именем animals,
        //  мы также указываем тип того, что будем в хранить String[]
        String[] animals = new String[12]; // в правой части мы создали массив строк длинной 12
        // " 123" + "312312" - объединение строк, если хоть одна строка слева или справа
        System.out.println(animals[2]); // null
        animals[0] = "Monkey";
        animals[1] = "Bear";
        animals[2] = "Camel";
        animals[3] = "Donkey";
        animals[4] = "Elephant";
        animals[5] = "Goat";
        animals[6] = "Ram";
        animals[7] = "Giraffe";
        animals[8] = "Hyppo";
        animals[9] = "Snake";
        animals[10] = "Tiger";
        animals[11] = "Penguin";
        // наш жираф сбежал, а поскольку денег нет на нового жирафа
        // "Pig" - вручную перезаписать жирафа на свинью
        // Напишите метод tellMe(animal)  выводит в консоль
        // "It is a <animalName>, what a wonderful animal"
        tellMe(animals[9]);
        // вызываем метод, передаем в него значение из массива по индексу
        tellMe(animals[6]);
        System.out.println("______");
        aboutAll(animals);
        // Домашнее задание:
        //
        // У нас эпидемия и все животные уехали в больницу...
        // Хозяин купил вместо старых животных зайцев Rabbit,
        // Написать ниже цикл, который бы заменил все значения в массиве на
        // "Rabbit"
        // после того как перезапишите - вызовите в мейне метод aboutAll(animals);
        System.out.println("___Rabbits_are_coming___");
        for(int i = 0; i< animals.length; i++){
            animals[i] = "Rabbit"; // записали кроликов вместо других зверей
        }
        aboutAll(animals);
    }
    public static void tellMe(String x) {
        System.out.println("It is a " + x + ", what a wonderful animal!");
    }
    public static void aboutAll(String[] allAnimals) {
        // здесь напишите цикл, и используйте в нем метод который мы написали ранее
        for(int i = 0; i < allAnimals.length; i++){
            // tellMe(allAnimals[i]); // а могли воспользоваться методом
            System.out.println("It is a " + allAnimals[i] + ", what a wonderful animal!");
        }
    }
}