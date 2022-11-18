public class Main {
    public static void main(String[] args) {
        boolean isHungry = true;
        int stomach = 0; // полный живот, когда равен 10 единицам
        while(isHungry) {
            System.out.println("Номер итерации: " + (stomach + 1) + " В животе: " + stomach);
            if (stomach >= 10) {
                isHungry = false;
            }
            stomach++;
        }
        System.out.println("Мы вышли из цикла");

    }
}