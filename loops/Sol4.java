package sda.loops;

/*
Napisz program, który:
- Jako pierwszą liczbę przyjmuje ilość liczb, które muszą zostać wpisane do programu
- Pozwoli wpisać ilość zadeklarowanych wcześniej liczb w konsoli
- Zsumuje liczby wpisane przez użytkownika jeżeli są one podzielne przez 8
- Wyświetli na końcu sumę liczb podzielnych przez 8
 */

import java.util.Scanner;

public class Sol4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wprowadź ile liczb chcesz wpisać do programu: ");
        int iterator = sc.nextInt(); //Określenie ile liczb musimy pobrać
        int nextNum; //Następna pobrana liczba
        int sumOfNums = 0; //Suma liczb podzielnych przez szesc = wynik koncowy

        for (int i = 0; i < iterator; i++) {
            System.out.println("Podaj kolejna liczbę: ");
            nextNum = sc.nextInt();
            if (nextNum % 8 == 0) { // Sprawdzam czy nextNum reszta z dzielenia przez 6 == 0
                sumOfNums = sumOfNums + nextNum; // Dodaj liczbę podzielną przez sześć do sumy liczb podzielnych przez szesc
            }
        }
        System.out.println("Suma liczb podzielnych przez 8 wynosi: " + sumOfNums);
    }
}
