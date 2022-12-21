package model;

public class OrangeTree {
    private double height;
    private int age;
    private Orange[] oranges = new Orange[0];

    public Orange[] getOranges(){
        return oranges;
    }

    public void passGrowingSeason() {

        age += 1;
        if (height < 25) {
            height += 2.5;
        }
        growOranges();
    }

    private void growOranges(){
        int numberOfOranges = 0;
        if (isMature() && !isDead()){
            int min = 100;
            int max = 300;
            numberOfOranges = min + (int)(Math.random()*(max+1-min));
        }
        oranges = new Orange[numberOfOranges];
        for(int i = 0; i < oranges.length; i++){
            oranges[i] = new Orange();
        }
    }

    public OrangeTree() {
        height = 0;
        age = 0;
    }

    public String toString() {
        return String.format(
                "Age: %d height: %.2f number of oranges: %d",
                age,
                height,
                oranges.length
        );
    }

    public boolean isDead() {
        return age > 100;
    }

    public boolean isMature(){
        return age > 6;
    }


}
