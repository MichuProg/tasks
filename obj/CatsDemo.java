package sda.obj;

class Cat {

    //Pola klasy Cat
    String name;
    boolean isSleeping;

    //Metody klasy Cat

    //Metoda say() wyświetlająca dźwięk naszego kota
    public void say() {
        if (isSleeping) { //Jeżeli kot śpi to wydaje dźwięk "zzz"
            System.out.println("zzz");
        } else { //Jeżeli nie śpi to wydaje dźwię "meow
            System.out.println("meow");

            if (Math.random() > 0.5) { //metoda random() z klasy Math losuje pseudolosową liczbę z zakresu od 0 do 1
                isSleeping = true;
            }
        }
    }

    //Metoda budząca kota
    public void wakeUp() {
        isSleeping = false;
    }
}

public class CatsDemo {

    public static void main(String[] args) {

        Cat mruczek = new Cat(); // Tworzymy obiekt nowego kota
        mruczek.name = "Mruczek"; // Nadajemy kotu imię Mruczek

        for (int i = 0; i < 5; i++) { // Pętla wywołująca pięć razy metodę mówienia przez Mruczka
            mruczek.say(); // Mruczek mówi meow lub zzz zależenie od tego czy śpi czy nie
        }

        mruczek.wakeUp(); // Użycie metody budzącej naszego M

        mruczek.say(); //Użycie metody odpowiadającej za mówienie Mruczka
    }
}
