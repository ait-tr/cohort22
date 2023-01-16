public class Dog {
    private String name;
    private boolean muzzleOn;
    private boolean dressedUp;
    private boolean isFed;

    public void putMuzzleOn(){
        muzzleOn = true;
    }
    public void dressUp(){
        dressedUp = true;
    }
    public void eat(){
        this.isFed = true;
    }
    public Dog(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", muzzleOn=" + muzzleOn +
                ", dressedUp=" + dressedUp +
                ", isFed=" + isFed +
                '}';
    }

    public void goForAWalk() throws GoForAWalkException {
        if(muzzleOn && dressedUp && isFed) {
            System.out.println("Успешная прогулка");
        } else {
            throw new GoForAWalkException(
                    String.format(
                            "Ошибка потому что: ошейник:%b одежда: %b сыта: %b",
                            muzzleOn,
                            dressedUp,
                            isFed)
            );
        }
    }

}
