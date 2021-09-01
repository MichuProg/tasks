package sda.instructions;

/*
Napisz program, który przyjmuje jako parametr rok z zakresu 1900 - 3000 a następnie sprawdza czy rok jest przestępny czy nie.
Jeżeli rok jest jest przestępny to program w konsoli jako wynik powinien wyświetlić słowo "Przestępny".
Jeżeli rok jest nie jest przestępny to program w konsoli jako wynik powinien wyświetlić słowo "Zwykły".
Jeżeli rok jest z poza zakresu 1900 - 3000 wyświetl komunikat o podaniu roku z poza zakresu

Dla przypomnienia:

Rok jest przestępny, gdy jest podzielny przez 4 i nie jest podzielny przez 100
lub jest podzielny przez 400. Np. 2012, 1996, 2000 to lata przestępne, natomiast 1900, 2001, 1998 nie są przestępne.

Na przykład rok 2000 jest przes†epny natomiast rok 2100 już nim nie jest.
 */

import java.util.Scanner;

public class Sol5 {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        System.out.print("Wprowadź rok: ");
        int year = sc.nextInt();

        if (year >= 1900 && year <= 3000) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                System.out.println("Przestępny");
            } else {
                System.out.println("Zwykły");
            }
        } else {
            System.out.println("Podano rok z poza zakresu!");
        }
    }
}
