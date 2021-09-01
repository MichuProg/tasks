package sda.cwiczenia;

public class VariableCasting {
    public static void main(String[] arg) {
        int big = 130;
        byte small = (byte) big;
        byte small2 = (byte) -140;
        short small3 = (byte) 40000;
        long small4 = (byte) 40000;
        float small5 = (byte) 5.67;
        System.out.println(small2);
    }

}
