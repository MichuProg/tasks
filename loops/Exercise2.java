package sda.loops;

/*
Napisz program, który:
- Pobiera od użytkownika liczbę
- Wyświetla liczby parzyste od 1 do pobranej od użytkownika liczby

(Przykład: Użytkownik wpisuje liczbę 4. Program ma wyświetlić liczbę 2 oraz 4)
 */

import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
     Scanner userInput = new Scanner(System.in);
     int number = userInput.nextInt();

    for (int i=2; i<=number; i+=2){
    System.out.println(i);
    }
    }
}
