package org.knit.lab5.Task8;

public class ShopItem {
    private String name;
    private double price;
    private int quantity;

    public ShopItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "ShopItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ShopItem shopItem = (ShopItem) obj;
        return Double.compare(shopItem.price, price) == 0 &&
                quantity == shopItem.quantity &&
                name.equals(shopItem.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + Double.hashCode(price) * 31 + Integer.hashCode(quantity) * 17;
    }
}
