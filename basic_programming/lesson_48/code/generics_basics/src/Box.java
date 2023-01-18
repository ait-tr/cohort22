public class Box <T> {
    T value;

    public Box(T value) {
        this.value = value;
    }
    public void print(){
        System.out.println(value);
    }
}
