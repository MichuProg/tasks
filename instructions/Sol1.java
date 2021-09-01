package sda.instructions;

/*
Napisz program, który:
- Przyjmuje liczbę od użytkownika.
- Jeżeli liczba otrzymana od użytkownika jest dodatnia, program wyświetli w konsoli słowo YES,
- Jeżeli liczba otrzymana od użytkownika jest zerowa lub ujemna, program wyświetliw konsoli słowo NO.

 */

import java.util.Scanner;

public class Sol1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int firstNumber = userInput.nextInt();
        if (firstNumber > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
