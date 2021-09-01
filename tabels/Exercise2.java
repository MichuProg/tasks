package sda.tables;

/*
Napisz program w którym:
 - zadeklarujesz tablicę typu String
 - przypiszesz wybrane przez Ciebie wartości w danej tablicy
 - wyświetlisz stan tablicy w konsoli przed sortowaniem
 - posortujesz tablicę rosnąco
 - wyświetlisz stan tablicy po sortowaniu
 */

import java.util.Arrays;
public class Exercise2 {
    public static void main(String[] args) {
        String []tab = new String[]{"yo", "hej", "elo", "witaj", "eloo"};
        for (int i=0; i<tab.length; i++) {
            System.out.println(tab[i]);
        }

        Arrays.sort(tab);
        System.out.println("Posortowane");
        for (String element : tab) {
            System.out.println(element);
        }
    }
}