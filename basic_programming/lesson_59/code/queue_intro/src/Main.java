import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // LIFO
        ArrayDeque<String> fruits = new ArrayDeque<>();
        fruits.push("apple");
        fruits.push("orange");
        fruits.push("banana");
        fruits.push("lemon");
        System.out.println(fruits);
        System.out.println(fruits.pop());
        System.out.println("После pop " + fruits);
        System.out.println(fruits.pop());
        System.out.println("После pop " + fruits);
        System.out.println("peekFirst:  " + fruits.peekFirst());
        System.out.println(fruits.getLast());
        System.out.println(fruits);

        // FIFO
        Queue<String> vilains = new LinkedList<>();
        vilains.offer("Volan De Mort");
        vilains.offer("Tanos");
        vilains.offer("Dr. Evil");
        vilains.offer("Jocker");
        System.out.println(vilains.poll());
        System.out.println(vilains.poll());
    }
}