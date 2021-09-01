package sda.loops;

/*
Napisz program, który:

- Pobierze od użytkownika liczbę elementów do pobrania.
- Pozwoli wpisać taką samą liczbę różnych liczb jak liczba elementów podana wcześniej.
- Znajdzie najwyższą liczbę podzielną przez 4 i wyświetli ją na ekranie spośród tych liczb.

Liczba elementów do wpisania nie może być większa niż 1000.
Liczba wprowadzona jako pojedyńczy element nie może być większa niż 30000.

*/

import java.util.Scanner;

public class Sol7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maximumDivisible = 0;
        int input;
        System.out.print("Wpisz ilość liczb, które chcesz wprowadzić do programu: ");
        int sequenceSize = scan.nextInt();
        int i = 0;

        while (i < sequenceSize) {
            input = scan.nextInt();
            if (input % 4 == 0 && input > maximumDivisible) {
                maximumDivisible = input;
            }
            i++;
        }

        System.out.println("Najwyższa liczba podzielna przez 4 to: " + maximumDivisible);
    }
}
