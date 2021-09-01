package sda.game;

public class Monster extends Enemy {
    private String shortDescription;

    public Monster(String name, int healthPoints, int powerOfDestruction, String shortDescription) {
        super(name, healthPoints, powerOfDestruction);
        this.shortDescription = shortDescription;
    }
}
