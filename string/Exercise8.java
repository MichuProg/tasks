package string;

/*
Napisz program, który:
- Pobierze od użytkownika słowo
- Sprawdzi czy wpisane słowo zaczyna się od małej litery j.
- Program w konsoli powinien wyświetlić wartość true lub false.
*/
import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args) {
        Scanner userInpt = new Scanner(System.in);
        System.out.println("podaj haslo");
        String password = userInpt.nextLine();
        System.out.println(password.substring(0,1));
        String litera = "j";
        boolean status = password.substring(0,1).equals(litera);
        System.out.println(status);
    }
}