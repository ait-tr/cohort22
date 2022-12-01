public class Main {
    public static void main(String[] args) {
        String text = "People can say what they want, but it is a wonderful world";
        // "PeoplE caN saY whaT theY wanT, buT iT iS a wonderfuL worlD";
        System.out.println(endsToUpper(text));
        System.out.println(endsToUpper2(text));
    }

    public static String endsToUpper2(String text) {
        String[] arr = text.split(" "); // {"People", "can", "say", "what"...}
        for(int i = 0; i < arr.length; i++) {
            String firstPart = arr[i].substring(0, arr[i].length()-1);
            String secondPart = arr[i].substring(arr[i].length()-1);
            arr[i] = firstPart + secondPart.toUpperCase();
        }
        // после цикла массив мутировал {"PeoplE", "caN", "saY", "whaT"...}
        return String.join(" ", arr); // "PeoplE caN saY whaT...
    }

    public static String endsToUpper(String text) {
        String[] arr = (text + " ").split(""); // {"P", "e", "o", "p" ...}
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1].equalsIgnoreCase(" " ) || arr[i+1].equalsIgnoreCase("," )) { //  // если еще добавить перед запятой
                arr[i] = arr[i].toUpperCase();
            }
        }
        return String.join("", arr);
    }
}

//                System.out.println(9 +"\s"+ 10);
//                System.out.println(9 +"\n"+ 10);
//                System.out.println(9 +"\t"+ 10);