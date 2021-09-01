package sda.types;

/*
Napisz program, który:
- Pobiera od użytkownika trzy liczby całkowite
- Zwraca wartość true w momencie kiedy tylko jedna wartość jest dodatnia.
Program na koniec powinien wyświetlić wartość true lub false.
*/

import java.util.Scanner;

public class Sol7 {
    public static void main(String[] args) {
        Scanner userNumbers = new Scanner(System.in);
        int firstNumber = userNumbers.nextInt();
        int secondNumber = userNumbers.nextInt();
        int thirdNumber = userNumbers.nextInt();

        boolean result = firstNumber > 0 && secondNumber <= 0 && thirdNumber <= 0 ||
                firstNumber <= 0 && secondNumber > 0 && thirdNumber <= 0 ||
                firstNumber <= 0 && secondNumber <= 0 && thirdNumber > 0;
        System.out.println(result);
    }
}
