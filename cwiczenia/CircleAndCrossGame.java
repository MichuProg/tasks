package cwiczenia;

import java.util.Random;
import java.util.Scanner;

public class CircleAndCrossGame {
    public static void main(String[] args) {
        String[][] tabEmpty = new String[3][3];
        String[][] tabBasic = enteringACharacterIntoTheTable(tabEmpty);
        int counter =0;
        while (!doSomeoneWinAllMethodGruped(tabBasic)) {
            drawTheTable(tabBasic);
            int line=enteringLineOfXOrOCharacterIntoTheTable();
            int row=enteringRowsOfXOrOCharacterIntoTheTable();
            prohiitionOfRepetitionOfXTheSameStep(tabBasic, line, row);
            counter++;
            if (doSomeoneWinAllMethodGruped(tabBasic)) {
                break;
            }
            drawTheTable(tabBasic);
            if (counter==9){
                System.out.println("Brak zwyciezcy");
                break;
            }
            System.out.println("Ruch komputera ");
            line=new Random().nextInt(3);
            row= new Random().nextInt(3);
            prohiitionOfRepetitionOfOTheSameStep(tabBasic, line, row);
            counter++;
            if (doSomeoneWinAllMethodGruped(tabBasic)) {
                break;
            }
        }
    }

    static String[][] enteringACharacterIntoTheTable(String[][] tab) {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                tab[i][j] = "_";
            }
        }
        return (tab);
    }

    static int enteringLineOfXOrOCharacterIntoTheTable() {
        System.out.println("Podaj wiersz: ");
        Scanner scanner = new Scanner(System.in);
        return (scanner.nextInt() - 1);
    }

    static int enteringRowsOfXOrOCharacterIntoTheTable() {
        System.out.println("Podaj kolumne: ");
        Scanner scanner = new Scanner(System.in);
        return (scanner.nextInt() - 1);
    }

    static void drawTheTable(String[][] tab) {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }
    }

    static boolean doSomeoneWinLine(String[][] tab) {
        int sumOfXCharakterLine = 0;
        int sumOfOCharacterLine = 0;
        boolean win = false;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (tab[i][j].equals("x")) {
                    sumOfXCharakterLine++;
                } else if (tab[i][j].equals("o")) {
                    sumOfOCharacterLine++;
                }
            }
            if (sumOfXCharakterLine == 3 || sumOfOCharacterLine == 3) {
                win = true;
            } else {
                sumOfOCharacterLine = 0;
                sumOfXCharakterLine = 0;
                win = false;
            }
        }
        return (win);
    }

    static boolean doSomeoneWinRow(String[][] tab) {
        int sumOfXCharakterRow = 0;
        int sumOfOCharacterRow = 0;
        boolean win = false;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (tab[j][i].equals("x")) {
                    sumOfXCharakterRow++;
                } else if (tab[j][i].equals("o")) {
                    sumOfOCharacterRow++;
                }
            }
            if (sumOfXCharakterRow == 3 || sumOfOCharacterRow == 3) {
                win = true;
            } else {
                sumOfOCharacterRow = 0;
                sumOfXCharakterRow = 0;
                win = false;
            }
        }
        return (win);
    }

    static boolean doSomeoneWinDiagonal(String[][] tab) {
        boolean win = false;
        if (tab[0][0].equals("x") && tab[1][1].equals("x") && tab[2][2].equals("x")) {
            win = true;
        } else if (tab[0][2].equals("x") && tab[1][1].equals("x") && tab[2][0].equals("x")) {
            win = true;
        }
        if (tab[0][0].equals("o") && tab[1][1].equals("o") && tab[2][2].equals("o")) {
            win = true;
        } else if (tab[0][2].equals("o") && tab[1][1].equals("o") && tab[2][0].equals("o")) {
            win = true;
        }
        return (win);
    }

    static boolean doSomeoneWinAllMethodGruped(String[][] tab) {
        boolean win = false;
        if (doSomeoneWinLine(tab) || doSomeoneWinRow(tab) || doSomeoneWinDiagonal(tab)) {
            drawTheTable(tab);
            System.out.println("Line win" + doSomeoneWinLine(tab));
            System.out.println("Rows win" + doSomeoneWinRow(tab));
            System.out.println("Diagonal win " + doSomeoneWinDiagonal(tab));
            win = true;
        }
        return (win);
    }

    static String prohiitionOfRepetitionOfXTheSameStep(String[][] tabBasic, int line, int row) {
        boolean myFlag=true;
        while (myFlag) {
            if (tabBasic[line][row].equals("x") || tabBasic[line][row].equals("o")) {
                System.out.println("Nie mozesz nadpisac, podaj jeszcze raz ");
                line = enteringLineOfXOrOCharacterIntoTheTable();
                row = enteringRowsOfXOrOCharacterIntoTheTable();
            } else {
                myFlag=false;
            }
        }
        return (tabBasic[line][row]="x");
    }

    static String prohiitionOfRepetitionOfOTheSameStep(String[][] tabBasic, int line, int row) {
        boolean myFlag=true;
        while (myFlag) {
            if (tabBasic[line][row].equals("x") || tabBasic[line][row].equals("o")) {
                System.out.println("Nie mozesz nadpisac, podaj jeszcze raz ");
                line = new Random().nextInt(3);
                row = new Random().nextInt(3);
            } else {
                myFlag=false;
            }
        }
        return (tabBasic[line][row]="o");
    }

}