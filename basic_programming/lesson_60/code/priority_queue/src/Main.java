import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // создали очередь
        PriorityQueue<Integer> numbersPQ = new PriorityQueue<>();
        // добавим элементы
//        numbersPQ.offer(null); нельзя класть null в PQ
        numbersPQ.offer(6);
        numbersPQ.offer(5);
        numbersPQ.offer(7);
        numbersPQ.offer(8);

        System.out.println(numbersPQ.element()); // то же, что peek - но выкидывает ошибки - если пустая очередь
        System.out.println(numbersPQ);
        System.out.println(numbersPQ.poll());
        System.out.println(numbersPQ.poll());
        System.out.println(numbersPQ.poll());
        System.out.println(numbersPQ.poll());
        numbersPQ.remove();

        // будем доставать
//        System.out.println(numbersPQ.poll()); // получаем значение и удаляем из очереди. Если очередь пуста - получаем null
//
//        System.out.println(numbersPQ);
//        System.out.println(numbersPQ.peek()); // заглядываем - получаем значение, но не удаляем из очереди
//        System.out.println(numbersPQ);
//        numbersPQ.remove();                   // удаляет и получаем это значение. Если очередь пуста - выбрасывает ошибку.
//        System.out.println(numbersPQ);
////        numbersPQ.removeAll(List.of(5, 8));
//        numbersPQ.remove(5);
//        System.out.println(numbersPQ);

        System.out.println(numbersPQ.peek()); // заглядываем, получаем значение, но не удаляем

        System.out.println(numbersPQ);


    }
}