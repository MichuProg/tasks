package string;

/*
Napisz program, który:

- Pobierze od użytkownika dowolny tekst
- Pobierze początkowy indeks dla nowego tekstu utworzonego z wpisanego wcześniej tekstu
- Pobierze końcowy indeks dla nowego tekstu utworzonego z wpisanego wcześniej tekstu
- Wyświetli w konsoli nowy tekst utworzony na podstawie starego tekstu

*/
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj jakis text");
        String text = sc.nextLine();
        System.out.println(text);
        int dlugoscTextu = text.length();
        System.out.println(text.substring(0,1));
        System.out.println(text.substring(dlugoscTextu-1,dlugoscTextu));
    }
}