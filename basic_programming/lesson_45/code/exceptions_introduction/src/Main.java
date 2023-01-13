public class Main {
    public static void main(String[] args) {
        System.out.println("Программа выполняется 1");
        try {
            System.out.println("А этот код прочитается?");
            float x = Float.parseFloat("12adsdas"); // throws new Exception
            System.out.println(x);
            System.out.println("Эксперимент");
        } catch (Exception e) {
            System.out.println("Ниже сообщение:");
            System.out.println(e.getMessage()); // можем вывести сообщение об ошибке
            //e.printStackTrace();                // напечатает всю информацию об ошибке
        } finally {
            System.out.println("Этот код выводится в любом случае, даже если выше был ретерн");
        }
        // finally может не быть
        System.out.println("Программа выполняется 2");
    }
}