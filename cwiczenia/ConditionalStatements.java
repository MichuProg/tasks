package cwiczenia;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int x = userInput.nextInt();
        if(x==1){
            System.out.println("X equals 1!");
        } else if (x==2) {
            System.out.println("X equals 2!");
        } else {
            System.out.println("X equals something else!");
        }

    }
}
