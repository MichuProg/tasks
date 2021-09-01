package sda.tables;

/*
Napisz program w którym:
 - zadeklarujesz tablicę typu liczbowego
 - przypiszesz wybrane przez Ciebie wartości w danej tablicy
 - wyświetlisz stan tablicy w konsoli przed sumowaniem
 - zsumujesz liczby w tablicy
 - podzielisz sumę przez długość tablicy
 - wyświetlisz wynik średniej liczb znajdujących się w tablicy
 */

public class Sol4 {
    public static void main(String[] args) {
        int[] arrOfInts = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100};
        int sum = 0;
        float avg;
        for (int val : arrOfInts) {
            System.out.println(val);
        }

        for (int val : arrOfInts ) {
            sum += val;
        }

        System.out.println(sum);


        avg = (float) sum / arrOfInts.length;

        System.out.println(avg);

    }
}
