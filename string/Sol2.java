package sda.string;

import java.util.Scanner;

/*
Napisz program, który:
- Pobierze od użytkownika tekst w postaci nazwy miasta
- Jeżeli podany przez użytkownika tekst zawiera końcówkę -burg, wyświetl wartość true
- Jeżeli podany przez użytkownika tekst nie zawiera końcówki - burg, wyświetl wartość false

Output:
Ausburg
true
Oslo
false
 */

public class Sol2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        System.out.println(city.endsWith("burg"));
    }
}
