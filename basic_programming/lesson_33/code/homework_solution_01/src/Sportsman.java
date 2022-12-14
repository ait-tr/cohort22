public abstract class Sportsman {
    private int age;
    private int experience;
    public void say(){
    }
    public int getAge(){
        return age;
    }
    public int getExperience(){
        return experience;
    }

    public Sportsman(int age, int experience){
        this.age = age;
        this.experience = experience;
    }

    public Sportsman(int age) {
        this.age = age;
    }
}
