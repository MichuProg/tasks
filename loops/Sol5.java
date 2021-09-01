package sda.loops;

/*
Napisz program, który:
- Wyświetli pytanie "Czy chcesz wyjść z gry? (Wpisz quit)
- Pozwoli wprowadzić wpisany tekst przez użytkownika do programu
- Jeżeli użytkownik wpisze słowo "quit", wyświetl komunikat "Gra wyłączona!"
- Jeżeli użytkownik wpisze inne słowo, ma się pojawić ponownie pytanie czy chce wyjść z gry.
 */

import java.util.Scanner;

public class Sol5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        boolean quit = true;
        String userString;

        while(quit) {
            System.out.println("Czy chcesz wyjść z gry? (Wpisz quit, aby wyjść.)");
            userString = userInput.next().toLowerCase();
            if (userString.equals("quit")) {
                System.out.println("Gra wyłączona!");
                quit = false;
            }
        }
    }
}
