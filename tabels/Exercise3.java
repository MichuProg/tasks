package sda.tables;

/*
Napisz program w którym:
 - zadeklarujesz tablicę typu liczbowego
 - przypiszesz wybrane przez Ciebie wartości w danej tablicy
 - wyświetlisz stan tablicy w konsoli przed sumowaniem
 - zsumujesz liczby w tablicy
 - wyświetlisz wynik sumowania liczb
 */
import java.util.Arrays;
public class Exercise3 {
    public static void main(String[] args) {
        int []tab = new int[]{3,5,7,4,8,2};

        for(int el : tab) {
            System.out.print(el+" ");
        }
        System.out.println();
        System.out.println(Arrays.stream(tab).sum());
    }
}

