package sda.cwiczenia;

public class Autoboxing {
    public static void main(String[] args) {
        Integer i = 1;
        int i2 = Integer.parseInt("123");
        double d = i.doubleValue();
        boolean b = Boolean.parseBoolean("true");
        System.out.println(i);
        System.out.println(i2);
        System.out.println(d);
        System.out.println(b);

        System.out.println("Typy opakowane");
        int x = 128;
        Integer xObjInt = x;
        Double xObjDouble = xObjInt.doubleValue();
        byte xByte = (byte) x;
        Byte xByte2 = xObjInt.byteValue();
        System.out.println(xObjInt);
        System.out.println(xObjDouble);
        System.out.println(xByte);
        System.out.println(xByte2);

        Double y = 2.623;
        Integer yObjInt = y.intValue();
        Integer yMathInt = (int)Math.round(y);
        System.out.println(yObjInt);
        System.out.println(yMathInt);
        System.out.println(yObjInt.equals(yMathInt));

    }
}
