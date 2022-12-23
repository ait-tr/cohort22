public class Main {
    public static void main(String[] args) {
        Chair wheelChair = new Chair(20, "wheel chair", 2017);
        Chair wheelChair2 = new Chair(20, "wheel chair", 2018);
        Chair gamerChair = new Chair(50, "gamer chair", 2022);

        System.out.println(wheelChair.equals(wheelChair2));
        System.out.println(wheelChair.hashCode());
    }
}