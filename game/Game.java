package sda.game;

import java.util.HashMap;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws IncorrectNumber, GameOverException {
        GameMap gameMap = new GameMap();
        gameMap.createGameMap();
        gameMap.readGameMapFromFile();
        gameMap.findPositionHero();
        gameMap.findPositionFinish();
        help();
        EnemyRepository enemyRepository = new EnemyRepository();
        enemyRepository.repoEnemies();
        HeroRepository heroRepository = new HeroRepository();
        Hero hero = heroRepository.chooseYourHero();
        enemyRepository.displayEnemies();
        Enemy enemy = enemyRepository.drawEnemy();
        Trader trader = traderData();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            gameMap.displayGameMapForHero();
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("w") || command.equalsIgnoreCase("a") || command.equalsIgnoreCase("s") || command.equalsIgnoreCase("d")) {
                gameMap.heroMoveOnMap(command, hero, trader, enemy);
                if (hero.getCurrentHealth()<=0 || !gameMap.isGameStatus()) break;
            }
            switch (command) {
                case "inventory" -> hero.displayInventoryTab();
                case "eat" -> {
                    System.out.println("Enter index of item: ");
                    int indexForInventoryTab = scanner.nextInt();
                    hero.treatment(indexForInventoryTab);
                }
                case "help" -> help();
                case "weapon" -> {
                    if (hero instanceof Warrior) {
                        System.out.println("Enter index of item: ");
                        int indexForInventoryTab = scanner.nextInt();
                        ((Warrior) hero).assignWeaponFromTable(indexForInventoryTab);
                    } else {
                        System.out.println("Hero is not a Warrior, can not assign weapon");
                    }
                }
            }
        }


    }

    public static void help() {
        System.out.println("Write to console:");
        System.out.println("""
                WASD – to move Hero,
                inventory – check inventory,
                eat – to eat,
                weapon – to load weapon,
                help – to check help menu""");
    }

    public static Trader traderData(){
        HashMap<InventoryObject, Integer> stockForTrader = new HashMap<>();
        InventoryObject dragonShield = new ArmorPart("dragon shield", 2, 1, 4, BodyPart.LEFTARM);
        Weapon bloodAxe = new Weapon("blood axe", 3, 1, 40);
        Food smallPotion = new Food("small potion", 0.5, 1, 20);
        stockForTrader.put(dragonShield, 50);
        stockForTrader.put(bloodAxe, 80);
        stockForTrader.put(smallPotion, 15);
        return new Trader(stockForTrader);
    }
}
