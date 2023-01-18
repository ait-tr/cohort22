public class BoxOfFruits <T extends Fruit & Eatable>{
    T value;

    public BoxOfFruits(T value) {
        this.value = value;
    }
    public void print(){
        System.out.println(value);
    }
}
