package sda.game;

import java.util.HashMap;

public class Trader {
    private HashMap<InventoryObject, Integer> stock;

    public Trader(HashMap<InventoryObject, Integer> stock) {
        this.stock = stock;
    }

    public HashMap<InventoryObject, Integer> getStock() {
        return stock;
    }

    public void displayTraderStockFromTraderObject() {
        HashMap<InventoryObject, Integer> stockToOperate = new HashMap<>();
        stockToOperate = getStock();
        System.out.println("Trader stock:");
        for (InventoryObject item : stockToOperate.keySet()) {
            System.out.println(item.toString() + " price:" + stockToOperate.get(item) + " gold");
        }
    }
}
