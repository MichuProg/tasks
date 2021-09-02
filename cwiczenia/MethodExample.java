package cwiczenia;

public class MethodExample {
    public static void main(String[] args) {
        int x = 5;
        insaneMethod(x);
        insaneMethod(3);
        x=methodToAlwaysReturnOne();
        System.out.println(x);
    }

    static void insaneMethod(int param) {
        System.out.println("I'm insane " + param);
    }

    static int methodToAlwaysReturnOne() {
        return (1);
    }
}
