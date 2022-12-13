public class Car extends Vehicle {
    private boolean isAllWheelDrive = false;
    private int numberOfWheels = 4;

    public Car(boolean isAllWheelDrive, int numberOfWheels,
               double speed, int capacity, double weight) {
        super(speed, capacity, weight);         // поля родителя через super
        this.isAllWheelDrive = isAllWheelDrive; // собственные поля через this
        this.numberOfWheels = numberOfWheels;
    }

    public Car() {
    }

    public boolean getIsAllWheelDrive() {
        return isAllWheelDrive;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String toString() {
        return String.format(
                "Wheels: %d All: %s Weight: %f Speed: %f Capacity: %d",
                numberOfWheels,
                isAllWheelDrive ? "yes" : "no",
                super.getWeight(),
                super.getSpeed(),
                super.getCapacity()
        );
    }

}
