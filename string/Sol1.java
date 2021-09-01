package sda.string;

/*
Napisz program, który:
- Pobierze od użytkownika tekst
- Zastapi w pobranym tekscie wszystkie wystapienia litery 'a'  na literą 'b'.
 */

import java.util.Scanner;

public class Sol1 {
    public static void main(String[] args) {
        //utworzyć obiekt scannera
        Scanner userInput = new Scanner(System.in);
        //Pobranie Stringa przez usera
        String userString = userInput.nextLine();
        //Zastąpić w stringu userStrin a na b
        String newString = userString.toLowerCase().replace('a', 'b');
        //Wyświetlic zastąpiony tekst
        System.out.println(newString);
    }
}
