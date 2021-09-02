package cwiczenia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {
    private static String text = "<div><p> This is number +48 243 543 646. +48 243 543 647 </div> <div> <h1>Lalala</h1> " +
            "abcdef 234-56-45.</div>" +
            " <div>Michael's email:m.smith@gmail.com. <br> Clarice - mail clarice@o2.pl " +
            "</div> Contact: 32 456 2343.";
    private static Pattern pPhoneBegin = Pattern.compile("\\+[0-9]+");
    private static Pattern pPhoneNumber = Pattern.compile("\\+[0-9]+\s[0-9]+\s[0-9]+\s[0-9]+");
    public static void main(String[] args) {
        Matcher m = pPhoneBegin.matcher(text);
        Matcher n = pPhoneNumber.matcher(text);
        m.find();
        while (n.find()) {
            System.out.println(n.group(0));
        }
        System.out.println(m.group(0));
        System.out.println(m.replaceAll("txt"));
    }
}
