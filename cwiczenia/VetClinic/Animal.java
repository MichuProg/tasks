package cwiczenia.VetClinic;

import java.time.LocalDate;

public abstract class Animal implements Comparable{
    private String name;
    private Owner owner;
    private double weight;
    private int age;
    private LocalDate lastVisitDate;
    private String species;
    private String sex;

    public Animal(String name, Owner owner, String species, String sex) {
        this.name = name;
        this.owner = owner;
        this.species = species;
        this.sex = sex;
    }

    public Owner getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract String getWeightUnit();

    public void showMeasurementsInfo() {
        System.out.println(this.name);
        System.out.println("weight: " + this.weight + " " + getWeightUnit());
    }




    public static class Owner {
        private String name;
        private String phoneNr;

        public Owner(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Animal){
            Animal animal = (Animal) o;
            return this.name.compareTo(animal.name);
        }
        return 1;
    }
}

