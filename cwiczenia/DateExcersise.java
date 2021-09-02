package cwiczenia;

import java.time.LocalDate;
import java.util.Locale;

import static java.time.Month.*;

public class DateExcersise {
    public static void main(String[] args) {
        LocalDate dateBegin = LocalDate.of(1805, JANUARY, 1);
        LocalDate dateEnd = LocalDate.of(2015, JANUARY, 1);
        yearWith366Days(dateBegin, dateEnd);
        proverb(dateEnd);
        String s1 = "abc";
        String s2 = "abc";
        String s3= new String("abc");
        String s4 = "ABC".toLowerCase();
        String s5 = "a" + "b" + "c";
        System.out.println("3: " + (s1==s2));
        System.out.println("4: " + (s1.equals(s2)));
        System.out.println("5: " + (s1==s3));
        System.out.println("6: " + (s1.equals(s3)));
        System.out.println("7: " + (s1==s4));
        System.out.println("8: " + (s1.equals(s4)));
        System.out.println("9: " + (s1.equals(s5)));
    }

    static void yearWith366Days (LocalDate begin, LocalDate end){
        boolean myflag=true;
        int i=0;
        while (myflag){
            if(begin.plusYears(i).lengthOfYear()==366) System.out.println(begin.plusYears(i).getYear());
            if (end.getYear()==begin.plusYears(i).getYear()) myflag=false;
            i++;
        }
    }

    static void proverb(LocalDate date){
        System.out.println(date.getMonth());
        String montString= date.getMonth().toString();
        switch (montString) {
            case ("JANUARY") -> System.out.println("Gdy w styczniu woda huczy, to na wiosnę mróz dokuczy.");
            case ("FEBRUARY") -> System.out.println("Luty podkuj buty ");
            case ("MARCH") -> System.out.println("W marcu jak w garncu");
            case ("APRIL") -> System.out.println("kwiecień-plecień , bo przeplata trochę zimy trochę lata");
            case ("MAY") -> System.out.println("Kto sie w maju urodzi, tezmu sie dobrze powodzi");
            case ("JUNE") -> System.out.println("Od czerwca duzo zależy, czy żniwa beda ja nalezy");
            case ("JULY") -> System.out.println("Lipcowe upały wrzesien doskonaly");
            case ("AUGUST") -> System.out.println("Kiedy sierien wrzos rzwija, jesien krotka, szybko mija");
            case ("SEPTEMBER") -> System.out.println("Wrzesien");
            case ("OCTOBER") -> System.out.println("Pazdziernik");
            case ("NOVEMBER") -> System.out.println("Listopad");
            case ("DECEMBER") -> System.out.println("Grudzien");
        }
    }
}
