public class Post implements Comparable<Post>{
    private int likesNumber;
    private String text;
    private int repostsNumber;
    public int id;                        // не статическое - принадлежит экземпляру
    public static int totalNumberOfPosts; // статическое поле принадлежит классу

    public int getLikesNumber() {
        return likesNumber;
    }

    public String getText() {
        return text;
    }

    public static void staticExample(){
        // В статическом мы можем использовать только статические поля.
    }

    public void nonStaticExample(){
        // В не-статическом методе, нам доступны все поля: как статические, так и не статические.
    }

    public Post(int likesNumber, String text, int repostsNumber) {
        this.likesNumber = likesNumber;
        this.text = text;
        this.repostsNumber = repostsNumber;
        this.id = ++totalNumberOfPosts;
    }

    @Override
    public int compareTo(Post o) {
        return Integer.compare(this.id, o.id);
    }

    @Override
    public String toString() {
        return System.lineSeparator()+"Post{" +
                "likesNumber=" + likesNumber +
                ", text='" + text + '\'' +
                ", repostsNumber=" + repostsNumber +
                ", id=" + id +
                '}';
    }
}
