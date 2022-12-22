public class Main {
    public static void main(String[] args) {
        CustomArrayList names = new CustomArrayList();
        names.add("bob1");
        names.add("bob2");
        names.add("bob3");

        System.out.println(names);
        System.out.println(names.size());
        names.removeByIndex(1);
        System.out.println(names);
        // [bob1, bob3, null, null ...]
    }
}