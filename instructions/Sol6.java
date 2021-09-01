package sda.instructions;

/*
Napisz program, który:
- Przyjmuje liczbę od użytkownika
- Sprawdza czy wprowadzona liczba jest parzysta
 */

import java.util.Scanner;

public class Sol6 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj liczbę naturalną: ");
        int givenNumber = userInput.nextInt();

        if (givenNumber % 2 == 0){
            System.out.println("Liczba parzysta");
        }
        else {
            System.out.println("Liczba nieparzysta");
        }
    }
}
