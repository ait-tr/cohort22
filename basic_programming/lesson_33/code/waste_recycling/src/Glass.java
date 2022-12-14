public class Glass extends Waste {
    private String color;

    public Glass(String title, double weight, double volume, String color) {
        super(title, weight, volume);
        this.color = color;
    }
    @Override
    public void use() {
        System.out.printf(
                "Стекло %s цвет %s- отправляем на переработку стекла\n",
                super.getTitle(),
                color
                );
    }
}
