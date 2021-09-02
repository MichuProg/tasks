package cwiczenia;

public class SortingCount {
    public static void main(String[] args) {
        int[] table = new int[]{6, 6,2, 6, 6,7, 6, 6, 6, 6, 0, 5};
        int resultFromMax = ArrayExcersise2.max(table);
        int[] tableSortedWithZero = sortingAndCounting(table, resultFromMax);
        for (int element :
                sortingAndCounting(table, resultFromMax)) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (int elcounted :
                writingSortedArray(tableSortedWithZero, table.length)) {
            System.out.print(elcounted + " ");
        }
    }

    static int[] sortingCountMethod(int [] table){
        int resultFromMax = ArrayExcersise2.max(table);
        int[] tableSortedWithZero = sortingAndCounting(table, resultFromMax);
        return (writingSortedArray(tableSortedWithZero, table.length));
    }

    static int[] sortingAndCounting(int[] table, int resultFromMax) {
        int[] tableSorthedWithZero = new int[resultFromMax + 1];
        for (int i = 0; i <= resultFromMax; i++) {
            for (int k : table) {
                if (i == k) {
                    tableSorthedWithZero[i] += 1;
                }
            }
        }
        return (tableSorthedWithZero);
    }

    static int[] writingSortedArray(int[] tableSortedWithZero, int lenghtOfTable) {
        int k = 0;
        int[] tableWithoutZero = new int[lenghtOfTable];
        for (int i = 0; i < tableSortedWithZero.length; i++) {
            if (tableSortedWithZero[i] != 0) {
                for (int j = 0; j < tableSortedWithZero[i]; j++) {
                    tableWithoutZero[k] = i;
                    k++;
                }
            }
        }
        return (tableWithoutZero);
    }
}
