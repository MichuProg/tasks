package sda.cwiczenia;

public class LogicalOperatorsExcesise {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int isEven = 0;
        char checkA = 'a';
        char checkZ = 'z';
        char variableToCheck = 'F';
        System.out.println(a == b);
        System.out.println(a >= 0 && a <= 10);
        isEven = a % 2;
        System.out.println(isEven != 0);
        System.out.println(a);
        ++a;
        System.out.println(a >= 0 && a <= 10);

        System.out.println(variableToCheck >=checkA && variableToCheck <=checkZ);
        System.out.println(variableToCheck <=checkA && variableToCheck <=checkZ);
    }
}
