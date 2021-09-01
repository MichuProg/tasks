package sda.tables;

/*
Napisz program w którym:
 - zadeklarujesz tablicę typu liczbowego
 - przypiszesz wybrane przez Ciebie wartości w danej tablicy
 - wyświetlisz stan tablicy w konsoli przed sumowaniem
 - zsumujesz liczby w tablicy
 - wyświetlisz wynik sumowania liczb
 */

public class Sol3 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i : myArray)
            sum += i;
        System.out.println("Suma liczb w tablicy to: " + sum);
    }

}
