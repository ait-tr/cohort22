public class Dinosaur {
    private String title;
    private boolean isCarnivor; //  хищный
    private boolean isFlying;   //  летающий или нет
    private double height;
    private String color = "green"; // Можем указать значение по умолчанию. Присваивается до конструктора.

    public Dinosaur(String title, boolean isCarnivor, boolean isFlying, double height, String color) {
        this.title = title;
        this.isCarnivor = isCarnivor;
        this.isFlying = isFlying;
        this.height = height;
        this.color = color;
    }

    public Dinosaur() {
    }

    public String toString() {
        return String.format(  // %s - String, %b - boolean, %d - int, %f - для чисел с точкой
                "Dino__%s______ \n  %s, %s, %.2fm, %s \n",
                // сделали простейшую проверку на null, чтобы он не выдавал ошибку.
                (title == null ? "not found" : title.toUpperCase()),
                (isCarnivor ? "carnivorous" : "vegan"),
                (isFlying ? "flying" : "not flying"),
                height,
                color
        );
    }

    public String getTitle() {
        return title;
    }

    public boolean getIsCarnivor() {
        return isCarnivor;
    }

    public boolean getIsFlying() {
        return isFlying;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsCarnivor(boolean carnivor) {
        isCarnivor = carnivor;
    }

    public void setIsFlying(boolean flying) {
        isFlying = flying;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
