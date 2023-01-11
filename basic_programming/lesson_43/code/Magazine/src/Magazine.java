public class Magazine implements Printable{
    String title;
    @Override
    public void print() {
        System.out.println("Magazine " +title);
    }

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "title='" + title + '\'' +
                '}';
    }
}
