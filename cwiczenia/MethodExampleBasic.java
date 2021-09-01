package sda.cwiczenia;

public class MethodExampleBasic {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 5;
        int d = 6;
        int e = 10;

        checkParameter(a);
        checkParameter(b);
        checkParameter(c);
        checkParameter(d);
        checkParameter(e);
    }

    static void checkParameter(int param) {
        System.out.println("Is " + param + " 0 to 10? " + (param >= 0 && param <= 10) + " Is even? " + (param % 2 == 0));
        System.out.println("Is a even and in 0 to 10 (even incremented)? " + (param % 2 == 0 && param >=
                0 && (param+1) <= 10));

    }
}
