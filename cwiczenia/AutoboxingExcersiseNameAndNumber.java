package sda.cwiczenia;

public class AutoboxingExcersiseNameAndNumber {
    public static void main(String[] args) {
        String[] sentenceTable = new String[]{"Adam is 15", "Eve turns 30", "Jim is almost 21"};
        String separateCharacter = " ";
        splitSentenceTable(sentenceTable, separateCharacter);
    }

    static String splitSentenceTable(String[] sentenceTable, String separateCharacter) {
        String[] tableSplited = sentenceTable[0].split(separateCharacter);
        String nameOldestPerson = tableSplited[0];
        int yearsOldMax = 0;
            for (String element :
                    sentenceTable) {
                tableSplited = element.split(separateCharacter);
                System.out.println(tableSplited[tableSplited.length-1]);
                int yearsOld = Integer.parseInt(tableSplited[tableSplited.length-1]);
                if (yearsOld > yearsOldMax) {
                    yearsOldMax = yearsOld;
                    nameOldestPerson = tableSplited[0];
                }
            }
        System.out.println(nameOldestPerson + " " + yearsOldMax);
        return (nameOldestPerson);
    }
}
