package model;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        String nullDay = String.valueOf(day);// из int сделали String
        String nullMonth = String.valueOf(month);
//        int x = Integer.parseInt("9");        // из строки сделать  int
//        double y = Double.parseDouble("2.2"); // из строки сделать double
        if (day < 10) {
            nullDay = "0" + day;
        }
        if (month < 10) {
            nullMonth = "0" + month;
        }
//        return nullDay + " " + month + " " + year; // если без String.format()
        return String.format("%s_%s_%d", nullDay, nullMonth, year);
    }
}
