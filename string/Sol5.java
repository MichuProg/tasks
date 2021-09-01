package sda.string;

/*
Napisz program, który:
- Pobierze od użytkownika tekst
- Wyświetli wpisany tekst wielkimi literami.
*/

import java.util.Scanner;

public class Sol5 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        String userString = userInput.nextLine();
        System.out.println(userString.toUpperCase());
    }
}
