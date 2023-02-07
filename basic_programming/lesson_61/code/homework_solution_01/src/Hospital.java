import java.util.PriorityQueue;

public class Hospital {
    private String title;
    private int capacity;
    private PriorityQueue<Patient> patients = new PriorityQueue<>();



    public Hospital(String title, int capacity) {
        this.title = title;
        this.capacity = capacity;
    }

    public void register(Patient patient) {
        if (patients.size() < capacity) {
            patients.offer(patient);
        } else {
            System.out.println("No place! Die somewhere else!");
        }
    }

    public void tread() {
        if (patients.isEmpty()) {
            System.out.println("Некого лечить!");
        } else {
            System.out.println(patients.poll().getName() + ", поздравляем с выздоровлением, берегите себя!");
        }
    }


}
