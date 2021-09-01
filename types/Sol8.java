package sda.types;

/*
Napisz program, który:
- Pobiera od użytkownika  trzy liczby całkowite
- Zwraca wartość true w momencie suma dwóch z trzech liczb wyniesie 20.
Program na koniec powinien wyświetlić wartość true lub false.
*/

import java.util.Scanner;

public class Sol8 {
    public static void main(String[] args) {
        Scanner userNumber = new Scanner(System.in);
        int correctNumber = 20;
        int firstNumber = userNumber.nextInt();
        int secondNumber = userNumber.nextInt();
        int thirdNumber = userNumber.nextInt();

        // Rozwiązanie numer 1
        boolean result = firstNumber + secondNumber == correctNumber ||
                secondNumber + thirdNumber == correctNumber ||
                firstNumber + thirdNumber == correctNumber;

        System.out.println(result);

        // Rozwiązanie numer 2

//        boolean isFirstAndSecondTrue = fNum + sNum == 20;
//        boolean isThirdAndSecondTrue = tNum + sNum == 20;
//        boolean isThirdAndFirstTrue = tNum + fNum == 20;
//
//        System.out.println(isFirstAndSecondTrue || isThirdAndFirstTrue || isThirdAndSecondTrue);
    }
}
