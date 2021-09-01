package sda.cwiczenia;

public class ArraysExample2 {
    public static void main(String[] args) {
        int result = vargars(new int[]{1, 2});
        int result2 = vargars(new int[]{1, 2, 3});
        int result3 = vargars(new int[]{1, 2, 3, 4});
        System.out.println();
        System.out.println(result3);
    }
    public static int vargars(int ... nums){
    int sum=0;
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        return (sum);
    }

}
