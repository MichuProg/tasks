package game;

import java.io.*;
import java.util.Arrays;

public class GameMap {
    private String[][] gameMapForHero = new String[10][30];
    private String elementThatHeroStandsOnMap = "_";
    private boolean gameStatus=true;

    public boolean isGameStatus() {
        return gameStatus;
    }

    public void setGameMapForHero(String[][] gameMapForHero) {
        this.gameMapForHero = gameMapForHero;
    }

    public void createGameMap() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt"));
            bufferedWriter.write("""
                    ~~~~~~_________?...._______E_F
                    __~~~~~__E_____________....~~_
                    ____~~~~~~~_________..__E~~___
                    _______~~~~~~~~________~~_____
                    __________~~~~__E____[[..___..
                    ___________[[[[E__~~~~_____...
                    ____________~~~~~~~~_______?..
                    _________E____~~~~____E_______
                    _______________~~~____________
                    H______________~~~~~_________T""");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Map created");
    }

    public void readGameMapFromFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"));
            String line;
            String[][] tableForMap = new String[10][30];
            int j = 0;
            System.out.println("Read map...");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                for (int i = 0; i < 30; i++) {
                    tableForMap[j][i] = String.valueOf(line.charAt(i));
                }
                j++;
            }
            bufferedReader.close();
            setGameMapForHero(tableForMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayGameMapForHero() {
        try {
            for (int i = 0; i < 10; i++) {
                Arrays.stream(gameMapForHero[i]).sequential().forEach(System.out::print);
                System.out.println();
            }
        } catch (NullPointerException e) {
            System.out.println("Map has not been loaded");
        }
    }

    public int[] findPosition(String sign) {
        int[] position = new int[2];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 30; j++) {
                if (gameMapForHero[i][j].equals(sign)) {
                    position[0] = i;
                    position[1] = j;
                }
            }
        }
        return position;
    }

    public void findPositionFinish() {
        findPosition("F");
    }

    public int[] findPositionHero() {
        return findPosition("H");
    }

    public void heroMoveOnMap(String command, Hero hero, Trader trader, Enemy enemy) throws GameOverException {
        int[] position = findPositionHero();
        int row = position[0];
        int column = position[1];
        switch (command.toLowerCase()) {
            case "w" -> {
                if (row >= 1 && !gameMapForHero[row-1][column].equals("[")) {
                    System.out.println("UP");
                    gameMapForHero[row][column] = elementThatHeroStandsOnMap;
                    row--;
                    elementThatHeroStandsOnMap = gameMapForHero[row][column];
                    terrainObstacle(hero, trader, enemy);
                    gameMapForHero[row][column] = "H";
                } else {
                    System.out.println("You cant move UP");
                }
            }
            case "s" -> {
                if (row <= 8 && !gameMapForHero[row+1][column].equals("[")) {
                    System.out.println("Down");
                    gameMapForHero[row][column] = elementThatHeroStandsOnMap;
                    row++;
                    elementThatHeroStandsOnMap = gameMapForHero[row][column];
                    terrainObstacle(hero, trader, enemy);
                    gameMapForHero[row][column] = "H";
                } else {
                    System.out.println("You cant move Down");
                }
            }
            case "d" -> {
                if (column <= 28 && !gameMapForHero[row][column+1].equals("[")) {
                    System.out.println("Right");
                    gameMapForHero[row][column] = elementThatHeroStandsOnMap;
                    column++;
                    elementThatHeroStandsOnMap = gameMapForHero[row][column];
                    terrainObstacle(hero, trader, enemy);
                    gameMapForHero[row][column] = "H";
                } else {
                    System.out.println("You can not move Right");
                }
            }
            case "a" -> {
                if (column >= 1 && !gameMapForHero[row][column-1].equals("[")) {
                    System.out.println("Left");
                    gameMapForHero[row][column] = elementThatHeroStandsOnMap;
                    column--;
                    elementThatHeroStandsOnMap = gameMapForHero[row][column];
                    terrainObstacle(hero, trader, enemy);
                    gameMapForHero[row][column] = "H";
                } else {
                    System.out.println("You can not move Left");
                }
            }
        }
    }

    public void terrainObstacle(Hero hero, Trader trader, Enemy enemy) throws GameOverException {
        if (elementThatHeroStandsOnMap.equals("~")) {
            hero.obstacleDamage(1);
            if(!isHeroAlive(hero)) System.out.println("~ killed you, Game OVER");
        }
        if (elementThatHeroStandsOnMap.equals(".")) {
            hero.obstacleDamage(5);
            if (!isHeroAlive(hero)) System.out.println(". killed you, GAME OVER");
        }
        if (elementThatHeroStandsOnMap.equals("?")) {
            ArmorPart goldenShield = new ArmorPart("Golden shield", 5, 1, 30, BodyPart.LEFTARM);
            hero.addItemToTable(goldenShield);
            System.out.println("You find new new item!!" + goldenShield.getName());
        }
        if (elementThatHeroStandsOnMap.equals("T")){
            TradeMode tradeMode = new TradeMode(hero, trader);
            tradeMode.buyItem();
        }
        if (elementThatHeroStandsOnMap.equals("E")){
            CombatMode combatMode = new CombatMode(hero, enemy);
            System.out.println(enemy.getName());
            gameStatus=CombatMode.fightToDead();
        }
        if (elementThatHeroStandsOnMap.equals("F")){
            System.out.println("Congratulations you win!");
            System.out.println("Enemy defeated: " + hero.getEnemyDefeated());
            gameStatus=false;
        }
    }

    public boolean isHeroAlive (Hero hero){
        if (hero.getCurrentHealth()<=0) gameStatus=false;
        return gameStatus;
    }
}
