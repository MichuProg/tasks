package sda.cwiczenia;

import java.util.Random;
import java.util.Scanner;

public class LoopsBasic {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(10);
        Scanner scanner = new Scanner(System.in);
        boolean myFlag = true;

        while (myFlag) {
            System.out.println("Podaj liczbe z zakresu od 0-10: ");
            int x = scanner.nextInt();
            if (x == randomNumber) {
                System.out.println("Trafiles: ");
                System.out.println("Czy chcesz zagrac jeszcz raz? Wcisnij dowolna cyfre jesli Tak lub 0 jesli Nie");
                x = scanner.nextInt();
                if (x == 0) {
                    myFlag = false;
                } else {
                    randomNumber = new Random().nextInt(10);
                }
            } else {
                System.out.println(x > randomNumber ? "Twoj numer jest wiekszy" : "Twoj nr jest mniejszy");
                System.out.println("Nie trafiles: ");
            }
        }


    }
}
