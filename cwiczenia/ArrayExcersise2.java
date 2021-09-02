package cwiczenia;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExcersise2 {
    public static void main(String[] args) {
        System.out.println("a znalezienie znaku w tabicy, b znalezienie w tablicy plus index, c przyjmujaca dowlona liczbe liczb i wyliczajaca z nich srednia");
        System.out.println("d Przyjmuje dowolna ilosc liczb i wylicza maximum, e) przyjmującą dowolną liczbę liczb i wyliczającą z nich minimum,\n" +
                "f) sprawdzającą czy w tablicy liczb występują duplikaty,\n" +
                "g) wypisującą elementy bez duplikatów z tablicy liczb,\n" +
                "h) wypisującą wspólne elementy z dwóch tablic znaków,\n" +
                "i) sprawdzającą czy dwie tablice liczb są takie same,\n" +
                "j) wypisującą odwróconą tablicę znaków (* i zwracającą ją),\n" +
                "k) * usuwającą element o danym indeksie z tablicy liczb i zwracającą mniejszą, nie\n" +
                "zawierajacą tego elementu,\n" +
                "l) zwracającą tablicę większą o nowy element dodany na jej końcu,\n" +
                "m) zliczającą liczbę wystąpień danego znaku w tablicy znaków,\n" +
                "n) przyjmującą tablicę znaków i zwracającą mniejszą, nie zawierającą konkretnego znaku,\n" +
                "o) ** przesuwajacą wszystkie zera na koniec tablicy liczb,\n" +
                "p) zwracającą różnicę między największą i najmniejszą z podanych liczb. ");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        switch (x) {
            case "a" -> {
                System.out.println("Wpisz w kodzie znak jaki chcesz znalesc");
                System.out.println(equals('c'));
            }
            case "b" -> {
                System.out.println("Zwraca index pierwszego wystapienia");
                String giveMeLetter = scanner.next();
                System.out.println(equalsAndIndexFromTable(giveMeLetter));
            }
            case "c" -> {
                System.out.println();
                System.out.println(average());
            }
            case "cc" -> {
                double result = averageWithNums(1, 5, 6, 8, 9);
                System.out.println(result);
            }
            case "d" -> {
                int result = max(3, 5, 6, 7, 3, 10, 5, 7);
                System.out.println(result);
            }
            case "e" -> {
                int result = min(4, 5, -3, -2, 5, 12);
                System.out.println(result);
            }
            case "f" -> equalsElementsCoparison(2, 5, 7, 3, 8, 9);
            case "g" -> writeElementsWithoutDuplicates(4, 5, 7, 3, 2, 1, 3, 9, 5);
            case "h" -> {
                char[] tab1 = new char[]{4, 5, 6, 3, 2, 2};
                char[] tab2 = new char[]{4, 7, 6, 9, 2, 2, 9};
                equalsElemetsCharFromTwoTable(tab1, tab2);
            }
            case "i" -> {
                int[] tab1 = new int[]{2, 6, 4, 8};
                int[] tab2 = new int[]{2, 4, 6, 8};
                System.out.println(Arrays.equals(tab1, tab2));
            }
            case "j" -> {
                char[] tab = new char[]{'z', 'k', 'y', 'v'};
                opossiteTableOfChar(tab);
            }
            case "k" -> {
                int[] tab1 = new int[]{3, 5, 8, 12, 4, 6, 5, 4, 3, 8, 9};
                System.out.println("Tablica ma " + tab1.length + " elementow, podaj który chcesz usunąc ");
                int elementToDelete = scanner.nextInt();
                for (int el : deleteElementOfSpecificIndex(tab1, elementToDelete)
                ) {
                    System.out.println(el);
                }
            }
            case "l" -> {
                int[] tab1 = new int[]{3, 5, 8, 12, 4, 6, 5, 4, 3, 8, 9};
                System.out.println("Podaj liczbe ktorachcesz dodac ");
                int numerToAdd = scanner.nextInt();
                for (int el :
                        pLusOneElementAtTheEndOfTable(tab1, numerToAdd)) {
                    System.out.println(el);
                }
            }
            case "m" -> {
                char[] tab = new char[]{'z', 'k', 'y', 'v', 'z', 'l', 'z'};
                char signToFind = 'z';
                System.out.println(howManyTimesSignRepets(tab, signToFind));
            }
            case "n" -> {
                char[] tab = new char[]{'z', 'k', 'y', 'v', 'z', 'l', 'z'};
                char singToDelete = 'y';
                for (char element :
                        tableWithoutSign(tab, singToDelete)) {
                    System.out.println(element);
                }
            }
            case "o" -> {
                int[] tab1 = new int[]{0, 5, 8, 12, 4, 6, 0, 4, 3, 8, 9, 0};
                for (int element :
                        sortingZeroToTheEndOfTable(tab1)) {
                    System.out.println(element);
                }
            }
            case "p" -> {
                int result = diferenceBetweenMaxAndMin(4, 5, -3, -2, 5, 12);
                System.out.println(result);

            }
            default -> throw new IllegalStateException("Unexpected value: " + x);
        }

    }

    static boolean equals(char letter) {
        char[] tableWitchChar = new char[]{'a', 'c', 'c', 'd'};
        boolean itIsEquals = false;
        for (int element : tableWitchChar) {
            char casting = (char) element;
            System.out.print(casting + " ");
            if (casting == letter) {
                itIsEquals = true;
            }
        }
        return (itIsEquals);
    }

    static int equalsAndIndexFromTable(String letter) {
        String[] tableWitchChar = new String[]{"a", "c", "c", "d"};
        int a = 0;
        boolean exit = true;
        for (int i = 0; i < tableWitchChar.length; i++) {
            System.out.println(tableWitchChar[i] + " ");
            if (tableWitchChar[i].equals(letter)) {
                a = i;
                exit = false;
                break;
            }
        }
        if (!exit) {
            return (a);
        } else {
            return (-1);
        }
    }

    static double average() {
        Scanner userInput = new Scanner(System.in);
        int[] table = new int[10];
        boolean myFlag = true;
        int i = 0;
        double sum = 0;
        int temp;
        double result = 0;
        while (myFlag) {
            System.out.println("Podaj liczbe ziom, jezeli chcesz zakonczyc program wcisnij 0 ");
            table[i] = userInput.nextInt();
            sum = sum + table[i];
            temp = table[i];
            result = sum / i;
            i++;
            if (temp == 0) {
                myFlag = false;
            }
        }
        return (result);
    }

    static double averageWithNums(int... nums) {
        System.out.println(nums.length);
        double sum = 0;
        double resultAverage;
        int i;
        for (i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        resultAverage = sum / i;
        return (resultAverage);
    }

    static int max(int... nums) {
        int max = nums[0];
        for (int num : nums) {
            if (max < num) {
                max = num;
            }
        }
        return (max);
    }


    static int min(int... nums) {
        int min = nums[0];
        for (int num : nums) {
            if (min > num) {
                min = num;
            }
        }
        return (min);
    }

    static void equalsElementsCoparison(int... nums) {
        boolean duplicates = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    if (i != j) {
                        System.out.println("Wystepuja duplikaty " + nums[j]);
                        duplicates = true;
                    }
                }
            }
        }
        if (!duplicates) {
            System.out.println("Brak duplikatow");
        }
    }

    static void writeElementsWithoutDuplicates(int... nums) {
        boolean duplicates = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    if (i != j) {
                        duplicates = true;
                    }
                }
            }
            if (!duplicates) {
                System.out.println(nums[i]);
            } else {
                duplicates = false;
            }
        }
    }

    static void equalsElemetsCharFromTwoTable(char[] tab1, char[] tab2) {
        for (int elTab1 : tab1) {
            for (int elTab2 :
                    tab2) {
                if (elTab1 == elTab2) {
                    System.out.println(elTab1);
                }
            }
        }
    }

    static char[] opossiteTableOfChar(char[] tab1) {
        char[] tabOpossite = new char[tab1.length];
        int j = 0;
        for (int i = tab1.length - 1; i >= 0; i--) {
            tabOpossite[j] = tab1[i];
            j++;
        }
        for (int element :
                tabOpossite) {
            char charelement = (char) element;
            System.out.println(charelement);
        }
        return (tabOpossite);
    }

    static int[] deleteElementOfSpecificIndex(int[] tab1, int elementToDelete) {
        int[] tab2 = new int[tab1.length - 1];
        int j = 0;
        for (int i = 0; i < tab1.length; i++) {
            if (i != elementToDelete - 1) {
                tab2[j] = tab1[i];
                j++;
            }
        }
        return (tab2);
    }

    static int[] pLusOneElementAtTheEndOfTable(int[] tab1, int numberToAdd) {
        int[] tab2 = new int[tab1.length + 1];
        for (int i = 0; i < tab1.length; i++) {
            tab2[i] = tab1[i];
        }
        tab2[tab1.length] = numberToAdd;
        return (tab2);
    }

    static int howManyTimesSignRepets(char[] tab1, char singToFind) {
        int countingOfRepets = 0;
        for (char elementFromTab1 :
                tab1) {
            if (singToFind == elementFromTab1) {
                countingOfRepets++;
            }
        }
        return (countingOfRepets);
    }

    static char[] tableWithoutSign(char[] tab1, char signToDelete) {
        int howManyIndexDelete = 0;
        for (int el :
                tab1) {
            if (el == signToDelete) {
                howManyIndexDelete++;
            }
        }
        char[] tab2 = new char[tab1.length - howManyIndexDelete];
        int j = 0;
        for (char c : tab1) {
            if (c != signToDelete) {
                tab2[j] = c;
                j++;
            }
        }
        return (tab2);
    }

    static int[] sortingZeroToTheEndOfTable(int[] tab1) {
        int countingZero = 0;
        int j = 0;
        int[] tab2 = new int[tab1.length];

        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] != 0) {
                tab2[j] = tab1[i];
                j++;
            } else {
                countingZero++;
            }
        }
        while (countingZero == 0) {
            tab2[j] = 0;
            j++;
            countingZero--;
        }
        return (tab2);
    }

    static int diferenceBetweenMaxAndMin(int... nums) {
        int resultMinn = min(nums);
        int resultMaxx = max(nums);
        return (resultMaxx-resultMinn);
    }
}
