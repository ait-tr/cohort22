public class Main {
    public static void main(String[] args) {

     // {"Step 75", "Step 74", "Step 73",..., "Step 10", "Step 9"}

        System.out.println("_____Посчитали длинну будущего массива____");
        int count = 0;
        for(int i = 75; i >= 9; i--){
            System.out.print ("Step " + i + " ");
            System.out.println("Count "+ count);
            count++;
        }
        System.out.println("Длинна будет такая: " + count);
        System.out.println("_____Создаем массив нужной длины____");
        String[] steps = new String[count]; // в нем пока только null

        System.out.println("_____Заполняем массив____");
        int value = 75; // переменная для значения
        for(int i = 0; i < steps.length; i++) {
            steps[i] = "Step " + value; //
            value--;
        }
        System.out.println("_____Смотрим что получилось через print____");

        for(int i = 0; i < steps.length; i++){
            System.out.println(steps[i]);
        }

    }
}