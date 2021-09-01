package sda.cwiczenia;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me x ");
        int x = scanner.nextInt();
        dayOfTeWeek(x);
        fun(1);
    }
    static void dayOfTeWeek(int x){
        switch (x){
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("Wrong number");
        }
    }
    private static void fun(int a){
        switch (a) {
            case 1, 6 -> System.out.println("Apple \n second line");
            case 2 -> System.out.println("Banana");
            case 3 -> System.out.println("Orange");
            default -> System.out.println("Kiwi");
        }
    }
}
