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

public class Sol2 {
    public static void main(String[] args) {
        //put your code here
        //Rozwiązanie 1
        String[] stringArray = new String[] { "Mleko", "Jablko", "Banan", "Rower" };
        for (String element:stringArray) {
            System.out.print(element + " ");
        }
        Arrays.sort(stringArray);
        System.out.println();
        for (int x = 0; x < stringArray.length; x++ ){
            System.out.print(stringArray[x] + " ");
        }

        //Rozwiązanie 2
        String[] newTabOfStrings = new String[]{"Kot", "Lama", "Alpaka", "Borsuk"};

        for (String animal : newTabOfStrings) {
            System.out.print(animal + " ");
        }
        System.out.println();
        Arrays.sort(newTabOfStrings);

        for (String animal : newTabOfStrings) {
            System.out.print(animal + " ");
        }
    }
}
