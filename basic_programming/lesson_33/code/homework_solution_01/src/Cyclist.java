public class Cyclist extends Sportsman{
    public int asd;
    @Override
    public void say(){
        if(super.getExperience() > 3) {
            System.out.println("I am experienced rider!");
        } else {
            System.out.println("I am rider");
        }
    }

    public Cyclist(int age, int experience){
        super(age, experience);
    }
}
