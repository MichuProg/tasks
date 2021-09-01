package sda.cwiczenia.carsObjectExample;

import java.util.Objects;

public class Car {
    carName mark;
    String model;
    Integer price;
    Integer vMax;
    String registratinNumber;
    boolean firstOwner=true;
    CarOwner owner;

    public  enum carName{
        AUDI ("Audi"),
        BMW ("BMW"),
        LEXUS ("Lexus"),
        MERCEDES ("Mercedes Benz"),
        TOYOTA ("Toyota");

        private String fullCarName;

        carName(String fullCarName){
            this.fullCarName=fullCarName;
        }
        public String getFullCarName(){
            return fullCarName;
        }
    }

    public Car(carName mark, String model, String registratinNumber) {
        this.mark = mark;
        this.model = model;
        this.registratinNumber = registratinNumber;
    }

    public Car(carName mark, String model, String registratinNumber, Integer price) {
        this.mark = mark;
        this.model = model;
        this.registratinNumber = registratinNumber;
    }

    public Car(carName mark, String model, String registratinNumber, Integer price, Integer vMax) {
        this.mark = mark;
        this.model = model;
        this.registratinNumber = registratinNumber;
        this.price = price;
        this.vMax = vMax;
    }

    public Car(carName mark, String model, String registratinNumber, Integer price, Integer vMax, CarOwner owner) {
        this.mark = mark;
        this.model = model;
        this.registratinNumber = registratinNumber;
        this.price = price;
        this.vMax = vMax;
        this.owner = owner;
    }

    public void setOwner(CarOwner owner) {
        this.owner = owner;
    }

    public void setFirstOwner(boolean firstOwner) {
        this.firstOwner = firstOwner;
    }

    @Override
    public String toString() {
        return mark.getFullCarName();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Car elementcar = (Car) o;
        return Objects.equals(mark, elementcar.mark);
    }

    public boolean equalsModel(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Car elementcar = (Car) o;
        return Objects.equals(model, elementcar.model);
    }

    public void betweenMinAndMaxPrice(Car elementCar, int min, int max) {
        if (elementCar.price >= min && elementCar.price <= max) {
            System.out.println(elementCar.mark + " " + elementCar.registratinNumber);
        }
    }

    public boolean equalsMarkModelFirstOwner(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Car elementcar = (Car) o;
        return Objects.equals(mark, elementcar.mark) &&
                Objects.equals(model, elementcar.model) &&
                Objects.equals(firstOwner, elementcar.firstOwner);
    }
}
