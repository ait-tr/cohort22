public class Skier extends Sportsman{
    private boolean isMountain;
    public Skier(int age, int experience, boolean isMountain) {
        super(age, experience);
        this.isMountain = isMountain;
    }
    @Override
    public void say(){
        if(getExperience() > 3 && isMountain) {
            System.out.println("I am an experienced mountain skier.");
        } else if (getExperience() > 3) {
            System.out.println("I am an experienced skier.");
        } else {
            System.out.println("I am skier.");
        }
    }
}
