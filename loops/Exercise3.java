package sda.loops;

/*
Napisz program, który:
- Program pobiera od użytkownika liczbę całkowitą
- Wyświetla liczby podzielne przez 6
- Wyświetla po zakończeniu pętli sumę liczb podzielnych przez 6
 */

import  java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
        int sum = 0;
        for( int i = 6; i<=number; i+=6) {
            if (i % 6 == 0) {
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("Suma liczb podzielnych przez 6 " +sum);

    }
}



