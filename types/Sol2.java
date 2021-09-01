package sda.types;

/*
Napisz program, w którym:
- Wprowadzisz 3 dowolnie wybranych typów zmiennych z użyciem System.in
- Wyświetlisz wprowadzone wartości

*/

import java.util.Scanner;

public class Sol2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int numOfPlayers = userInput.nextInt();
        System.out.println(numOfPlayers);
    }
}
