package cwiczenia;

import java.util.Scanner;

public class CalculatorSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Dodawanie \n2.Wartos bezwzgedna \n3.Najwieksza z 3 liczb \n4.Odwrony znak");
        System.out.println("Podaj co chcesz zrobic: ");
        int a;
        int b;
        int c;
        int x = scanner.nextInt();
        switch (x) {
            case 1 -> {
                System.out.println("Wybrales dodwanie, podaj dwie liczby");
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println(addTwoNumbers(a, b));
            }
            case 2 -> {
                System.out.println("Wybrales wartosc bezwzgledna, podaj liczbe ");
                a = scanner.nextInt();
                System.out.println(absoluteValue(a));
            }
            case 3 -> {
                System.out.println("Wybrales max, podaj 3 liczby");
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
                System.out.println(max(a, b, c));
            }
            case 4 -> {
                System.out.println("Wybrales dwrocony znak ");
                a = scanner.nextInt();
                System.out.println(opossiteChar(a));
            }
            default -> System.out.println("Wybrales nieprawidlowy numer ");
        }
    }

    static int addTwoNumbers(int a, int b) {
        return (a + b);
    }

    static int absoluteValue(int a) {
        if (a < 0) {
            return (-a);
        } else {
            return (a);
        }
    }

    static int max(int a, int b, int c) {
        if (a >= b && a >= c) {
            return (a);
        } else if (b >= a && b >= c) {
            return (b);
        } else
            return (c);
    }

    static int opossiteChar(int a){
        a=-a;
        return (a);
    }

}
