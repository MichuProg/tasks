package sda.obj;

class Bike {
    private final String name;
    private final String type;
    private String color;

    public Bike(String name, String model, String color) {
        this.name = name;
        this.type = model;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String col){
        color = col;
    }
}

public class BikeDemo {
    public static void main(String[] args) {
       Bike wigry = new Bike("Bartek", "2.0", "Zielony");

        System.out.println(wigry.getName());
        System.out.println(wigry.getType());
        System.out.println(wigry.getColor());

        System.out.println("Kolor roweru to: " + wigry.getColor());
        wigry.setColor("Biały");
        System.out.println("Kolor roweru to: " + wigry.getColor());
    }
}



