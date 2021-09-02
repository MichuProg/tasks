package cwiczenia.carsObjectExample;

import java.time.LocalDate;
import java.util.Objects;

public class CarOwner {
    String firstName;
    String lastName;
    String pesel;
    LocalDate dateOfBirth;

    public CarOwner(String firstName, String lastName, String pesel, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean equalsCarOwner(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        CarOwner elementcarOwner = (CarOwner) o;
        return Objects.equals(firstName, elementcarOwner.firstName) &&
                Objects.equals(lastName, elementcarOwner.lastName) &&
                Objects.equals(pesel, elementcarOwner.pesel) &&
                Objects.equals(dateOfBirth, elementcarOwner.dateOfBirth);
    }
    static CarOwner newCarOwner(String firstName, String lastName, String pesel, LocalDate dateOfBirth){
        return (new CarOwner(firstName, lastName, pesel, dateOfBirth));
    }

    protected boolean isPeselCorrectLenht(CarOwner carOwner){
        return carOwner.getPesel().length() == 11;
    }
    static boolean isPeselCorrectNumbers(String pesel){
        char[] peselToCharTable = pesel.toCharArray();
        int count = 0;
        for (char number:
             peselToCharTable) {
            if (number>=48 && number<=57) count++;
        }
        return count == 11;
    }

    static boolean erlierThenDayOfBirth(LocalDate dateOfBirth, CarOwner carOwner){
        if (carOwner.dateOfBirth.isBefore(dateOfBirth)) {
            System.out.println(carOwner.dateOfBirth);
            return true;
        } else {
         return (false);
        }
    }
}
