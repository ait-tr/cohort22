public enum Temperature {
    COLD(8, "как в холодильнике"),
    WARM(25, "самое жаркое питерское лето"),
    HOT(65, "как в сауне");
    int temp;
    String commentary;
    Temperature(int temp, String commentary){
        this.temp =temp;
        this.commentary = commentary;
    }
    public int getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "temp=" + temp +
                ", commentary='" + commentary + '\'' +
                '}';
    }
}
