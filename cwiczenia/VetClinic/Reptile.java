package sda.cwiczenia.VetClinic;

public class Reptile extends Animal implements Exotic {
    private static String WEIGTH_UNIT = "G";
    private boolean citesRegistered;

    public Reptile(String name, Owner owner, String species, String sex, boolean
            citesRegistered) {
        super(name, owner, species, sex);
        this.citesRegistered = citesRegistered;
    }

    @Override
    public String getWeightUnit() {
        return WEIGTH_UNIT;
    }

    @Override
    public boolean checkRegistration() {
        return citesRegistered;
    }
}
