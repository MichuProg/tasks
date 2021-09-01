package sda.instructions;

/*
Napisz program, który:

- Przyjmuje jako parametr liczebność wojska
- Klasyfikuje je co do wielkości:

    Poniżej 0 - brak armii
    Od 1 do 19 - drużyna
    Od 20 do 249 - pluton
    Od 250 do 999 - kompania
    Powyżej 1000 - batalion

 */
import java.util.Scanner;

public class Sol3 {
    public static void main(String[] args) {

        // put your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę wojsk: ");
        int troops = sc.nextInt();

        if (troops < 1) {
            System.out.println("Brak armii");
        } else if (troops <= 19) {
            System.out.println("Drużyna");
        } else if (troops <= 249) {
            System.out.println("Pluton");
        } else if (troops <= 999) {
            System.out.println("Kompania");
        } else {
            System.out.println("Batalion");
        }
    }
}

