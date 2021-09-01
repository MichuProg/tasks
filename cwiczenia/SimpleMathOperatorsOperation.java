package sda.cwiczenia;

public class SimpleMathOperatorsOperation {
    public static void main(String[] args) {
        double a = 6.3;
        int b = 4;
        int d = 0;
        float c = 5.5F;
        double dodawanie = 0;

        dodawanie = a + b;
        System.out.println(dodawanie);
        System.out.println(c - a);
        System.out.println(a * c);
        System.out.println(b / c);
        System.out.println(b % a);

        System.out.println("Adition " + (a + b + c));
        System.out.println(a +"Adition " + b);
        System.out.println( a + b + c);
        System.out.println(a+b + "Adition");
        a+=10;
        System.out.println(a);

    }
}
