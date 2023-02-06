import java.time.LocalDate;

public class Violin {
    private String masterName;
    private LocalDate dateOfManufactoring;

    public String getMasterName() {
        return masterName;
    }

    public LocalDate getDateOfManufactoring() {
        return dateOfManufactoring;
    }

    @Override
    public String toString() {
        return "Violin{" +
                "masterName='" + masterName + '\'' +
                ", dateOfManufactoring=" + dateOfManufactoring +
                '}';
    }

    public Violin(String masterName, LocalDate dateOfManufactoring) {
        this.masterName = masterName;
        this.dateOfManufactoring = dateOfManufactoring;
    }
}
