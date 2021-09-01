package sda.cwiczenia;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class EnumExample {

}

class Person {
    private String firstName;
    private String lastName;
    private boolean isFemale;
    private Nationality nationality;
    private String eyeColor;
    private LocalDate birthday;

    public String getFirstName() {
        return firstName;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public Person(String firstName, String lastName, Nationality
            nationality, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.birthday = birthday;
    }

}

class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Jan", "Kowalski", Nationality.PL, LocalDate.of(1990, Month.DECEMBER, 2));
        Person p2 = new Person("Janina", "Nowak", Nationality.GB, LocalDate.of(1950, Month.APRIL, 15));
        Person p3 = new Person("Wojciech", "Kowal", Nationality.GE, LocalDate.of(1981, Month.DECEMBER, 15));
        Person p4 = new Person("Maria", "Kaminska", Nationality.SP, LocalDate.of(1978, Month.JANUARY, 12));
        System.out.println(p1.getFirstName() + " " + p1.getNationality() + " " + p1.getNationality().getFull());
        Nationality[] nationalities = Nationality.values();
        for (Nationality n : nationalities) {
            System.out.println(n.getFull());
        }
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        LocalDate date1
                = LocalDate.of(1995, Month.DECEMBER, 2);
        date1.minusDays(1);
        System.out.println(date1);

    }
}
