package sda.loops;

/*
Napisz program, który:
- Pobiera od użytkownika liczbę
- Wyświetla liczby parzyste od 1 do pobranej od użytkownika liczby

(Przykład: Użytkownik wpisuje liczbę 4. Program ma wyświetlić liczbę 2 oraz 4)
 */

import java.util.Scanner;

public class Sol2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Wprowadż liczbę: ");
        int userNumber = userInput.nextInt();

        for (int x = 1; x <= userNumber; x++) {
            if (x % 2 != 1) {
                System.out.println(x);
            }
        }
    }
}
