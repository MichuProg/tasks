package sda.cwiczenia;

public class LogicalOperatorsExample {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=true;
        boolean c=false;

        System.out.println(!a);
        System.out.println(a && b);
        System.out.println(a && c);
        System.out.println(a && b && c);

        System.out.println(a || b);
        System.out.println(a || c);
        System.out.println(a || b || c);

        System.out.println(a || b && c);
        System.out.println(a || c && b);
        System.out.println((a && b) || c);


    }
}
