public class Plastic extends Waste {
    private String marking;

    public Plastic(String marking, String title, double weight, double volume) {
        super(title, weight, volume);
        this.marking = marking;
    }

    @Override
    public void use() {
        System.out.printf(
                "Пластик %s с маркировкой %s - отправляем на переработку пластика\n",
                super.getTitle(),
                marking
        );
    }

}
