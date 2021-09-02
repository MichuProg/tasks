package string;

/*
Napisz program, który:
- Pobierze od użytkownika tekst
- Wyświetli wpisany tekst małymi literami.
*/

import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String wczytane = scanner.nextLine();
        System.out.println(wczytane.toLowerCase());
    }
}