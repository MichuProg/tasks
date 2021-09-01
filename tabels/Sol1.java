package sda.tables;

/*
Napisz program w którym:
 - zadeklarujesz tablicę typu liczbowego
 - przypiszesz wybrane przez Ciebie wartości w danej tablicy
 - wyświetlisz stan tablicy w konsoli przed sortowaniem
 - posortujesz tablicę rosnąco
 - wyświetlisz stan tablicy po sortowaniu
 */

import java.util.Arrays;

public class Sol1 {
    public static void main(String[] args) {
        int[] newArray;
        newArray = new int[] {110, 0, 15, 55, 1};
        for (int el:newArray) {
            System.out.print(el + " ");
        }

        Arrays.sort(newArray);

        System.out.println();
        for (int el:newArray) {
            System.out.print( el + " ");
        }
    }
}
