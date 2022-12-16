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
        MyDate date = patient.getDateOfCheckIn();   // здесь у нас хранится дата регистрации - т.е. объект класса MyDate
                                                    // нам нужно ее распотрошить - вытащить из нее значения
        int day = date.getDay();                    // получаем день из объекта класса MyDate
        int month = date.getMonth();                // получаем месяц
        int year = date.getYear();                  // получаем год
        patient.setDateOfCheckOut(new MyDate(day+1,month, year)); // создали новую дату
                                                    // и с помощью сеттера положили ее в поле пациента

        // Задание
        // сначала нужно получить данные из старой даты
        // создать новую дату с этими данными
        // положить ее при помощи сеттера в пациента

    }


}
