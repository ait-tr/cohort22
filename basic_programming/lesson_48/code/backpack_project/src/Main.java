public class Main {
    public static void main(String[] args) {

        Backpack<Book> nikePack = new Backpack<>(
                "Nike",
                new Book("Java for pandas"));
        System.out.println(nikePack);

        Backpack<Fiction> pack = new Backpack<>(
                "Qa",
                new Fiction("QA for pandas")
        );
        Backpack<Book> addiddas =  new Backpack<>("Addiddas", new Fiction("Lord of Rings"));

    }
}