package game;

import java.util.*;
import java.util.stream.Stream;

public class HeroRepository {
    private final HashMap<Integer, Hero> heroesToChoose = heroData();


    public HashMap<Integer, Hero> getHeroesToChoose() {
        return heroesToChoose;
    }

    public Hero chooseYourHero() throws IncorrectNumber {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Your Hero (Press 1, 2 or 3): \n1.Walczak -Meele Warior \n2.Lucznik - Sniper \n3.Wicher - Sorcerer ");
        int whatHero = 1;
        try {
            whatHero=scanner.nextInt();
            incorrectNumberChoose(whatHero);
            System.out.println(whatHero);
            System.out.println(getHeroesToChoose().get(whatHero).getName());
        } catch (IncorrectNumber | InputMismatchException incorrectNumber) {
            System.out.println(incorrectNumber);
            chooseYourHero();
        }
        return getHeroesToChoose().get(whatHero);
    }

    public static HashMap<Integer, Hero> heroData() {
        HashMap<Integer, Hero> heroToChoose = new HashMap<>();
        TreeSet<Spell> spellForWitcher = new TreeSet<>();
        Spell Fireball = new Spell("Fireball", 9, 0, 0);
        Spell IceCone = new Spell("Ice cone", 0, 0, 2);
        Spell HolyPotion = new Spell("Holy potion", 4, 20, 5);
        spellForWitcher.add(Fireball);
        spellForWitcher.add(IceCone);
        spellForWitcher.add(HolyPotion);
        Weapon basicSword = new Weapon("basic sword", 2, 1, 30);
        Weapon basicArc = new Weapon("basic arc", 2, 1, 35);
        Armor basicArmor = new Armor();
        ArmorPart basicHelmet = new ArmorPart("basic helmet", 5, 1, 5, BodyPart.HEAD);
        InventoryObject chicken = new Food("chicken", 2, 1, 10);
        basicArmor.setHead(basicHelmet);
        Warrior Walczak = new Warrior("Walczak", Race.DWARF, basicSword, basicArmor);
        Warrior Sniper = new Warrior("Sniper", Race.ELF, basicArc, basicArmor);
        Sorcerer Witcher = new Sorcerer("Witcher", Race.HUMAN, 10, spellForWitcher);
        Walczak.addItemToTable(chicken);
        Sniper.addItemToTable(basicHelmet);
        Witcher.addItemToTable(chicken);
        Sniper.addItemToTable(basicHelmet);
        Witcher.addItemToTable(basicHelmet);
        Sniper.addItemToTable(basicHelmet);
        heroToChoose.put(1, Walczak);
        heroToChoose.put(2, Sniper);
        heroToChoose.put(3, Witcher);
        return heroToChoose;
    }

    public void incorrectNumberChoose(int number) throws IncorrectNumber {
        if (number <= 0 || number > 3) throw new IncorrectNumber("Incorrect number, try again!");
    }

    public void heroToChooseFilterByName() {
        String partOfName = "i";
        Stream<Hero> heroes = getHeroesToChoose().values().stream().filter(name -> name.getName().contains(partOfName));
        heroes.forEach(x -> System.out.println(x.toString()));
    }

    public void heroToChooseFilterByRace() {
        Race raceToFind = Race.ELF;
        getHeroesToChoose().values().stream().filter(race -> race.getRace().equals(raceToFind)).forEach(System.out::println);
    }

    public void heroToChooseFilteredByCurrentHealth() {
        int healthToFilter = 130;
        getHeroesToChoose().values().stream().filter(currentHelath -> currentHelath.getCurrentHealth() > healthToFilter).forEach(System.out::println);
    }

    public void heroToChooseFilteredByNameOFWeapon() {
        String weaponName = "basic sword";
        getHeroesToChoose().values().stream().filter(hero -> hero instanceof Warrior).filter(hero -> ((Warrior) hero).getWeapon().getName().equals(weaponName)).forEach(System.out::println);
    }

    public void heroFilterByWeight() {
        double overloadedMax = 20;
        double overloadedMin = 3;
        System.out.println("powinienem wyswietlic");
        getHeroesToChoose().values().forEach(hero -> System.out.println(hero.getName() + " " +hero.currentWeightValue()));
        getHeroesToChoose().values().stream().filter(hero -> hero.currentWeightValue() >= overloadedMin).filter(hero -> hero.currentWeightValue() <= overloadedMax).forEach(System.out::println);
    }

}
