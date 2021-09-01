package sda.obj;

// Klasa Patient bez użycia konstruktora
class Patient {
    // Pola klasy Patient
    String name;
    int age;
    float height;
    String[] compliance;
}

// Klasa PatientConstructor używająca konstruktora
class PatientConstructor {
    // Pola klasy PatientConstructor
    String name;
    int age;
    float height;
    String[] compliance;

    // Konstruktor w klasie PatientConstructor
    public PatientConstructor(String patientName, int patientAge) {
        this.name = patientName;
        this.age = patientAge;
        this.height = 0; // Przypisanie wartości domyślnej dla pola height
    }
}

public class PatientDemo {

    public static void main(String[] args) {
        // Patient
        // Tworzymy za pomocą klasy Patient nowego pacjenta o nazwie tomasz
        Patient tomasz = new Patient();

        // Przypisujemy wartości do pól znajdujących się w stworzonym przez nas obiekcie nowego pacjenta o nazwie tomasz
        tomasz.name = "Tomasz";
        tomasz.age = 30;
        tomasz.height = 180.4f;
        tomasz.compliance = new String[]{"Katar", "Kaszel", "Gorączka"};

        // Wyświetlamy wartość pola imię, wiek oraz wzrost dla obiektu tomasz
        System.out.println("Imię: " + tomasz.name + " Wiek: " + tomasz.age + " Wzrost: " + tomasz.height);

        // Tworzymy za pomocą klasy Patient nowego pacjenta o nazwie justyna
        Patient justyna = new Patient();

        // Przypisujemy wartości do pól znajdujących się w stworzonym przez nas obiekcie nowego pacjenta o nazwie justyna
        justyna.name = "Justyna";
        justyna.age = 22;
        justyna.height = 165.4f;
        justyna.compliance = new String[]{"Ból głowy", "Wymioty", "Biegunka"};

        // Wyświetlamy wartość pola imię, wiek oraz wzrost dla obiektu justyna
        System.out.println(justyna.name + " " + justyna.age + " " + justyna.height);


        // PatientConstructor

        // Utworzenie obiektu michal za pomocą klasy PatientConstructor, gdzie zaimplementowany mamy konstruktor
        PatientConstructor michal = new PatientConstructor("Michał", 30);

        // Wyświetlamy wartość pola imię, wiek oraz wzrost dla obiektu michal
        System.out.println("Imię: " + michal.name + " Wiek: " + michal.age + " Wzrost: " + michal.height);

        // Zmieniamy wartość bezpośrednio w polu michal.height na 180.5
        michal.height = 180.5f;

        // Wyświetlamy wartość pola michal.height po zmianie wzrostu
        System.out.println("Nowy wzrost pacjenta to: " + michal.height);
    }
}



