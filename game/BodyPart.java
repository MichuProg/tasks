package sda.game;

public enum BodyPart {
    HEAD("head"),
    LEFTARM("left arm"),
    RIGHTARM("right arm"),
    LEFTLEG("left leg"),
    RIGHTLEG("right leg"),
    TORSO("torso");

    private String full;

    BodyPart(String full) {
        this.full = full;
    }

    public String getFull() {
        return full;
    }
}
