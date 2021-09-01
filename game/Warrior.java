package game;

public class Warrior extends Hero implements Character {
    private Weapon weapon;
    private Armor armor;

    public Warrior(String name, Race race, Weapon weapon, Armor armor) {
        super(name, race);
        this.weapon = weapon;
        this.armor = armor;
    }

    public boolean isWeaponNull() {
        return getWeapon() == null;
    }

    public boolean isItemAWeapon(int indexTable) {
        return getInventoryTab()[indexTable] instanceof Weapon;
    }

    public void deleteWeaponFromTable(int indexTable) {
        if (getInventoryTab()[indexTable].getCount() != 1) {
            getInventoryTab()[indexTable].setCount(getInventoryTab()[indexTable].getCount() - 1);
        } else getInventoryTab()[indexTable] = null;
    }

    public InventoryObject[] assignWeaponFromTable(int indexTable) {
        InventoryObject temp = new Weapon("temp", 0, 0,0);
        try {
            if (!isWeaponNull()) {
                temp = weapon;
            }
            weapon = (Weapon) getInventoryTab()[indexTable];
            System.out.println(weapon);
            deleteWeaponFromTable(indexTable);
            addItemToTable(temp);
        }catch (ClassCastException e){
            System.out.println(temp.getName() + " isn't a weapon " +e.getMessage());
        }
        return getInventoryTab();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public InventoryObject[] assignArmorPartFromTable(int indexTable) {
        ArmorPart temp = new ArmorPart("temp", 0, 0,0,BodyPart.HEAD);
        ArmorPart armorPartForCast = new ArmorPart("armorPartForCast",0,0,0,BodyPart.HEAD);
        if (getInventoryTab()[indexTable]!=null) {
            if (getInventoryTab()[indexTable] instanceof ArmorPart) armorPartForCast = (ArmorPart) getInventoryTab()[indexTable];
            temp=getArmor().addArmorPartToArmor(armorPartForCast);
            deleteArmorPartFromTable(indexTable);
            addItemToTable(temp);
        } else System.out.println("This isn't armorPart");
        return getInventoryTab();
    }

    public void deleteArmorPartFromTable(int indexTable) {
        if (getInventoryTab()[indexTable].getCount() != 1) {
            getInventoryTab()[indexTable].setCount(getInventoryTab()[indexTable].getCount() - 1);
        } else getInventoryTab()[indexTable] = null;
    }

    public Armor getArmor() {
        return armor;
    }

    @Override
    public void recivedDamage(int damage) {
        try {
        damageLessThenArmorException(damage);
        setCurrentHealth(getCurrentHealth() - damage + armor.wariorArmorProtection());
        if (getCurrentHealth() > 0) System.out.println("Warrior current health " + getCurrentHealth());
        } catch (DamageLessThenArmor damageLessThenArmor) {
        }
    }

    public void damageLessThenArmorException(int damage) throws DamageLessThenArmor {
        if (damage<= armor.wariorArmorProtection()) throw new DamageLessThenArmor();
    }

}
