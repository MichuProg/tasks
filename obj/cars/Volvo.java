package sda.obj.cars;

import sda.obj.Car;

public class Volvo {
    public static void main(String[] args) {
        Car volvo = new Car("Volvo", "V40", 2010, "Zielony", 220);

        //Wyświetlenie początkowego koloru naszego auta
        System.out.println("Kolor naszego samochodu to: " + volvo.getColor());
        //Zmiana naszego koloru auta
        volvo.setColor("Biały");
        //Wyświetlenie koloru auta po zmianie
        System.out.println("Kolor naszego samochodu po malowaniu to: " + volvo.getColor());

        //Wyświetlenie prędkości maksymalnej
        System.out.printf("Prędkość maksymalna naszego %s %s to: %d km/h%n", volvo.getType(), volvo.getModel(), volvo.getVMax());
        //Zmiana prędkości maksymalnej np po instalacji chipa
        volvo.setVMax(250);
        //Wyświetlenie prędkości maksymalnej po modyfikacji
        System.out.printf("Prędkość maksymalna naszego %s %s po modyfikacji to: %d km/h%n", volvo.getType(), volvo.getModel(), volvo.getVMax());

        //Sprawdzenie czy volvo jest otwarte
        volvo.checkIsOpen();
        //Otwarcie Volvo
        volvo.setDoors(true);
        //Sprawdzenie czy volvo jest otwarte
        volvo.checkIsOpen();


    }
}



