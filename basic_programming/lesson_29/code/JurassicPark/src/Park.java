public class Park {
    private String title;
    private Dinosaur[] dinosaurs;

    // сигнатура метода = название метода + тип возвращаемого значения + типы параметров, которые принимает
    public Dinosaur findDinoByName(String name){
        for(int i = 0; i < dinosaurs.length; i++){
            if (name.equalsIgnoreCase(dinosaurs[i].getTitle())){
               return dinosaurs[i];
            }
        }
        return new Dinosaur();
    }
    // напишите метод 1
    public void printAllByColor(String color) {
        // выведите в консоль всех динозавров с указанным цветом

    }
    public Dinosaur[] getAllByColor(String color) {
        // нужно, чтобы метод возвращал массив из всех динозавров, указанного цвета
        return new Dinosaur[0];
    }
    // когда получите массив динозавров в мейне - распечатайте его используя Arrays.toString()

    // напишите метод findFlyingDynoByColor(String color)
    // и будет возвращать первого попавшегося динозавра
    public Dinosaur findFlyingDynoByColor(String color){
        for(int i = 0; i < dinosaurs.length; i++){
            if (dinosaurs[i].getIsFlying() && color.equalsIgnoreCase(dinosaurs[i].getColor())){
                return dinosaurs[i];
            }
        }
        return new Dinosaur(); // если не нашли вернули дефолтного
    }

    public String toString(){
        String accumulator = "";
        for(int i = 0; i < dinosaurs.length; i++ ){
            accumulator = accumulator + " " + dinosaurs[i];
        }
        return String.format("Park: %s\n%s", title, accumulator);
    }
    public Park(String title, Dinosaur[] dinosaurs) {
        this.title = title;
        this.dinosaurs = dinosaurs;
    }

    private String getTitle() {
        return title;
    }

    public Dinosaur[] getDinosaurs() {
        return dinosaurs;
    }

    public void setDinosaurs(Dinosaur[] dinosaurs) {
        this.dinosaurs = dinosaurs;
    }
}
