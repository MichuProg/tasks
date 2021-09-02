package cwiczenia;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class StringExcersise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                a) która usunie wystąpienia wybranego podciągu z ciągu znaków,
                b) zliczającą słowa w tekście,
                c) przerabiającą tekst na telegram (zastąpi kropki i przecinki w tekście wyrazem STOP),
                d) * która w losowych miejscach między wyrazami w tekście wpisze “:D”,
                e) która odwróci Stringa,
                f) która sprawdzi czy dwa wyrazy są anagramami (niezależnie od wielkosci znaków),
                g) * która sprawdzi czy wyrazy w dowolnej liczbie są anagramami danego wyrazu
                (niezależnie od wielkosci znaków),
                h) która zareprezentuje dużą liczbę całkowitą rozdzielając ją na trójki, tzn. z liczby
                1234567890 zrobi 1 234 567 890,
                i) która z tekstu rozdzielonego spacjami zrobi tzw. Camel Case, czyli z tekstu “To jest tekst”\s
                zrobi “ToJestTekst”,
                j) * która przekształci ciąg znaków na szyfr Cezara o wybranym przesunięciu,
                k) * która znajdzie i wypisze z tekstu wszystkie cyfry,
                l) * która sprawdzi czy tekst jest palindromem,
                m) * która zliczy wszystkie znaki alfabetu w tekście,
                n) która wytnie w kodzie HTML tekst z tagów <div> i <p> i go wypisze, przykładowy HTML:
                “<html>\\n<head></head>\\n<body>\\n<p>Tekst1 \\n<div>Tekst2\s
                </div>\\n<p>Tekst3 \\n</body>\\n</html>”""");
        String x = scanner.next();
        String words = "Ala has a cat, not a dog.";
        switch (x) {
            case "a" -> System.out.println(words.replace("cat", ""));
            case "b" -> {
                String[] tableWords = words.split(" ");
                System.out.println(tableWords.length);
            }
            case "c" -> System.out.println(words.replace(",", "STOP")
                    .replace(".", "STOP"));
            case "d" -> {
                String[] tableWords = words.split(" ");
                String emoticon = ":D";
                for (String element :
                        tableWords) {
                    System.out.print(element);
                    int random = new Random().nextInt(2);
                    if (random == 0) {
                        System.out.print(emoticon);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            case "e" -> {
                char[] chars = words.toCharArray();
                for (int i = chars.length - 1; i >= 0; i--) {
                    System.out.print(chars[i]);
                }
            }
            case "f" -> {
                String firstWord = "niedziela";
                String secondWord = "Dzielenia";
                char[] charFirstWord = createTabeCharToLowerCase(firstWord);
                char[] charSecondWord = createTabeCharToLowerCase(secondWord);
                if (sortAndConvertToOneString(charFirstWord).compareTo(sortAndConvertToOneString(charSecondWord)) == 0) {
                    System.out.println("Sa anagramami");
                } else {
                    System.out.println("Nie sa anagramami");
                }
            }
            case "g" -> {
                String firstWord = "niedziela to jest to";
                String secondWord = "Dzielenia ot etosjtr";
                char[] charFirstWord = createTabeCharToLowerCase(firstWord);
                char[] charSecondWord = createTabeCharToLowerCase(secondWord);
                if (sortAndConvertToOneString(charFirstWord).compareTo(sortAndConvertToOneString(charSecondWord)) == 0) {
                    System.out.println("Sa anagramami");
                } else {
                    System.out.println("Nie sa anagramami");
                }
            }
            case "h" -> {
                int number = 1234567890;
                char[] stringNumber = String.valueOf(number).toCharArray();
                System.out.println(spaceBetweenNumber(stringNumber));
                char[] newTable = oppositeTable(spaceBetweenNumber(stringNumber));
                String resultString = String.valueOf(newTable);
                System.out.println(resultString.trim());
            }
            case "i" -> {
                String text = "To jest text";
                String[] wordSplit = text.split(" ");
                for (String word :
                        wordSplit) {
                    System.out.print(word.toUpperCase().charAt(0) + word.toLowerCase().substring(1));
                }
            }
            case "j" -> {
                String password = "Ala ma kota w z";
                char[] passwordToCharTable = password.toLowerCase().toCharArray();
                int passwordToInt;
                int shift = 5;
                for (char elementPass :
                        passwordToCharTable) {
                    if (elementPass + shift > 122) {
                        passwordToInt = elementPass + shift - 26;
                    } else {
                        passwordToInt = elementPass + shift;
                    }
                    if (elementPass == 32) {
                        System.out.print(" ");
                    } else {
                        elementPass = (char) passwordToInt;
                        System.out.print(elementPass);
                    }
                }
            }
            case "k" -> {
                String textK = "Tom has 3 dolars and 55 cents";
                String[] textKSplited = textK.split(" ");
                char[] textKToCharTable;
                char[] textKToDigitTable = textK.toCharArray();
                System.out.println("Cyfry wystepujace wtekscie");
                for (char elementDigit :
                        textKToDigitTable) {
                    if (elementDigit >= 48 && elementDigit <= 57) {
                        System.out.print(elementDigit + " ");
                    }
                }
                System.out.println("\nLiczby w tekscie");
                for (String element :
                        textKSplited) {
                    textKToCharTable = element.toCharArray();
                    for (char elementChar :
                            textKToCharTable) {
                        if (elementChar >= 48 && elementChar <= 57) {
                            System.out.print(elementChar);
                        }
                    }
                    System.out.print(" ");
                }
            }
            case "l" -> {
                String text = "ankkna";
                char[] textToCharTable = text.toCharArray();
                boolean myFlag = false;
                int j = textToCharTable.length - 1;
                int a = 0;
                for (int i = 0; i <= (textToCharTable.length / 2); i++) {
                    if (textToCharTable[i] == textToCharTable[j]) {
                        myFlag = true;
                        j--;
                    } else {
                        myFlag = false;
                        break;
                    }
                }
                System.out.println(myFlag);
                int k = textToCharTable.length - 1;
                while (a <= k) {
                    if (textToCharTable[a] == textToCharTable[k]) {
                        myFlag = true;
                        a++;
                        k--;
                    } else {
                        myFlag = false;
                        break;
                    }
                }
                System.out.println(myFlag);
            }
            case "m" -> {
                String text = "AAA D BBB CC D";
                char[] table2 = text.toCharArray();
                int[] table3 = new int[table2.length];
                int i = 0;
                for (char element : table2) {
                    table3[i] = element;
                    System.out.println(table3[i]);
                    i++;
                }
                int resultFromMax2 = ArrayExcersise2.max(table3);
                int[] tableSortedWithZero2 = SortingCount.sortingAndCounting(table3, resultFromMax2);
                int count = 0;
                for (int element :
                        SortingCount.sortingAndCounting(table3, resultFromMax2)) {
                    if (element != 0) {
                        System.out.println(element + " " + (char) count);
                    }
                    count++;
                }
                System.out.println();
                for (int elcounted :
                        SortingCount.writingSortedArray(tableSortedWithZero2, table3.length)) {
                    char elementChar = (char) elcounted;
                    System.out.print(elementChar + " ");
                }
            }
            case "n" -> {
                String html = "<html>\\n<head></head>\\n<body>\\n<p>Tekst1 \\n<div>Tekst2s\n" +
                        "                </div>\\n<p>Tekst3 \\n</body>\\n</html>";


                String htmlNew= html.replace("<html>", "")
                        .replace("</html>","")
                        .replace("<div>", "")
                        .replace("</div>", "")
                        .replace("<p>", "")
                        .replace("<body>", "")
                        .replace("</body>", "")
                        .replace("<head>", "")
                        .replace("</head>", "")
                        .replace(" ", "")
                        .replace("\\n", "");
                System.out.println(htmlNew);


            }
            default -> throw new IllegalStateException("Unexpected value: " + x);
        }
    }

    static char[] createTabeCharToLowerCase(String word) {
        return (word.toLowerCase().replace(" ", "").toCharArray());
    }

    static String sortAndConvertToOneString(char[] tab) {
        Arrays.sort(tab);
        return (String.valueOf(tab));
    }

    static char[] spaceBetweenNumber(char[] stringNumber) {
        char[] stringNumberWithSpaces = new char[stringNumber.length + (stringNumber.length / 3)];
        int j = 0;
        int k = 0;
        for (int i = stringNumber.length - 1; i >= 0; i--) {
            if (k == 3) {
                stringNumberWithSpaces[j] = ' ';
                j++;
                stringNumberWithSpaces[j] = stringNumber[i];
                j++;
                k = 1;
            } else {
                stringNumberWithSpaces[j] = stringNumber[i];
                j++;
                k++;
            }
        }
        return (stringNumberWithSpaces);
    }

    static char[] oppositeTable(char[] charTable) {
        char[] oppositeChar = new char[charTable.length];
        int j = 0;
        for (int i = charTable.length - 1; i >= 0; i--) {
            oppositeChar[j] = charTable[i];
            j++;
        }
        return (oppositeChar);
    }

}
