public class Park {
    private String title;
    private Dinosaur[] dinosaurs;

    // сигнатура метода = название метода + тип возвращаемого значения + типы параметров, которые принимает
    public Dinosaur findDinoByName(String name) {
        for (int i = 0; i < dinosaurs.length; i++) {
            if (name.equalsIgnoreCase(dinosaurs[i].getTitle())) {
                return dinosaurs[i];
            }
        }
        return new Dinosaur();
    }

    // напишите метод 1
    public void printAllByColor(String color) {
        // выведите в консоль всех динозавров с указанным цветом
        for (int i = 0; i < dinosaurs.length; i++) {
            if (dinosaurs[i].getColor().equalsIgnoreCase(color)) {
                System.out.println(dinosaurs[i]);
            }
        }
    }

    public Dinosaur[] getAllByColor(String color) { // сигнатура
        // нужно, чтобы метод возвращал массив из всех динозавров, указанного цвета
        int counter = 0; // считаем сколько удовлетворяющих условию динозавров
        for (int i = 0; i < dinosaurs.length; i++) {
            if (color.equalsIgnoreCase(dinosaurs[i].getColor())) {
                counter++;
            }
        }
        if (counter == 0) return null;
        Dinosaur[] dinosOfColor = new Dinosaur[counter];
        int index = 0; // будет показывать индекс, куда класть
//        for(int i = 0; i < dinosaurs.length; i++) {
//            if(color.equalsIgnoreCase(dinosaurs[i].getColor())){
//                dinosOfColor[index++] = dinosaurs[i]; // постинкремент
//            }
//        }
        // перепишем используя цикл for-each
        for (Dinosaur dino : dinosaurs) {
            if (color.equalsIgnoreCase(dino.getColor())) {
                dinosOfColor[index++] = dino;
            }
        }
        return dinosOfColor;
    }

    // когда получите массив динозавров в мейне - распечатайте его используя Arrays.toString()
    public Dinosaur findFlyingDynoByColor(String color) {
        for (int i = 0; i < dinosaurs.length; i++) {
            if (dinosaurs[i].getIsFlying() && color.equalsIgnoreCase(dinosaurs[i].getColor())) {
                return dinosaurs[i];
            }
        }
        return new Dinosaur(); // если не нашли вернули дефолтного
    }

    public void addDino(Dinosaur dino) {
        Dinosaur[] newDinos = new Dinosaur[dinosaurs.length + 1];
        for (int i = 0; i < dinosaurs.length; i++) {
            newDinos[i] = dinosaurs[i];
        }
        newDinos[dinosaurs.length] = dino;
        dinosaurs = newDinos;
    }

    public void removeDinoByName(String name) {
        int counter = 0;
        for (int i = 0; i < dinosaurs.length; i++) {
            if (name.equalsIgnoreCase(dinosaurs[i].getTitle())) {
                counter++;
            }
        }
        Dinosaur[] newDinos = new Dinosaur[dinosaurs.length - counter];
        int index = 0;
        for (int i = 0; i < dinosaurs.length; i++) {
            if (!name.equalsIgnoreCase(dinosaurs[i].getTitle())) { // 9!=10 - true ; !9==10 - true
                newDinos[index++] = dinosaurs[i];
            }
        }
        dinosaurs = newDinos;
    }

    public String toString() {
        String accumulator = "";
        for (int i = 0; i < dinosaurs.length; i++) {
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
