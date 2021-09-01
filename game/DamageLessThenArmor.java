package game;

public class DamageLessThenArmor extends Exception {
    public DamageLessThenArmor() {
        System.out.println("Hero doesn't take damage, dps Enemy less then armor or resistance points");
    }
}
