package cwiczenia;

import java.util.Scanner;

public class IfExcersisie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me number");
        int number = scanner.nextInt();
        ifs(number);
        ifGood(number);

    }

    static void ifs(int x) {
        if (x % 2 == 0) {
            System.out.println("Liczba parzysta");
        }
        if (x % 2 > 0) {
            System.out.println("Liczba nieparzysta");
        }
    }

    static void ifGood(int x) {
        if (x % 2 == 0) {
            System.out.println("Dobra liczba parzysta");
        } else {
            System.out.println("Dobra liczba nieparzysta");
        }
    }
}
