package sda.game;

import java.util.Objects;

public abstract class Enemy implements Character{
    private final String name;
    private int healthPoints;
    private final int powerOfDestruction;

    public Enemy(String name, int healthPoints, int powerOfDestruction) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.powerOfDestruction = powerOfDestruction;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getPowerOfDestruction() {
        return powerOfDestruction;
    }

    public String getName() {
        return name;
    }

    @Override
    public void recivedDamage(int damage) {
        setHealthPoints(getHealthPoints() - damage);
        if (getHealthPoints() > 0) System.out.println("Enemy current health " + getHealthPoints());
        else System.out.println("Enemy dead");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enemy enemy = (Enemy) o;
        return healthPoints == enemy.healthPoints && powerOfDestruction == enemy.powerOfDestruction && Objects.equals(name, enemy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, healthPoints, powerOfDestruction);
    }
}
