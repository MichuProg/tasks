package sda.loops;

/*
Napisz program, który:

- Wyświetl informację: "Czy chcesz zwiększyć wynik o 1? (Wpisz tak lub nie)"
- Jeżeli użytkownik wpisze słowo tak, licznik ma zostać zwiększony o 1 i wyświetlony aktualny wynik.
- Jeżeli użytkownik wpisze słowo nie, program ma wyświetlić wynik i wyświetlić komunikat koniec gry.
- Jeżeli użytkownik wpisze jakikolwiek inne słowo wtedy ma wyświetlić ponownie pytanie i licznik ma zostać taki sam.
 */

import java.util.Scanner;

public class Sol6 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String userString;
        int score = 0;

        while (true) {
            System.out.print("Czy chcesz zwiększyć wynik? (Wpisz tak lub nie): ");
            userString = userInput.nextLine().toLowerCase();
            if(userString.equals("tak")) {
                score++;
            } else if (userString.equals("nie")) {
                System.out.println("Twój wynik to: " + score);
                System.out.println("Koniec gry!");
                break;
            }
        }

    }
}
