package game;

import java.util.TreeSet;


public class Armor {

    private ArmorPart head = new ArmorPart("empty", 0, 0, 0, BodyPart.HEAD);
    private ArmorPart leftArm = new ArmorPart("empty", 0, 0, 0, BodyPart.LEFTARM);
    private ArmorPart rightArm = new ArmorPart("empty", 0, 0, 0, BodyPart.RIGHTARM);
    private ArmorPart leftLeg = new ArmorPart("empty", 0, 0, 0, BodyPart.LEFTLEG);
    private ArmorPart rightLeg = new ArmorPart("empty", 0, 0, 0, BodyPart.RIGHTLEG);
    private ArmorPart torso = new ArmorPart("empty", 0, 0, 0, BodyPart.TORSO);

    public Armor() {
    }

    public ArmorPart getHead() {
        return head;
    }

    public ArmorPart getLeftArm() {
        return leftArm;
    }

    public ArmorPart getRightArm() {
        return rightArm;
    }

    public ArmorPart getLeftLeg() {
        return leftLeg;
    }

    public ArmorPart getRightLeg() {
        return rightLeg;
    }

    public ArmorPart getTorso() {
        return torso;
    }

    public void setHead(ArmorPart head) {
        this.head = head;
    }

    public ArmorPart isSomethingWeared(ArmorPart part) {
        ArmorPart temp = new ArmorPart("empty", 0, 0, 0, BodyPart.HEAD);
        if (!part.getName().equals("empty")) {
            System.out.println("something is weared " + part.getName());
            temp = part;
        }
        return temp;
    }

    public int wariorArmorProtection() {
        int sumOfArmorProtection;
        sumOfArmorProtection = getHead().getDamageResistance() + getLeftArm().getDamageResistance() + getRightArm().getDamageResistance() + getLeftLeg().getDamageResistance() + getRightLeg().getDamageResistance() + getTorso().getDamageResistance();
        return sumOfArmorProtection;
    }

    public void displayWarriorArmor() {
        System.out.println("Head -> " + getHead());
        System.out.println("Left arm -> " + getLeftArm());
        System.out.println("Right arm -> " + getRightArm());
        System.out.println("Left leg -> " + getLeftLeg());
        System.out.println("Right leg -> " + getRightLeg());
        System.out.println("Torso -> " + getTorso());
    }

    public ArmorPart addArmorPartToArmor(ArmorPart armorToAdd) {
        ArmorPart temp = new ArmorPart("empty", 0, 0, 0, BodyPart.HEAD);
        switch (armorToAdd.getBodyPart()) {
            case HEAD:
                temp = isSomethingWeared(this.head);
                this.head = armorToAdd;
                System.out.println("added helmet " + armorToAdd.getName());
                break;
            case LEFTARM:
                temp = isSomethingWeared(this.leftArm);
                this.leftArm = armorToAdd;
                System.out.println("added left arm " + armorToAdd.getName());
                break;
            case RIGHTARM:
                temp = isSomethingWeared(this.rightArm);
                this.rightArm = armorToAdd;
                System.out.println("added right arm " + armorToAdd.getName());
                break;
            case LEFTLEG:
                temp = isSomethingWeared(this.leftLeg);
                this.leftLeg = armorToAdd;
                System.out.println("added left leg " + armorToAdd.getName());
                break;
            case RIGHTLEG:
                temp = isSomethingWeared(this.rightLeg);
                this.rightLeg = armorToAdd;
                System.out.println("added right leg " + armorToAdd.getName());
                break;
            case TORSO:
                temp = isSomethingWeared(this.torso);
                this.torso = armorToAdd;
                System.out.println("added torso " + armorToAdd.getName());
                break;
            default:
                System.out.println("Body part not recognized");
        }
        return temp;
    }
}

