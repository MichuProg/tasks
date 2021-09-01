package sda.game;

import java.util.*;
import java.util.stream.Stream;

public class TradeMode {
    private final Hero hero;
    private final Trader trader;

    public TradeMode(Hero hero, Trader trader) {
        this.hero = hero;
        this.trader = trader;
    }

    public Hero getHero() {
        return hero;
    }

    public Trader getTrader() {
        return trader;
    }

    public void displayStreamTradeStock(){
        HashMap<InventoryObject, Integer> stockToOperate;
        stockToOperate = getTrader().getStock();
        System.out.println("Trader stock:");
        stockToOperate.keySet().forEach(x -> System.out.println(x + " price: " + stockToOperate.get(x) + " gold"));
    }

    public void filteredTraderStockByPrice(){
        HashMap<InventoryObject, Integer> stockToOperate;
        stockToOperate = getTrader().getStock();
        Integer minPrice = 30;
        Integer maxPrice = 80;
        System.out.println("Stock min price:: "+minPrice +" and max price: "+maxPrice);
        Stream<Map.Entry<InventoryObject, Integer>> stockFiltered = stockToOperate.entrySet().stream()
                .filter(x-> x.getValue()>=minPrice && x.getValue()<=maxPrice);
        stockFiltered.forEach(x-> System.out.println(x.getKey() + " ,price: " + x.getValue()));
    }

    public void sumOfTraderStockValue(){
        System.out.println("Sum of Trader Stock:");
        System.out.println(getTrader().getStock().values().stream().reduce(0, Integer::sum) + " gold");
    }

    public void filterTraderWeaponByDamagePoints(){
        int maxDamage = 60;
        int minDamage = 20;
        System.out.println("Trader weapon min damage points: " + minDamage + " ,max damage points: " + maxDamage);
        getTrader().getStock().keySet().stream()
                .filter(weapon -> weapon instanceof Weapon)
                .filter(weapon -> ((Weapon) weapon).getDamagePoints()>=minDamage && ((Weapon) weapon).getDamagePoints()<=maxDamage)
                .forEach(weapon -> System.out.println(weapon + " ,price: " + getTrader().getStock().get(weapon)));
    }

    public void buyItem() {
        Scanner scanner = new Scanner(System.in);
        displayStreamTradeStock();
        boolean myflag=true;
        while (myflag) {
            System.out.println("Enter the name of item you want to buy or type exit:");
            String itemToBuy = scanner.nextLine();
            if (itemToBuy.equals("exit")) myflag=false;
            Iterator<InventoryObject> iterator = getTrader().getStock().keySet().iterator();
            while (iterator.hasNext()) {
                InventoryObject item = iterator.next();
                if (item.getName().equals(itemToBuy)) {
                    Integer value = getTrader().getStock().get(item);
                    if (getHero().getWallet() >= value) {
                        getHero().setWallet(getHero().getWallet() - value);
                        iterator.remove();
                        System.out.println("Removed from trader stock:" + item.getName());
                        getHero().addItemToTable(item);
                        getHero().displayInventoryTab();
                        System.out.println("Hero gold left: " + getHero().getWallet());
                    } else {
                        System.out.println("Hero don't have that much gold");
                    }
                }
            }
            displayStreamTradeStock();
        }
    }
}
