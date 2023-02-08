import java.time.LocalDate;

public class Patient implements Comparable<Patient>{
    private String name;
    private String anamnes;
    private LocalDate registrationDate;

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Patient o) {
        return registrationDate.compareTo(o.registrationDate);
    }

    public Patient(String name, String anamnes, LocalDate registrationDate) {
        this.name = name;
        this.anamnes = anamnes;
        this.registrationDate = registrationDate;
    }
}
