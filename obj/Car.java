package sda.obj;

class Vehicle {
    protected int year;
    protected String registrationPlate;

    public void setPlate(String plate){
        registrationPlate = plate;
    }
    public String getPlate(){
        return registrationPlate;
    }

}

public class Car extends Vehicle{
    //Pola
    private final String model;
    private final String type;
    private String color;
    private int vMax;
    private boolean isOpen = false;

    //Konstruktor
    public Car(String type, String model, int year, String color, int vMax) {
        this.model = model;
        this.type = type;
        this.color = color;
        this.vMax = vMax;
        this.year = year;
    }

    //Metody modelu pojazdu
    public String getModel() {
        return model;
    }

    //Metody marki pojazdu
    public String getType() {
        return type;
    }

    //Metody koloru pojazdu
    public void setColor(String col) {
        color = col;
    }

    public String getColor() {
        return color;
    }

    //Metody prędkości pojazdu
    public void setVMax(int kmh) {
        vMax = kmh;
    }

    public int getVMax() {
        return vMax;
    }

    //Metoda otwierająco/zamykająca samochód
    public void setDoors(boolean isCarOpen){
        isOpen = isCarOpen;
    }

    //Metoda sprawdzająca czy samochód jest zamknięty
    public void checkIsOpen() {
        if (isOpen) {
            System.out.println("Samochód otwarty.");
        } else {
            System.out.println("Samochód zamknięty.");
        }
    }
}

