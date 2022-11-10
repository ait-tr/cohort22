public class Main {
    public static void main(String[] args) {
        boolean isAdmin = true;
        navbar(false);
    }
    public static void navbar(boolean x1) {
        //  первый вариант
//        if(x1) {
//            System.out.println("Кабинет админа Товары Заявки");
//        } else {
//            System.out.println("Личный кабинет Корзина Любимое");
//        }
        // вариант с тернарником
        String result = x1 ?
                "Кабинет админа Товары Заявки" : "Личный кабинет Корзина Любимое";
        System.out.println(result);
    }
}