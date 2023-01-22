import java.util.HashSet;

public class HatCollection {
    String title;
    HashSet<Hat> hats = new HashSet<>();  // больше не null
    double totalValue;  // 0

    public void buyNewHat(Hat hat){
        if (hats.add(hat)){ // true или false
            totalValue += hat.getPrice();
        }
//        if(!hats.contains(hat)){    // второй вариант того, как можно было сделать
//            hats.add(hat);
//            totalValue += hat.getPrice();
//        }
    }

    public HatCollection(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "HatCollection{" +
                "title='" + title + '\'' +
                ", hats=" + hats +
                ", totalValue=" + totalValue +
                '}';
    }
}
