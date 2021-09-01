package sda.cwiczenia.VetClinic;

public class Lizard extends Reptile{
    private static String WEIGTH_UNIT = "G";
    private double length;
    public Lizard(String name, Owner owner, String species, String sex, boolean
            citesRegistered) {
        super(name, owner, species, sex, citesRegistered);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void showMeasurementsInfo() {
        super.showMeasurementsInfo();
        System.out.println("Lenght " + this.length);
    }
}
