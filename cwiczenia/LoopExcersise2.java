package cwiczenia;

import java.util.Scanner;

public class LoopExcersise2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj co chcesz zrobic");
        System.out.println("a prostokat, b szachownice, c prostokat pusty w srodku, d trojkat prostokatny, e choinke, f x");
        String x = userInput.next();
        switch (x) {
            case "a" -> {
                System.out.println("Podaj pierwszy blok");
                int a = userInput.nextInt();
                System.out.println("Podaj drugi blok");
                int b = userInput.nextInt();
                System.out.println("Podaj znak");
                String sign = userInput.next();
                rectangle(a, b, sign);
            }
            case "b" -> {
                System.out.println("Podaj pierwszy blok");
                int a = userInput.nextInt();
                System.out.println("Podaj drugi blok");
                int b = userInput.nextInt();
                System.out.println("Podaj znak");
                String sign = userInput.next();
                System.out.println("Podaj drugi znak");
                String sign2 = userInput.next();
                chessboard(a, b, sign, sign2);
            }
            case "c" -> {
                System.out.println("Podaj pierwszy blok");
                int a = userInput.nextInt();
                System.out.println("Podaj drugi blok");
                int b = userInput.nextInt();
                System.out.println("Podaj znak");
                String sign = userInput.next();
                rectangleEmpty(a, b, sign);
            }
            case "d" -> {
                System.out.println("Podaj pierwszy blok");
                int a = userInput.nextInt();
                System.out.println("Podaj znak");
                String sign = userInput.next();
                triangle(a, sign);
            }
            case "e" -> {
                System.out.println("Podaj wysokosc choinki ");
                int a = userInput.nextInt();
                christmassTree(a);
            }
            case "f" -> {
                System.out.println("Podaj wysokosc X ");
                int a = userInput.nextInt();
                drawX(a);
            }
        }
    }

    static void rectangle(int a, int b, String sign) {
        boolean myFlag = true;
        int lineDown = 0;
        while (myFlag) {
            for (int i = 0; i < a; i++) {
                System.out.print(sign);
            }
            System.out.println();
            lineDown++;
            if (lineDown == b) {
                myFlag = false;
            }
        }
    }

    static void rectangleEmpty(int a, int b, String sign) {
        boolean myFlag = true;
        int lineDown = 0;
        while (myFlag) {
            if (lineDown == 0 || lineDown == b - 1) {
                for (int i = 1; i <= a; i++) {
                    System.out.print(sign);
                }
            } else {
                for (int i = 1; i <= a; i++) {
                    if (i == 1 || i == a) {
                        System.out.print(sign);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            lineDown++;
            if (lineDown == b) {
                myFlag = false;
            }
        }

    }

    static void chessboard(int a, int b, String sign, String sign2) {
        boolean myFlag = true;
        int lineDown = 0;
        if (a % 2 == 1) {
            System.out.println("Nie mozna stworzycszchowicy z nieparzysta liczba pol");
            myFlag = false;
        }
        while (myFlag) {
            for (int i = 0; i < a; i = i + 2) {
                System.out.print(sign + sign2);
            }
            System.out.println();
            lineDown++;
            if (lineDown == b) {
                myFlag = false;
            }
        }
    }

    static void triangle(int a, String sign) {
        boolean myFlag = true;
        int increasingNumber = 0;
        while (myFlag) {
            increasingNumber++;
            for (int i = 0; i < increasingNumber; i++) {
                System.out.print(sign);
            }
            System.out.println();
            if (a == increasingNumber) {
                myFlag = false;
            }
        }
    }

    static void christmassTree(int a) {
        boolean myFlag = true;
        int stars = 1;
        while (myFlag) {
            for (int i = 1; i < a; i++) {
                System.out.print(" ");
            }
            a--;
            for (int g = 0; g < stars; g++) {
                System.out.print("*");
            }
            stars = stars + 2;
            System.out.println();
            if (a == 0) {
                myFlag = false;
            }
        }
    }

    static void drawX(int a) {
        boolean myFlag = true;
        int emptySpace = 1;
        int temp = a;
        while (myFlag) {
            System.out.print("x");
            for (int i = 2; i < a; i++) {
                System.out.print(" ");
            }
            System.out.println("x");
            a = a - 2;
            for (int k = 0; k < emptySpace; k++) {
                System.out.print(" ");
            }
            emptySpace++;
            if (a == 1) {
                System.out.println("x");
                myFlag = false;
            }
        }

        myFlag = true;
        a = temp;
        int emptySpaceBeforeX = (a-1) /2;
        int emptySpaceAfterFirstX = 1;
        while (myFlag) {
            for (int i = 1; i < emptySpaceBeforeX; i++) {
                System.out.print(" ");
            }
            System.out.print("x");
            for(int i =1; i<=emptySpaceAfterFirstX; i++){
                System.out.print(" ");
            }
            emptySpaceAfterFirstX+=2;
            emptySpaceBeforeX=emptySpaceBeforeX-1;
            System.out.print("x");
            if (emptySpaceBeforeX<=0) {
                myFlag = false;
            }
            System.out.println();
        }

    }
}
