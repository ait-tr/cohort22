public class Main {
    public static void main(String[] args) {

        System.out.println("Пятница ранний вечер");
        Girl snezhanna = new Girl("Снежанна");
        snezhanna.makeUp();
        snezhanna.dressBeautifully();
        System.out.println("Я пошла");
        snezhanna.drink();
        snezhanna.drink();
//        snezhanna.drink();
//        snezhanna.drink();
//        snezhanna.drink();
//        snezhanna.drink();
        try {
            snezhanna.haveFun();
        } catch (FridayNightException e){
            System.out.println(e.getMessage());
        }
//        snezhanna.friday();
    }
}