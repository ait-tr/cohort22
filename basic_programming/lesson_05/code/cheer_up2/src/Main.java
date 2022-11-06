public class Main {

  public static void main(String[] args) {
    String name = "Ruslans";
    String name2 = "Mihail";
    cheerUp(name, name2);
  }

  public static void cheerUp(String argument, String argument2) {
    System.out.printf("Now %s is a friend of %s", argument, argument2);
  }
}