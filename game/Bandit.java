package sda.game;

import com.sun.jdi.InvalidTypeException;

public class Bandit extends Enemy {
    private Weapon banditWeapon;

    public Bandit(String name, int healthPoints, int powerOfDestruction, Weapon banditWeapon) {
        super(name, healthPoints, powerOfDestruction);

            this.banditWeapon = banditWeapon;

    }

    public Weapon getBanditWeapon() {
        return banditWeapon;
    }

    public void setBanditWeapon(Weapon banditWeapon) {
        this.banditWeapon = banditWeapon;
    }
}
