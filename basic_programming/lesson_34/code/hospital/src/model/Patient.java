package model;

public class Patient extends Person {
    private int age;                 // возраст
    private String anamnesis;        // анамнез
    private MyDate dateOfCheckIn;    // дата приема
    private boolean isMale;          // пол

    private MyDate dateOfCheckOut;   // дата выписки
    private String treatment;        // назначенное лечение

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public Patient(int age, String anamnesis,
                   MyDate dateOfCheckIn, boolean isMale,
                   String textNameSecondName) {
        super(textNameSecondName);
        this.age = age;
        this.anamnesis = anamnesis;
        this.dateOfCheckIn = dateOfCheckIn;
        this.isMale = isMale;
    }

    @Override
    public String toString() {
        return "Patient " + firstName + " " + secondName +
                System.lineSeparator() +    // \n
                " age=" + age + "\n" +
                " anamnesis='" + anamnesis + '\'' + "\n" +
                " dateOfCheckIn=" + dateOfCheckIn + "\n" +
                " isMale=" + isMale + "\n" +
                " dateOfCheckOut=" + dateOfCheckOut + "\n" +
                " treatment='" + treatment + '\'' + "\n";
    }
}
