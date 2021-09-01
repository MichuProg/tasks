package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hero implements Character {
    private final String name;
    private final Race race;
    private int currentHealth;
    private final InventoryObject[] inventoryTab = new InventoryObject[10];
    private boolean overloaded;
    private final double maximumWeight = 20;
    private int powerOfDestructionHero = 20;
    private int wallet = 100;
    private int enemyDefeated = 0;

    public Hero(String name, Race race) {
        this.name = name;
        this.race = race;
        this.currentHealth = healthDependsOfRace();
    }

    public int getEnemyDefeated() {
        return enemyDefeated;
    }

    public void setEnemyDefeated(int enemyDefeated) {
        this.enemyDefeated = enemyDefeated;
    }

    public InventoryObject[] getInventoryTab() {
        return inventoryTab;
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public int healthDependsOfRace() {
        int health = 0;
        switch (getRace()) {
            case ELF -> health = 110;
            case DWARF -> health = 200;
            case HUMAN -> health = 150;
        }
        return health;
    }

    public void displayInventoryTab() {
        int i = 0;
        for (InventoryObject item :
                getInventoryTab()) {
            if (item != null) {
                System.out.println(i + " " + item);
            }
            i++;
        }
    }

    public void displayStreamInventoryTab() {
        System.out.println(getName() + " inventory:");
        List<InventoryObject> list1 = Arrays.asList(getInventoryTab());
        list1.forEach(a -> {
            if (a != null) {
                System.out.println(a);
            }
        });
    }

    public void noEmptySlotOnTable() throws NoEmptySlotException {
        int sum = 0;
        for (InventoryObject object : inventoryTab) {
            if (object != null) {
                sum++;
            }
        }
        if (sum == inventoryTab.length) {
            throw new NoEmptySlotException("Inventory full, can't add new item");
        }
    }

    public void addItemToTable(InventoryObject item) { //dodajac item do tabeli zwiekszamy jego ilosc w obiekcie
        boolean myFlag = false;
        try {
            noEmptySlotOnTable();
            for (int i = 0; i <= getInventoryTab().length - 1; i++) {
                if (getInventoryTab()[i] != null) {
                    if (getInventoryTab()[i].equals(item)) {
                        getInventoryTab()[i].count += item.getCount();
                        myFlag = true;
                        break;
                    }
                }
            }
            if (!myFlag) {
                for (int j = 0; j <= getInventoryTab().length - 1; j++) {
                    if (getInventoryTab()[j] == null) {
                        getInventoryTab()[j] = item;
                        break;
                    }
                }
            }
            isOverloaded();
        } catch (NoEmptySlotException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean isOverloaded() {
        double weight = currentWeightValue();
        if (weight > maximumWeight) System.out.println("Overloaded " + weight);
        return weight > maximumWeight;
    }

    public double currentWeightValue(){
        return listFiltered().stream().map(a -> a.getCount() * a.getWeight()).reduce((double) 0, Double::sum);
    }

    private List<InventoryObject> listFiltered() {
        List<InventoryObject> list = Arrays.asList(getInventoryTab());
        List<InventoryObject> listFiltered = new ArrayList<>();
        list.forEach(a -> {
            if (a != null) {
                listFiltered.add(a);
            }
        });
        return listFiltered;
    }

    @Override
    public void recivedDamage(int damage) {
        setCurrentHealth(getCurrentHealth() - damage);
        if (getCurrentHealth() > 0) System.out.println("Hero current health " + getCurrentHealth());
    }

    public void obstacleDamage(int damage){
        setCurrentHealth(getCurrentHealth() - damage);
        if (getCurrentHealth() > 0) System.out.println("Hero current health " + getCurrentHealth());
    }


    public void treatment(int indexTableObjects) {
        if (inventoryTab[indexTableObjects] instanceof Food) {
            System.out.println("Treatment " + ((Food) inventoryTab[indexTableObjects]).getHealthPointsRegenration());
            setCurrentHealth(getCurrentHealth() + ((Food) inventoryTab[indexTableObjects]).getHealthPointsRegenration());
            System.out.println("CurrentHealth " + getCurrentHealth());
        } else {
            System.out.println("This is not a food");
        }
    }

    public int getPowerOfDestructionHero() {
        return powerOfDestructionHero;
    }

    public void setPowerOfDestructionHero(int powerOfDestructionHero) {
        this.powerOfDestructionHero = powerOfDestructionHero;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", race=" + race +
                ", currentHealt=" + currentHealth +
                ", overloaded=" + overloaded +
                ", powerOfDestructionHero=" + powerOfDestructionHero +
                ", wallet=" + wallet +
                '}';
    }

}