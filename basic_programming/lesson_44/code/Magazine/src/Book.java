public class Book implements Printable{
    private String title;
    @Override
    public void print() {
        System.out.println("Book "+ title);
    }

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}
