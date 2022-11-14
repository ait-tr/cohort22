public class Main {
    public static void main(String[] args) {
        // у султана 94 ребенка  -
        // чтобы не путать - он назвал их так:
        // "Kid 1", "Kid 2", "Kid 3" ... "Kid 94"
        // Создайте массив kids - с этими значениями
        int counter = 0;
        for(int i = 1; i<=94; i++) { // сколько элементов будет
            counter++;
        }
        // сверху опциональная часть
        System.out.println(counter);

        String[] kids = new String[counter];
        /* если бы писали вручную
        kids[0] = "kid 1";
        kids[1] = "kid 2";
        kids[2] = "kid 3";
         */
        for(int i = 1; i<=94; i++) {
//            System.out.println("Kid " + i); // печатаем то, что сами написали
            kids[i-1] = "Kid " + i; // записываем значение в массив по индексам
            System.out.println(kids[i-1]); // печатаем элементы массива
        }
    }
}