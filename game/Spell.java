package game;

public class Spell implements Comparable {
    private final String name;
    private final int additionalPowerOfDestruction;
    private final int additionalHealthPoints;
    private int additionalResistancePoints;

    public Spell(String name, int additionalPowerOfDestruction, int additionalHealthPoints, int additionalResistancePoints) {
        this.name = name;
        this.additionalPowerOfDestruction = additionalPowerOfDestruction;
        this.additionalHealthPoints = additionalHealthPoints;
        this.additionalResistancePoints = additionalResistancePoints;
    }

    public String getName() {
        return name;
    }

    public int getAdditionalPowerOfDestruction() {
        return additionalPowerOfDestruction;
    }

    public int getAdditionalHealthPoints() {
        return additionalHealthPoints;
    }

    public int getAdditionalResistancePoints() {
        return additionalResistancePoints;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Spell){
            Spell spell = (Spell) o;
            return this.name.compareTo(spell.name);
        }
        return 1;
    }
    @Override
    public String toString() {
        return "Name " + getName() + ", Additional Dps " + getAdditionalPowerOfDestruction()
                + ", Additional HP " + getAdditionalHealthPoints() + ", Additional RP " + getAdditionalResistancePoints();
    }
}
