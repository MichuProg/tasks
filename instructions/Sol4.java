package sda.instructions;

/*
Napisz program, który:
- Przyjmuje jako parametr liczbę
- Jeżeli liczba znajduje się w przedziale (−15,12]∪(14,17)∪[19,+∞), użytkownik otrzymuje komunikat tekstowy o nazwie TRUE
- Jeżeli liczba nie jest w przedziale to wyświetla wartość FALSE (Wielkość liter ma znaczenie)

Okrągłe nawiasy - nie zaliczają się do zakresu
Kwadratowe nawiasy - zaliczają się do zakresu
 */

import java.util.Scanner;

public class Sol4 {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        System.out.print("Wprowadź liczbę do sprawdzenia: ");
        int num = sc.nextInt();

        String positive = "TRUE";
        String negative = "FALSE";

        if (num > -15 && num <= 12) {
            System.out.println(positive);
        } else if (num > 14 && num < 17) {
            System.out.println(positive);
        } else if (num >= 19) {
            System.out.println(positive);
        } else {
            System.out.println(negative);
        }
    }
}
