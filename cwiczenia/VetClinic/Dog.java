package cwiczenia.VetClinic;

public class Dog extends Animal{
    private static String WEIGTH_UNIT = "KG";
    private boolean vaccinated;

    public Dog(String name, Owner owner, String species, String sex) {
        super(name, owner, species, sex);
    }

    @Override
    public String getWeightUnit() {
        return WEIGTH_UNIT;
    }

}
