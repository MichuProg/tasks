package game;

import java.io.IOException;
import java.util.HashMap;
import java.util.TreeSet;

public class Main {
    private static Hero[] heroes;

    public static void main(String[] args) throws GameOverException, IncorrectNumber, IOException {
        Weapon slicer = new Weapon("slicer", 2.6, 1, 70);
        Weapon corruptedSword = new Weapon("Corrupted sword", 2, 1, 85);
        ArmorPart letterHelmet = new ArmorPart("letter helmet", 3.4, 1, 10, BodyPart.HEAD);
        ArmorPart letterCap = new ArmorPart("letter cap", 3.4, 1, 10, BodyPart.HEAD);
        ArmorPart letterLeftBracelet = new ArmorPart("letter left bracelet", 1.4, 1, 5, BodyPart.LEFTARM);
        Food sandwitch = new Food("sandwitch", 0.3, 3, 10);
        Armor letterArmor = new Armor();
        letterArmor.addArmorPartToArmor(letterHelmet);
        letterArmor.addArmorPartToArmor(letterLeftBracelet);
        letterArmor.addArmorPartToArmor(letterCap);
        Warrior Legolas = new Warrior("Legolas", Race.ELF, slicer, letterArmor);
        heroes = new Hero[]{Legolas};
        for (Hero hero : heroes) {
            System.out.println(hero.getName());
        }
        System.out.println(Legolas.getName());
        System.out.println(Legolas.getRace());
        System.out.println(Legolas.getCurrentHealth());
        InventoryObject shield = new ArmorPart("shield", 2, 1, 3, BodyPart.LEFTARM);
        InventoryObject sword = new Weapon("sword", 3, 1, 35);
        InventoryObject sword2 = new Weapon("dark sword", 3, 4, 80);
        InventoryObject sword3 = new Weapon("flame sword", 3, 4, 100);
        Legolas.addItemToTable(shield);
        Legolas.addItemToTable(sword);
        Legolas.addItemToTable(sword2);
        Legolas.addItemToTable(sword3);
        Legolas.addItemToTable(letterHelmet);
        Legolas.addItemToTable(slicer);
        Legolas.addItemToTable(sandwitch);
        Legolas.displayInventoryTab();
        Legolas.recivedDamage(20);
        System.out.println(Legolas.getCurrentHealth());
        Legolas.treatment(6);
        Legolas.isWeaponNull();
        Legolas.assignWeaponFromTable(6);
        Legolas.displayInventoryTab();
        Legolas.assignArmorPartFromTable(4);
        Legolas.displayInventoryTab();
        Enemy oneEyeJohn = new Bandit("One Eye John", 220, 50, corruptedSword);
        Enemy murlock = new Monster("Murki", 150, 30, "Monster from swans");
        CombatMode LegolasVSJohn = new CombatMode(Legolas, oneEyeJohn);
        CombatMode.fightToDead();
        Legolas.displayInventoryTab();
        System.out.println(Legolas.getArmor().wariorArmorProtection());
        Legolas.getArmor().displayWarriorArmor();
        Spell Fireball = new Spell("Fireball", 9, 0, 0);
        Spell IceCone = new Spell("Ice cone", 0, 0, 2);
        Spell HolyPotion = new Spell("Holy potion", 4, 20, 5);
        TreeSet<Spell> SpellBookGandalf = new TreeSet<>();
        Sorcerer Gandalf = new Sorcerer("Gandalf", Race.HUMAN, 10, SpellBookGandalf);
        System.out.println(Gandalf);
        Gandalf.addSpellToSpellBook(Fireball);
        Gandalf.addSpellToSpellBook(IceCone);
        Gandalf.addSpellToSpellBook(HolyPotion);
        Gandalf.displaySpellBookStream();
        Gandalf.addSpellToSpellBook(Fireball);
        Spell Roots = new Spell("Roots", 10, 2, 2);
        Gandalf.addSpellToSpellBook(Roots);
        Gandalf.displaySpellBookStream();
        System.out.println(Gandalf);
        HeroRepository repoBasicHeroes = new HeroRepository();
        //Hero choosedHeroBasic = repoBasicHeroes.chooseYourHero();
        InventoryObject dragonShield = new ArmorPart("dragon shield", 2, 1, 4, BodyPart.LEFTARM);
        Weapon bloodAxe = new Weapon("blood axe", 3, 1, 40);
        Food smallPotion = new Food("small potion", 0.5, 1, 20);
        HashMap<InventoryObject, Integer> stockForTrader = new HashMap<>();
        stockForTrader.put(dragonShield, 50);
        stockForTrader.put(bloodAxe, 80);
        stockForTrader.put(smallPotion, 15);
        Trader Cheater = new Trader(stockForTrader);
        TradeMode firstTrade = new TradeMode(Legolas, Cheater);
        //firstTrade.buyItem();
        //Legolas.displayInventoryTab();
        Legolas.displayStreamInventoryTab();
        Gandalf.displaySpellBookStream();
        repoBasicHeroes.heroToChooseFilterByName();
        repoBasicHeroes.heroToChooseFilterByRace();
        repoBasicHeroes.heroToChooseFilteredByCurrentHealth();
        repoBasicHeroes.heroToChooseFilteredByNameOFWeapon();
        System.out.println("sprawdzenie po wadze");
        repoBasicHeroes.heroFilterByWeight();
        InventoryObject tab1[] = new InventoryObject[10];
        tab1 = (HeroRepository.heroData().get(1).getInventoryTab());
        for (InventoryObject item : tab1) {
            if (item != null)
                System.out.println(item.getName());
        }
        System.out.println(HeroRepository.heroData().get(1).currentWeightValue());
        System.out.println(HeroRepository.heroData().get(2).currentWeightValue());
        System.out.println(HeroRepository.heroData().get(3).currentWeightValue());
        HeroRepository.heroData().get(1).displayStreamInventoryTab();
        HeroRepository.heroData().get(2).displayStreamInventoryTab();
        HeroRepository.heroData().get(3).displayStreamInventoryTab();
        repoBasicHeroes.heroFilterByWeight();
        firstTrade.displayStreamTradeStock();
        firstTrade.filteredTraderStockByPrice();
        firstTrade.sumOfTraderStockValue();
        firstTrade.filterTraderWeaponByDamagePoints();
        GameMap mapForTest = new GameMap();
        mapForTest.createGameMap();
        mapForTest.readGameMapFromFile();
    }
}
