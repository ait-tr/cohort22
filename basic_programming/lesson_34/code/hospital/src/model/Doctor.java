package model;

public class Doctor extends Person {
    private String specialty;
    private int experience;

    public Doctor(String specialty, int experience, String text) {
        super(text);
        this.specialty = specialty;
        this.experience = experience;
    }

    public void tread(Patient patient) {
        patient.setTreatment("Ушиб верхнего изгиба нижней полости мочевины," +
                " лечить приемом ибупрофена по 6 таблеток перед сном");
        // сначала нужно получить данные из старой даты
        // создать новую дату с этими данными
        // положить ее при помощи сеттера в пациента

    }


}
