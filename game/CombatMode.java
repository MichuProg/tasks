package game;

import java.util.Random;

public class CombatMode {
    private static Hero hero;
    private static Enemy enemy;

    public CombatMode(Hero hero, Enemy enemy) {
        CombatMode.hero = hero;
        this.enemy = enemy;
    }

    public static Hero getHero() {
        return hero;
    }

    public static Enemy getEnemy() {
        return enemy;
    }

    public static boolean fightToDead() throws GameOverException {
        boolean myFlag=true;
        while (myFlag && !isCharacterEnemyDead(getEnemy())) {
            try {
                CombatMode.oneHit();
                heroDeadException(getHero());
                takingTheBanditWeapon();
                addDefetedEnemy();
            } catch (GameOverException e){
                System.out.println(e.getMessage());
                return myFlag=false;
            }
        }
        return myFlag;
    }

    public static void oneHit() {
        Hero characterHero = getHero();
        Enemy characterEnemy = getEnemy();
        Warrior heroForCast;
        if (characterHero instanceof Warrior) {
            heroForCast = (Warrior) characterHero;
            characterEnemy.recivedDamage(heroForCast.getWeapon().getDamagePoints());
            if (characterEnemy instanceof Bandit)
                heroForCast.recivedDamage(characterEnemy.getPowerOfDestruction());
            else if (characterEnemy instanceof Monster) {
                int monsterBonusDamage = new Random().nextInt(20);
                double monsterBonusDamageToDouble = (double) characterEnemy.getPowerOfDestruction() * monsterBonusDamage / 100;
                monsterBonusDamage = (int) monsterBonusDamageToDouble;
                heroForCast.recivedDamage((characterEnemy.getPowerOfDestruction()) + (monsterBonusDamage));
            }
        }
    }

    public static void heroDeadException(Hero character) throws GameOverException {
        if (character.getCurrentHealth() <=0) throw new GameOverException("GAME OVER");
        }

    public static boolean isCharacterEnemyDead(Enemy characterEnemy) {
        return characterEnemy.getHealthPoints() <= 0;
    }

    public static void takingTheBanditWeapon() {
        if (isCharacterEnemyDead(getEnemy())) {
            if (getEnemy() instanceof Bandit) {
                getHero().addItemToTable(((Bandit) getEnemy()).getBanditWeapon());
            }
        }
    }
    public static void addDefetedEnemy(){
        if (isCharacterEnemyDead(getEnemy())) getHero().setEnemyDefeated(getHero().getEnemyDefeated()+1);
    }
}