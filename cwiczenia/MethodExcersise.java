package cwiczenia;

public class MethodExcersise {
    public static void main(String[] args) {
        int x = 60;

        alwaysTheSameMessageVoid();
        System.out.println(alwaysTheSameMessegeString());
        System.out.println(castToChar((char) x));
        System.out.println(intCastToChar(x));
        System.out.println(additionTwoNumbers(40, x));
        exponentTo3(3);
        System.out.println(isTwoNumersEqual(6, 6));
        isTwoNumbersDivide(8, 4);
        isTrueTwoNumbersMatchAscii('z',122);
    }

    static void alwaysTheSameMessageVoid() {
        System.out.println("The same message");
    }

    static String alwaysTheSameMessegeString() {
        return ("the same messege");
    }

    static char castToChar(char numberOfAscii) {
        return (numberOfAscii);
    }

    static void isTrueTwoNumbersMatchAscii(char firstLetterMatch, int firstNumberMatch) {
        System.out.println((char) firstLetterMatch == firstNumberMatch);
    }

    static char intCastToChar(int secondNumberOfAscii) {
        char charNumber = (char) secondNumberOfAscii;
        return (charNumber);
    }

    static int additionTwoNumbers(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber);
    }

    static void exponentTo3(int numberToExponentThree) {
        System.out.println(numberToExponentThree * numberToExponentThree * numberToExponentThree);
    }

    static boolean isTwoNumersEqual(int isFirstEqual, int isSecondEqual) {
        return (isFirstEqual == isSecondEqual);
    }

    static void isTwoNumbersDivide(int isFirstDivide, int isSecondDivide) {
        System.out.println(isFirstDivide % isSecondDivide == 0);
    }

}
