package cwiczenia;

public class AutoboxingExcersise {
    public static void main(String[] args) {
        String numebersString = "3, 4, 4, 2";
        String[] tableForNumbersString = splitString(numebersString);
        Double[] tableForNumbersDouble = tableStringConvertToDoubleTable(tableForNumbersString);
        Double sumDouble = sum(tableForNumbersDouble);
        String sumString= sumDouble.toString();
        System.out.println(sumString);
    }
    static String[] splitString(String numbersString){
        return (numbersString.split(", "));
    }
    static Double[] tableStringConvertToDoubleTable(String[] tableForNumbersString){
        Double[] tableForNumbersDouble= new Double[tableForNumbersString.length];
        int i=0;
        for (String element:
                tableForNumbersString) {
            tableForNumbersDouble[i]= Double.parseDouble(element);
            System.out.println(tableForNumbersDouble[i]);
            i++;
        }
        return (tableForNumbersDouble);
    }
    static Double sum(Double[] tableForNumberDouble){
        double sumNumbers = 0;
        for (double element:
             tableForNumberDouble) {
            sumNumbers+=element;
        }
        return (sumNumbers);
    }
}
