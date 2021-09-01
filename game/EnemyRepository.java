package game;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

public class EnemyRepository {
    private final HashSet<Enemy> enemies = new HashSet<>();

    public void repoEnemies() {
        Weapon corruptedSword = new Weapon("Corrupted sword", 2, 1, 85);
        Weapon swordDestroyer = new Weapon("Destroyer", 2, 1, 90);
        Enemy oneEyeJohn = new Bandit("One Eye John", 220, 50, corruptedSword);
        Enemy blindAndrew = new Bandit("Blind Andrew", 250, 50, swordDestroyer);
        Enemy murlock = new Monster("Murki", 150, 30, "Monster from swans");
        Enemy troll = new Monster("Rock Troll", 400, 200, "He likes eat heroes heads");
        Enemy wyvern = new Monster("Winter Wyvern", 350,300, "Ancient evil hidden in winter mountains ");
        enemies.add(oneEyeJohn);
        enemies.add(blindAndrew);
        enemies.add(murlock);
        enemies.add(troll);
        enemies.add(wyvern);
    }

    public void displayEnemies(){
        enemies.forEach(enemy -> System.out.println(enemy.getName()));
    }

    public Enemy drawEnemy(){
        Random random = new Random();
        int randomNumber;
        randomNumber=random.nextInt(enemies.size()-1);
        LinkedList<Enemy> enemiesLinkedList = new LinkedList<>(enemies);
        System.out.println(enemiesLinkedList.get(randomNumber).getName());
        return enemiesLinkedList.get(randomNumber);
    }
}
