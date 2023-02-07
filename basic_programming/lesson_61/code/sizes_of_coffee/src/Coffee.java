public class Coffee {
    String name;
    Size size;
    String clientName;

    public Coffee(String name, Size size, String clientName) {
        this.name = name;
        this.size = size;
        this.clientName = clientName;
    }

    public double calculatePrice(){
        switch (size){
            case SMALL: {
                return 3;
            }
            case BIG: {
                return 4;
            }
            case MEDIUM:{
                return 3.5;
            }
            default:{
                return 5;
            }

        }
    }

    @Override
    public String toString() {
        return String.format("Кофе %s для %s по цене %.2f", name, clientName, calculatePrice());
    }
}
