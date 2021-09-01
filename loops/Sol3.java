package sda.loops;

/*
Napisz program, który:
- Program pobiera od użytkownika liczbę całkowitą
- Wyświetla liczby podzielne przez 6
- Wyświetla po zakończeniu pętli sumę liczb podzielnych przez 6
 */

import java.util.Scanner;

public class Sol3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Wprowadź liczbę: ");
        int countNum = userInput.nextInt();
        int sum = 0;

        for (int i = 1; i <= countNum; i++) {
            if (i % 6 == 0) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println("Suma liczb podzielnych przez 6 wynosi: " + sum);
    }
}
