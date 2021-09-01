package sda.cwiczenia.VetClinic;

public class Parrot extends Animal implements Exotic {
    private static String WEIGHT_UNIT = "G";
    private boolean registered;
    public Parrot(String name, Owner owner, String species, String sex) {
        super(name, owner, species, sex);
    }
    @Override
    public String getWeightUnit() {
        return WEIGHT_UNIT;
    }

    @Override
    public boolean checkRegistration(){
        return registered;
    }
}
