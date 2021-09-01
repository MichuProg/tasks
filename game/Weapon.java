package sda.game;

public class Weapon extends InventoryObject {
    private int damagePoints;

    public Weapon(String name, double weight, int count, int damagePoints) {
        super(name, weight, count);
        this.damagePoints = damagePoints;
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    @Override
    public String toString() {
        return super.toString() + " damage points: " +getDamagePoints();
    }
}
