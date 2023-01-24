
Задание на анонимный класс Cookable 

1. Создайте интерфейс Cookable, содержащий метод void cook(String str)
2. Создайте класс Food, содержащий метод public void prepare(Cookable c, String str){
c.cook(str);}
3. Создайте экземпляр класса Food и вызвать метод prepare
4. На вход метода prepare экземпляр анонимного класса, расширяющего интерфейc Cookable.