package sda.loops;

/*
Napisz program, który:
- Wyświetli pytanie "Czy chcesz wyjść z gry? (Wpisz quit)
- Pozwoli wprowadzić wpisany tekst przez użytkownika do programu
- Jeżeli użytkownik wpisze słowo "quit", wyświetl komunikat "Gra wyłączona!"
- Jeżeli użytkownik wpisze inne słowo, ma się pojawić ponownie pytanie czy chce wyjść z gry.
 */
import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner userAsk = new Scanner(System.in);
        boolean myFlag = true;
        while (myFlag) {
            System.out.println("Do you want to quit the game? (Type quit)");
            String doYouWantToQuit = userAsk.nextLine();
            if(doYouWantToQuit.equals("quit")){
                myFlag=false;
                System.out.println("Game over");
            }
        }
    }
}