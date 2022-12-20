package model;

public class Orange {
    private int diameter;
    public Orange(){
        int minDiameter = 7;
        int maxDiameter = 15;
        diameter = minDiameter + (int)(Math.random()*(maxDiameter+1-minDiameter));
    }

    @Override
    public String toString() {
        return "Orange{" +
                "diameter=" + diameter +
                '}';
    }
//перегрузка методов
    // когда внутри класса методы с одним именем
    // - overload, нужно, чтобы были разные сигнатуры



}
