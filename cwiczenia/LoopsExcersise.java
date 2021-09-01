package sda.cwiczenia;

import java.util.Scanner;

public class LoopsExcersise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz zadanie, wcisnij a, b, c, d, e, f, g, h lub i");

        String excersise;
        excersise = scanner.next();
        switch (excersise) {
            case "a" -> {
                System.out.println("Podaj mniejsza liczbe z przedzialu: ");
                int a = scanner.nextInt();
                System.out.println("Podaj wieksza liczbe z przedzialu: ");
                int b = scanner.nextInt();
                System.out.println(numbersFromCompartment(a, b));
            }
            case "b" -> {
                System.out.println("Podaj promień okregu");
                int r = scanner.nextInt();
                System.out.println("Pole koła o promieniu " + r + " wynosi " + circle(r));
            }
            case "c" -> {
                System.out.println("Podaj dlugosc przyprostokątnej");
                int przyprostokanaFirst = scanner.nextInt();
                System.out.println("Podaj dlugosc przyprostokątnej");
                int przyprostokanaSecond = scanner.nextInt();
                System.out.println(rectangle(przyprostokanaFirst, przyprostokanaSecond));

            }
            case "d" -> {
                System.out.println("Podaj liczbe");
                int a = scanner.nextInt();
                firstNumber(a);
            }
            case "e" -> {
                System.out.println("Podaj liczbe poczatkowa");
                int firstNumber = scanner.nextInt();
                System.out.println("Podaj ostatni element");
                int lastEl = scanner.nextInt();
                System.out.println("Podaj step");
                int step = scanner.nextInt();
                arythmetical(firstNumber, lastEl, step);
            }
            case "f" -> {
                System.out.println("Podaj poczatek zakresu");
                int beginRange = scanner.nextInt();
                System.out.println("Podaj koniec zakresu");
                int endRange = scanner.nextInt();
                System.out.println("Podaj liczbe przez którą chcesz podzielic");
                int numberForDivide = scanner.nextInt();
                rangeToDivide(beginRange, endRange, numberForDivide);
            }
            case "g" -> {
                System.out.println("Podaj liczbę, z której bedzie liczona silnia");
                int a = scanner.nextInt();
                System.out.println(strongMathematic(a));
            }
            case "h" -> {
                System.out.println("Podaj ilosc elementow ciagu Fibonaciego");
                int a = scanner.nextInt();
                fibonaci(a);
            }
            case "i" -> {
                alphabet();
            }
            default -> throw new IllegalStateException("Unexpected value: " + excersise);
        }

    }

    static int numbersFromCompartment(int a, int b) {
        int sum = 0;
        for (int x = a; x <= b; x++) {
            sum += x;
        }
        return (sum);
    }

    static double circle(int r) {
        return (Math.PI * r * r);
    }

    static double rectangle(int a, int b) {
        double c = Math.pow(a, 2) + Math.pow(b, 2);
        c = Math.sqrt(c);
        return (c);
    }

    static void firstNumber(int a) {
        int sum = 0;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                sum += 1;
            }
        }
        System.out.println(sum==1? "Liczba jest pierwsza" : "Liczba nie jest pierwsza");
    }

    static void arythmetical(int firstNumber, int lastEl, int step) {
        int element = firstNumber;
        System.out.println(element);
        for (int i = firstNumber; i < lastEl; i++) {
            System.out.println(element = element + step);
        }

    }

    static void rangeToDivide(int begineRange, int endRange, int numberToDivide) {
        for (int i = begineRange; i <= endRange; i++) {
            if (i % numberToDivide == 0) {
                System.out.println(i);
            }
        }
    }

    static int strongMathematic(int a) {
        int sum = 1;
        for (int i = a; i >= 1; i--) {
            sum = sum * i;
        }
        return (sum);
    }

    static void fibonaci(int a) {
        if (a == 0) {
            System.out.println("0 elementow");
        } else if (a == 1) {
            System.out.println("jest " + 0);
        }
        int variable1 = 0;
        int variable2 = 1;
        int variable3;
        System.out.println(variable1);
        System.out.println(variable2);
        for (int i = 2; i < a; i++) {
            variable3 = variable1 + variable2;
            if (variable1 <= variable2) {
                variable1 = variable3;
            } else {
                variable2 = variable3;
            }
            System.out.println(variable3);
        }
    }

    static void alphabet(){
        for (char i=97; i<=122; i++){
            System.out.print(" " + i);
        }
    }

}
