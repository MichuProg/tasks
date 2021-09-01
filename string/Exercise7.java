package sda.string;

 /*
Napisz program, który:
- Pobierze od użytkownika dwa zdania
- Sprawdzi czy zdania są takie same
- Jeżeli zdanie jest takie same, wyświetli w konsoli wartość true
- Jeżeli zdanie jest inne, wyświetli w konsoli wartość false
 */
import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    String firstSentence = userInput.nextLine();
    String secondSentence = userInput.nextLine();

    System.out.println(firstSentence.equals(secondSentence));
    }
}