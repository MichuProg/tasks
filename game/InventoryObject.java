package sda.game;

import java.util.Objects;

public abstract class InventoryObject {
    private String name;
    private double weight;
    protected int count;

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public InventoryObject(String name, double weight, int count) {
        this.name = name;
        this.weight = weight;
        this.count = count;
    }

    public InventoryObject(String name, double weight) {
        this.name = name;
        this.weight = weight;
        this.count = 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        InventoryObject item = (InventoryObject) o;
        return Objects.equals(name, item.name) &&
                Objects.equals(weight, item.weight);
    }

    @Override
    public String toString() {
        return "Inventory object {" + "name: " + getName() + ", weight: " + getWeight() + ", count: " +getCount()+ "}";
    }
}
