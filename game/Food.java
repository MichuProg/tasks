package sda.game;

public class Food extends InventoryObject{
 private int healthPointsRegenration;

    public Food(String name, double weight, int count, int healthPointsRegenration) {
        super(name, weight, count);
        this.healthPointsRegenration= healthPointsRegenration;
    }

    public int getHealthPointsRegenration() {
        return healthPointsRegenration;
    }

    @Override
    public String toString() {
        return super.toString() + " health points regen: " + getHealthPointsRegenration();
    }
}
