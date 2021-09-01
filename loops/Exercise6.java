package sda.loops;

/*
Napisz program, który:

- Wyświetl informację: "Czy chcesz zwiększyć wynik o 1? (Wpisz tak lub nie)"
- Jeżeli użytkownik wpisze słowo tak, licznik ma zostać zwiększony o 1 i wyświetlony aktualny wynik.
- Jeżeli użytkownik wpisze słowo nie, program ma wyświetlić wynik i wyświetlić komunikat koniec gry.
- Jeżeli użytkownik wpisze jakikolwiek inne słowo wtedy ma wyświetlić ponownie pytanie i licznik ma zostać taki sam.
 */
import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int sum = 0;
        boolean myFlag = true;
        while (myFlag){
            System.out.println("Do You want to increase counter by 1 ? (Type yes or no)");
            String increaseOrNot = userInput.nextLine();
            if(increaseOrNot.equals("yes")){
                sum+=1;
                System.out.println("Result " +sum);
            }
            else if(increaseOrNot.equals("no")) {
                System.out.println("Result " + sum +" Game over");
                myFlag = false;
            }
        }


    }
}