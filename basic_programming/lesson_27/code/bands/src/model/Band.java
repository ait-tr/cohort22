package model;

public class Band {
    private String title;
    private Musician[] musicians;

    public String getTitle() {
        return title;
    }

    public Musician[] getMusicians() {
        return musicians;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMusicians(Musician[] musicians) {
        this.musicians = musicians;
    }

    public Band(String title, Musician[] musicians) {
        this.title = title;
        this.musicians = musicians;
    }

    //тип возр.  // имя метода
    public Musician getOldestMember() {
        Musician oldest = musicians[0];
        for (int i = 0; i < musicians.length; i++) {
            if (musicians[i].getAge() > oldest.getAge()) {
                oldest = musicians[i];
            }
        }
        return oldest;
    }

    public void addMusician(Musician newMusician) {
        Musician[] newArr = new Musician[musicians.length + 1];
        for (int i = 0; i < musicians.length; i++) {
            newArr[i] = musicians[i];
        }
        newArr[musicians.length] = newMusician;
        this.musicians = newArr;
    }

    public String toString() {
        String musiciansStr = "";
        for (int i = 0; i < musicians.length; i++) {
            musiciansStr = musiciansStr + " " + musicians[i].toString();
        }
        return "Band name: " + title.toUpperCase() + "\n" + "Participants: \n" + musiciansStr;
    }


}
