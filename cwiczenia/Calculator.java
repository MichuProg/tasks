package cwiczenia;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj dwie liczby");
        int a = userInput.nextInt();
        int b = userInput.nextInt();
        int c = 5;
        System.out.println("Dodawaie: " + addTwoNumbers(a, b));
        System.out.println("Wartosc absolutna: " + absoluteValue(a));
        System.out.println("Max: " + theBiggestValueFromThreNumbers(a, b, c));
        System.out.println(("Przeciwny znak: " +negativeValue(a)));
    }

    static int addTwoNumbers(int a, int b) {
        return (a + b);
    }

    static int absoluteValue(int a) {
        if (a < 0) {
            a = a * -1;
        }
        return (a);
    }

    static int theBiggestValueFromThreNumbers(int a, int b, int c) {
        if (a >= b && a >= c) {
            return (a);
        } else if (b >= a && b >= c) {
            return (b);
        } else
            return (c);
    }
    static int negativeValue(int a){
        return (-a);
    }
}
