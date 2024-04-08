//Date.java
package model;

public class Date{
    private int month;
    private int day;
    private int year;

    public Date(int day, int month, int year){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString(){
        return "Dia: " + day + ", Mes: " + month + ", Año: " + year;
    }
}