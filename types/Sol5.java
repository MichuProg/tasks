package sda.types;

/*
Napisz program, który:
- Pobierze od użytkownika liczbę
- Sprawdzi czy wprowadzona wartość w konsoli jest mniejsza niż 10.
- Program na koniec powinien wyświetlić wartość true lub false.
*/

import java.util.Scanner;

public class Sol5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int givenNumber = userInput.nextInt();
        boolean isLess = givenNumber < 10;
        System.out.println(isLess);
    }

}
