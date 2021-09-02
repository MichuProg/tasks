package loops;
/*
Napisz program, który:
- Pobierze od użytkownika liczbę elementów do pobrania.
- Pozwoli na wpisanie elementów zadeklarowanych wcześniej przez użytkownika
- Znajdzie najwyższą liczbę podzielną przez 4 i wyświetli ją na ekranie spośród tych liczb.


Liczba elementów do wpisania nie może być większa niż 1000.
Liczba wprowadzona jako pojedyńczy element nie może być większa niż 30000.

*/
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int elements;
        int elemtValue;
        int max = 0;
        System.out.println("Podaj liczbe elementow (max 1000)");
        elements = userInput.nextInt();
        if(elements <= 1000){
            for(int i=1; i<=elements; i++){
                System.out.println("Podaj element (nie moze byc wieksze niz 30000) " +i);
                elemtValue = userInput.nextInt();
                if (elemtValue >= 30000){
                    System.out.println("Bledna wartosc elementu");
                }
                else if(elemtValue>max){
                    max=elemtValue;
                }
            }
            System.out.println("Najwiekszy element to " + max);
        }
        else {
            System.out.println("za duzo elemtow");
        }

    }
}