package cwiczenia.VetClinic;

public class Turtle extends Reptile{
    private static String WEIGTH_UNIT = "G";
    private double diameter;
    private boolean hibernates;

    public Turtle(String name, Owner owner, String species, String sex, boolean citesRegistered) {
        super(name, owner, species, sex, citesRegistered);
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void showMeasurementsInfo() {
        super.showMeasurementsInfo();
        System.out.println("Diameter "+this.diameter);
    }
}
