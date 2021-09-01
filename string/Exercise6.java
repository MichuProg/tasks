package sda.string;

/*
Napisz program, który:
- Pobierze od użytkownika pięć dowolnych słów
- Wyświetli wpisane pięć słów jako jeden tekst w konsoli
*/
import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String textSklejony="";

    for(int i=1; i<=5; i++) {
        System.out.println("Podaj slowo ");
        System.out.println(i);
        String textPodany = scanner.nextLine();
        textSklejony=textSklejony+textPodany;
    }
        System.out.println(textSklejony);

    }
}