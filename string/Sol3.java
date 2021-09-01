package sda.string;

import java.util.Scanner;

/*
Napisz program, który:

- Pobierze od użytkownika dowolny tekst
- Pobierze początkowy indeks dla nowego tekstu utworzonego z wpisanego wcześniej tekstu
- Pobierze końcowy indeks dla nowego tekstu utworzonego z wpisanego wcześniej tekstu
- Wyświetli w konsoli nowy tekst utworzony na podstawie starego tekstu

*/

public class Sol3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        int start = scanner.nextInt();
        int stop = scanner.nextInt() + 1;

        System.out.println(userString.substring(start, stop));
    }
}
