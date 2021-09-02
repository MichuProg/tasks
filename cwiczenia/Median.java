package cwiczenia;

public class Median {
    public static void main(String[] args) {
        int[] table = new int[]{4, 3, 2, 1, 6, 8, 6, 6, 2};
        int[] tableSorted = SortingCount.sortingCountMethod(table);
        for (int el :
                tableSorted) {
            System.out.print(el + " ");
        }
        System.out.println("\nMediana: " + medianFromTableSorted(tableSorted));
    }

    static double medianFromTableSorted(int[] tableSorted) {
        int lenghtOfTableSortedDivide2 = tableSorted.length / 2;
        double result;
        if (tableSorted.length % 2 == 1) {
            result = tableSorted[lenghtOfTableSortedDivide2];
        } else if (tableSorted[lenghtOfTableSortedDivide2 - 1] == 0 && tableSorted[lenghtOfTableSortedDivide2] == 0) {
            result = 0;
        } else {
            result = (double) (tableSorted[lenghtOfTableSortedDivide2 - 1] + tableSorted[lenghtOfTableSortedDivide2]) / 2;
        }
        return (result);
    }
}
