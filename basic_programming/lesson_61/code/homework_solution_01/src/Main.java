import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Hospital charite = new Hospital("Charite", 5);
        charite.register(new Patient(
                "Alexey Navalniy",
                "Poisoning",
                LocalDate.of(2020, 8, 22)));
        charite.register(new Patient(
                "Bobby Bland",
                "Old",
                LocalDate.of(2021, 8, 22)));
        charite.register(new Patient(
                "Michael Saakashvily",
                "Heart stroke",
                LocalDate.of(2021, 9, 22)));
        charite.register(new Patient(
                "Michael Schumacher",
                "Head injury",
                LocalDate.of(2019, 9, 22)));
        charite.register(new Patient(
                "Alisher",
                "Amnesia",
                LocalDate.of(2023, 2, 7)
        ));
        charite.register(new Patient(
                "Alisher",
                "Amnesia",
                LocalDate.of(2024, 2, 7)
        ));
        charite.tread();
        charite.tread();
        charite.tread();
        charite.tread();
        charite.tread();
        charite.tread();
    }
}