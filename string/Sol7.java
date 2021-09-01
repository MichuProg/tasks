package sda.string;

 /*
Napisz program, który:
- Pobierze od użytkownika dwa zdania
- Sprawdzi czy zdania są takie same
- Jeżeli zdanie jest takie same, wyświetli w konsoli wartość true
- Jeżeli zdanie jest inne, wyświetli w konsoli wartość false
 */


import java.util.Scanner;

public class Sol7 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Wprowadź pierwsze zdanie: ");
        String firstSentence = userInput.nextLine();

        System.out.println("Wprowadź drugie zdanie: ");
        String secondSentence = userInput.nextLine();

        boolean isSame = firstSentence.equalsIgnoreCase(secondSentence);
        System.out.println(isSame);
    }
}
