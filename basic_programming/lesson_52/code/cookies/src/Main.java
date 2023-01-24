public class Main {
    public static void main(String[] args) {

        Food cookie = new Food();
        cookie.prepare(new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("I'm backing "+ str);
            }
        }, "cookies");
    }
}