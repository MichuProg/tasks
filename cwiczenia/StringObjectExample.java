package sda.cwiczenia;

public class StringObjectExample {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abcd";
        System.out.println(s1.length());

        String s3 = "abc";
        String s4 = "ABC";
        System.out.println(s3.compareTo(s4));
        System.out.println(s3.compareToIgnoreCase(s4));
        System.out.println(s3.concat(s4));

        System.out.println(s3.concat(s4).concat("XXX"));
        System.out.println(s3);

        String s5 = "abcabcabc";
        String replace = s5.replace("ab", "xd");
        System.out.println(replace);
        String seconreplace = s5.replaceFirst("ab", "xd");
        System.out.println(seconreplace);

        String s6 = "abcdefghi";
        String substring = s6.substring(2, 7);
        String substring2 = s6.substring(3);
        System.out.println(substring);
        System.out.println(substring2);

        String s7 ="ab, cd, ef, gh";
        String []tableForS7= s7.split(", ");
        for (String word: tableForS7) {
            System.out.println(word);
        }

        char []s6ToTableChar = s6.toCharArray();
        for (char sign: s6ToTableChar) {
            System.out.print(sign+" ");
        }

        System.out.println();
        String s8 = "  bg ghgfh ghfh  \n";
        System.out.println(s8.trim());

        String s9 = "aBc dEF gHI";
        String lower = s9.toLowerCase();
        String upper = s9.toUpperCase();
        System.out.println(lower);
        System.out.println(upper);

        String s10 = "aBc dEF gHI";
        String s11 = " ";
        String s12 = null;
        System.out.println(s10.isEmpty());
        System.out.println(s11.isEmpty());

        String doubleStr = String.valueOf(1.234);
        String booleanStr = String.valueOf(true);
        String charTableStr = String.valueOf(new char[]{'a', 'b', 'c'});
        System.out.println(doubleStr);
        System.out.println(booleanStr);
        System.out.println(charTableStr);

        String result = " strang"
                .replace("a", "i")
                .concat("!")
                .toUpperCase()
                .trim();

        System.out.println(result);
    }
}
