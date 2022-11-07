public class Main {
    public static void main(String[] args) {
        // государство расщедрилось: всем женщинам, у кого 2 и более детей
        // и зарплата меньше 1200 евро мы выдадим пособие
        // если подходит под условия - то "Take your money"
        // если нет - "No money!"
        int mySalary = 1200;
        int myKids = 0;
        boolean isFemale = true; // является ли женщиной - это мы добавили дополнительное условие

        // && - и - истинно, когда оба условия истинны
        // || - или - истинно, когда хоть одно выполняется
        if (mySalary <= 1200 && myKids >= 2 && isFemale && myKids <= 4) {
            System.out.println("Take your money");
        } else {
            System.out.println("No money for you :( ");
        }
        // ну ладно, если у вас либо двое детей, либо зарплата низкая - все равно вам заплатим
        if (mySalary <= 1200 || myKids >= 2) {
            System.out.println("And you can still take your money. Because we generous");
        }

    }
}