public class Main {

  public static void main(String[] args) {
    int numberInt = 9; // создал переменную типа интеджер
    // с именем numberInt и со значением 9
    System.out.printf("Our integer: %d \n", numberInt); // если хотим вывести в консоль integer
    System.out.println("Our integer: " + numberInt); // здесь через + объединение строк
    float numberFloat = 9.123f; // объявили переменную с именем numberFloat, тип float,
    // значение 9.123f - всегда f на конце
    double numberDouble = 9.18; // создали переменную типа double с именем numberDouble со значением 9.18
    System.out.printf("Our float number: %f \n", numberFloat); // если хотим вывести float
    System.out.printf("Our double number: %f \n", numberDouble); // если хотим вывести double
    System.out.println(numberFloat); // простро распечатаем в отдельную строку
    String word = "Puppet"; // создадали переменную типа String с именем word и значением 'Puppet'
    System.out.println(word); // вывели в консоль - передав имя переменной
    String userName = "Bob the Second King of Yamaika"; // создадали переменную типа String
    // выводило "Привет, userName, у нас для тебя приятная новость"
    System.out.printf("Hi, %s, we have the good news for you 🙂 \n", userName);
    //^ мы вывели переменную с типом String использовали для этого %s
    int numberOfItems = 9;
    String name = "Nikolas"; // создаем переменную типа String
    String doll = "Barbie";
    System.out.printf("Hi, %s, you gonna buy %d items\n", name, numberOfItems);
    // ^ вывели несколько типов одновременно, важен порядок аргументов
    System.out.printf("%s, you wanna buy %s? \n", doll, name);
    // ^ вывели несколько переменных String одновременно, важен порядок аргументов
    // Hi, my name is <ваше имя>, my favourite month is <int>, my fav double is <double>.
    // @khamidov_alisher
    String myName = "Alisher";
    int myFavNumber = 7;
    double myFavDouble = 3.14;
    System.out.printf("Hi, my name is %s, my fav month is %d, my fav double is %.0f", myName, myFavNumber, myFavDouble);
  }
}