package sda.cwiczenia;

public class MethodOverload {
    public static void main(String[] args) {
        int a=4;
        addingStringToTheEnd(5);
        addingStringToTheEnd(5, 4);
        addTwoInt(a, 3,5);
    }


    static int addingStringToTheEnd(int a) {
        System.out.print("Jakies zdanie ");
        System.out.println(a);
        return (a);
    }

    static int addingStringToTheEnd(int a, int b) {
        System.out.println("Jakies zdanie" + a);
        System.out.print(b);
        return (a + b);
    }

    static int addTwoInt(int a, int b) {
        return (a + b);
    }

    static int addTwoInt(int a, int b, int c) {
        return (a + b + c);
    }
}
