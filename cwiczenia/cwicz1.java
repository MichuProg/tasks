package cwiczenia;

class Bananas {
    //pola
    String name;
    String color;
    int longines = 10;
}

class ThirdBananas {
    String name;
    String color;
    int longines;

    //konstrukotor
    public ThirdBananas(String bananasName, String bananasColor, int bananaslong) {
        this.name = bananasName;
        this.color = bananasColor;
        this.longines = bananaslong;
    }
}

class AnotherBananasClass {
    String colour;

    public void setColour(String colset) {
        colour = colset;
    }

    public String getColour() {
        return colour;
    }
}


public class cwicz1 {
    public static void main(String[] args) {
        Bananas mojBanan = new Bananas();
        mojBanan.name = "Chickita";
        mojBanan.color = "Yellow";
        System.out.println("Nazwa " + mojBanan.name);
        System.out.println("Kolor " + mojBanan.color);
        mojBanan.longines = 15;
        System.out.println("Dlugosc " + mojBanan.longines);

        Bananas drugiBanan = new Bananas();
        drugiBanan.name = "Blee";
        drugiBanan.color = "Braun";
        System.out.println("Nazwa " + drugiBanan.name);
        System.out.println("Kolor" + drugiBanan.color);
        System.out.println("Dlugosc " + drugiBanan.longines);

        ThirdBananas asus = new ThirdBananas("asus", "Yellow", 14);
        System.out.println("Nazwa " + asus.name);
        System.out.println("Kolor " + asus.color);
        System.out.println("Długość " + asus.longines);

        AnotherBananasClass kolejnyBanan = new AnotherBananasClass();
        kolejnyBanan.setColour("White");
        System.out.println(kolejnyBanan.getColour());
    }
}
