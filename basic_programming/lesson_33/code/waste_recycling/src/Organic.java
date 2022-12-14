public class Organic extends Waste {
    private int decompositionTime;

    public Organic(String title, double weight, double volume, int decompositionTime) {
        super(title, weight, volume);
        this.decompositionTime = decompositionTime;
    }

    @Override
    public void use() {
        System.out.printf(
                "%s отправляем в компостную кучу\n",
                super.getTitle()
        );
    }

}
