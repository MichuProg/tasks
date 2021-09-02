package cwiczenia.carsObjectExample;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class CarsTable {
    public static void main(String[] args) {
        CarOwner Zenek = new CarOwner("Zenon", "Kowalski", "78112445345", LocalDate.of(1978, Month.NOVEMBER, 11));
        CarOwner Mietek = new CarOwner("Mieczyslaw", "Lokietek", "96111498564", LocalDate.of(1996, Month.NOVEMBER, 23));
        CarOwner Edek = new CarOwner("Edward", "Nozycoreki", "76121298564", LocalDate.of(1993, Month.JULY, 1));
        CarOwner Andrzej = new CarOwner("Andrzej", "Nowak", "82121345621", LocalDate.of(1987, Month.AUGUST, 19));
        CarOwner Marzena = new CarOwner("Marzena", "Jezyna", "87020498461", LocalDate.of(1992, Month.FEBRUARY, 4));
        CarOwner[] carsOwners = new CarOwner[]{Zenek, Mietek, Edek, Andrzej, Marzena};
        Car Audi = new Car(Car.carName.AUDI, "A6", "AUD123", 200000, 240, Marzena);
        Car Mercedes = new Car(Car.carName.MERCEDES, "C=Class", "MER321", 250000, 230, Andrzej);
        Car Bmw = new Car(Car.carName.BMW, "3", "Bmw456", 260000, 250, Edek);
        Car Toyta = new Car(Car.carName.TOYOTA, "Avensis", "TOY654", 190000, 210, Andrzej);
        Car Lexus = new Car(Car.carName.LEXUS, "IS350", "LEX789", 250000, 240, Zenek);
        Car Mercedes2 = new Car(Car.carName.MERCEDES, "A-Class", "MER468", 170000, 220, Mietek);
        Car Mercedes3 = new Car(Car.carName.MERCEDES, "CLK", "MER653", 270000, 260);
        Car[] cars = new Car[]{Audi, Mercedes, Bmw, Toyta, Lexus, Mercedes2, Mercedes3};

        System.out.println("""
                a) danej marki,
                b) danego modelu,
                c) w danym przedziale cenowym od – do,
                d) osiągające maksymalną prędkość powyżej wskazanej,
                e) których numer rejestracyjny zaczyna się od pewnych podanych znaków,
                f) które mają pierwszego właściciela,
                g) jednocześnie po marce, modelu i pierwszym właścicielu,
                h) po dowolnej liczbie marek.""");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        switch (x) {
            case "a" -> {
                Car carForTest = new Car(Car.carName.BMW, "3", "Bmw456");
                for (Car elmentCar : cars) {
                    if (elmentCar.equals(carForTest)) {
                        System.out.println(elmentCar.mark + " " + elmentCar.registratinNumber);
                    }
                }
            }
            case "b" -> {
                Car carForTest = new Car(Car.carName.BMW, "3", "Bmw456");
                for (Car elmentCar : cars) {
                    if (elmentCar.equalsModel(carForTest)) {
                        System.out.println(elmentCar.model + " " + elmentCar.registratinNumber);
                    }
                }
            }
            case "c" -> {
                int min = 210000;
                int max = 250000;
                for (Car elementCar : cars) {
                    if (elementCar.price >= min && elementCar.price <= max) {
                        System.out.println(elementCar.mark + " " + elementCar.registratinNumber);
                    }
                }
                int min2 = 190000;
                int max2 = 240000;
                for (Car elementCar :
                        cars) {
                    elementCar.betweenMinAndMaxPrice(elementCar, min2, max2);
                }

            }

            case "d" -> {
                int minVMaxForViecule = 230;
                for (Car viecule :
                        cars) {
                    if (minVMaxForViecule < viecule.vMax)
                        System.out.println(viecule.mark + " " + viecule.registratinNumber);
                }
            }

            case "e" -> {
                String registration = "TOY";
                for (Car viecule :
                        cars) {
                    if (viecule.registratinNumber.contains(registration))
                        System.out.println(viecule.mark + " " + viecule.registratinNumber);
                }
            }

            case "f" -> {
                for (Car viecule : cars) {
                    if (viecule.firstOwner) System.out.println(viecule.mark + " " + viecule.registratinNumber);
                }
            }

            case "g" -> {
                Car serchingCar = new Car(Car.carName.LEXUS, "IS350", "");
                for (Car viecule :
                        cars) {
                    if (viecule.equalsMarkModelFirstOwner(serchingCar)) System.out.println(viecule.registratinNumber);
                }
            }

            case "h" -> {
                String[] markForSearch = new String[]{"Audi", "Toyota"};
                for (Car viecule :
                        cars) {
                    for (String markElement :
                            markForSearch) {
                        if (viecule.mark.getFullCarName().equals(markElement)) System.out.println(viecule.registratinNumber);
                    }
                }
            }
            case "7" -> {
                String pesel = "82121345621";
                CarOwner personForFilter = null;
                for (CarOwner person :
                        carsOwners) {
                    if (person.pesel.equals(pesel))
                        personForFilter = new CarOwner(person.firstName, person.lastName, person.pesel, person.dateOfBirth);
                }
                System.out.println(personForFilter.lastName);

                for (Car viecule :
                        cars) {
                    if (viecule.owner == null) continue;
                    if (viecule.owner.equalsCarOwner(personForFilter)) System.out.println(viecule.mark);
                }
            }
            case "8" -> {
                CarOwner personToFind = new CarOwner("Andrzej", "Nowak", "82121345621", LocalDate.of(1987, Month.AUGUST, 19));
                for (Car viecule :
                        cars) {
                    if (viecule.owner == null) continue;
                    if (viecule.owner.equalsCarOwner(personToFind)) System.out.println(viecule.mark);
                }
            }
            case "9" -> {
                Mercedes.setOwner(Zenek);
                System.out.println(Mercedes.owner.firstName);
                String firstName = "Adelajda";
                String lastName = "Zablocka";
                String pesel = "90030405471";
                LocalDate dayOfBirth = LocalDate.of(1988, Month.FEBRUARY, 4);
                CarOwner newPerson = CarOwner.newCarOwner(firstName, lastName, pesel, dayOfBirth);
                CarOwner[] carsOwnersNewTable = new CarOwner[carsOwners.length + 1];
                int i = 0;
                for (CarOwner person :
                        carsOwners) {
                    carsOwnersNewTable[i] = person;
                    System.out.println(carsOwnersNewTable[i].firstName);
                    i++;
                }
                carsOwnersNewTable[carsOwners.length] = newPerson;
                System.out.println(carsOwnersNewTable[carsOwners.length].firstName);

                Mercedes3.setFirstOwner(Mercedes3.owner == null);
                Mercedes3.setOwner(newPerson);
                System.out.println(Mercedes3.owner.firstName + " " + Mercedes3.model + " " + Mercedes3.firstOwner);
            }
            case "10" -> {
                String pesel = "82121345621";
                System.out.println(CarOwner.isPeselCorrectNumbers(pesel));
                CarOwner personForFilter = null;
                for (CarOwner person :
                        carsOwners) {
                    if (person.pesel.equals(pesel)) {
                        if (person.isPeselCorrectLenht(person)) {
                            personForFilter = new CarOwner(person.firstName, person.lastName, person.pesel, person.dateOfBirth);
                        }
                    }
                }
                for (Car viecule :
                        cars) {
                    if (viecule.owner == null) continue;
                    if (viecule.owner.equalsCarOwner(personForFilter)) System.out.println(viecule.mark);
                }
            }
            case "11" -> {
                //filtruje samochody wlascicieli starszych niz data
            LocalDate dateForFiltering = LocalDate.of(1990, Month.MARCH,1);
                for (CarOwner person:
                     carsOwners) {
                    if(CarOwner.erlierThenDayOfBirth(dateForFiltering, person)){
                        for (Car viecule:
                             cars) {
                            if (viecule.owner == null) continue;
                            if (viecule.owner.equalsCarOwner(person)){ System.out.println(viecule.mark.getFullCarName());}
                        }
                    }
                }
            }
        }
    }
}

