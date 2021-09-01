package sda.types;

/*

Napisz program, który:
- Pobierze od użytkownika liczbę
- Sprawdzi czy wprowadzona wartość w konsolijest mniejsza niż 20 i większa niż 0.
- Program na koniec powinien wyświetlić wartość true lub false.

*/

import java.util.Scanner;

public class Sol6 {
    public static void main(String[] args) {
        // put your code here
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
        boolean result = number < 20 && number > 0;
        System.out.println(result);
    }
}