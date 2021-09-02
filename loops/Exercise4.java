package loops;

/*
Napisz program, który:
- Jako pierwszą liczbę przyjmuje ilość liczb, które muszą zostać wpisane do programu
- Pozwoli wpisać ilość zadeklarowanych wcześniej liczb w konsoli
- Zsumuje liczby wpisane przez użytkownika jeżeli są one podzielne przez 8
- Wyświetli na końcu sumę liczb podzielnych przez 8
 */


import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int numberCount = userInput.nextInt();
        int sum = 0;
        for(int i=1; i<=numberCount; i++){
            if(i % 8 == 0){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("Suma liczb podzielnych prze 8 to " + sum);

    }
}











