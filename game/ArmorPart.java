package sda.game;

public class ArmorPart extends InventoryObject {
    private int damageResistance;
    private BodyPart bodyPart;

    public ArmorPart(String name, double weight, int count, int damageResistance, BodyPart bodyPart) {
        super(name, weight, count);
        this.damageResistance = damageResistance;
        this.bodyPart = bodyPart;
    }

    public BodyPart getBodyPart() {
        return bodyPart;
    }

    public int getDamageResistance() {
        return damageResistance;
    }

    @Override
    public String toString() {
        return super.toString() + " damage resistance: " + getDamageResistance() + ", body part: " + getBodyPart();
    }
}
