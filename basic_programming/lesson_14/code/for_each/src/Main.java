public class Main {
    public static void main(String[] args) {
        String[] familyMembers = {"mother", "father", "son", "daughter"};
        System.out.println("____for______");
        for(int i = 0; i < familyMembers.length; i++){
            System.out.print(familyMembers[i] + " "); // i - это счетчик
        }
        System.out.println();
        System.out.println("____for-each______");
        for(String element: familyMembers) {
            System.out.print(element + " ");  // element - это сам текущий элемент массива
        }
        System.out.println("____sum__for_each_____");
        int[] numbers = {1, 19, -18, 78};
        int x = sumOfArrayElements(numbers); // вызываем метод
        System.out.println(x); // распечатали
    }
    public static int sumOfArrayElements(int[] array){
      //ваше решение здесь
        int sumOfElements = 0;
        for(int element: array) {
            sumOfElements += element;
        }
        return sumOfElements;
        // решение ^
    }
}
