package game;


import java.util.TreeSet;

public class Sorcerer extends Hero implements Character {
    private int resistancePoints;
    private final TreeSet<Spell> spellBook;

    public Sorcerer(String name, Race race, int resistancePoints, TreeSet<Spell> spellBook) {
        super(name, race);
        this.resistancePoints = resistancePoints;
        this.spellBook = spellBook;
        setPowerOfDestructionHero(getPowerOfDestructionHero() * 2);
    }

    public int getResistancePoints() {
        return resistancePoints;
    }

    public void setResistancePoints(int resistancePoints) {
        this.resistancePoints = resistancePoints;
    }

    @Override
    public void recivedDamage(int damage) {
        try {
            damageLessThenArmorException(damage);
            setCurrentHealth(getCurrentHealth() - damage + resistancePoints);
            if (getCurrentHealth() > 0) System.out.println("Sorcerer current health " + getCurrentHealth());
        } catch (DamageLessThenArmor damageLessThenArmor) {
        }
    }

    public void damageLessThenArmorException(int damage) throws DamageLessThenArmor {
        if (damage <= resistancePoints) throw new DamageLessThenArmor();
    }

    public void displaySpellBookStream(){
        System.out.println("Spellbook");
        spellBook.forEach(x-> System.out.println(x.toString()));
    }

    public void addSpellToSpellBook(Spell spell) {
        if (spellBook.add(spell)) {
            spellBook.add(spell);
            System.out.println("Spell " + spell.getName() + " added");
            setPowerOfDestructionHero(getPowerOfDestructionHero() + spell.getAdditionalPowerOfDestruction());
            setCurrentHealth(getCurrentHealth() + spell.getAdditionalHealthPoints());
            setResistancePoints(getResistancePoints() + spell.getAdditionalResistancePoints());
        } else System.out.println("Sorcerer have this kind of spell");
    }

    @Override
    public String toString() {
        return super.toString()  + " resistancePoints=" + resistancePoints;
    }

}

