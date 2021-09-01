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

import java.util.Arrays;
class tabelka{
    //Pola
    int tabelaZKlassy;
    //konstruktor
    public tabelka(int mojaTabelaZKlassy){
        this.tabelaZKlassy = mojaTabelaZKlassy;

    }
}

public class Exercise4 {
    public static void main(String[] args) {
        int []tab = new int[]{2, 5, 7,3, 6, 8};
        for ( int element : tab){
            System.out.println(element);
        }
        float wynik = Arrays.stream(tab).sum();
        System.out.println("Wynik sumowania: " + wynik);
        Arrays.sort(tab);
        float srednia = wynik / tab.length;
        System.out.println("Suma przez dlugosc tablicy " +srednia);

        tabelka michal = new tabelka(5);
        System.out.println("wartosc zkonstruktora " + michal.tabelaZKlassy );
    }
}