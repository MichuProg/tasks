package cwiczenia;

public class ArrayExcersise {
    public static void main(String[] args) {
        int[] tab = {1, 2, 5, 4};
        char[] tab2 = {'a', 'b', 'c'};
        for (int el : tab) {
            System.out.println(el);
        }
        for (int i = 0; i < tab2.length; i++) {
            System.out.println(tab2[i]);
        }
        System.out.println(tab.length);

        int result = sum(1, 2);
        int result2 = sum(1, 2, 3);
        int result3 = sum(1, 2, 3, 4);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }

    public static int sum(int a, int b){
        return sum(a, b, 0);
    }
    public static int sum(int a, int b, int c){
        return sum(a, b, c, 0);
    }
    public static int sum(int a, int b, int c, int d){
        int sum = 0;
        sum=a+b+c+d;
        return sum;
    }
}
