package string;

/*
Napisz program, który:
- Pobierze od użytkownika tekst
- Wyświetli wpisany tekst wielkimi literami.
*/
import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     String text = scanner.nextLine();
        System.out.println(text.toUpperCase());
    }
}