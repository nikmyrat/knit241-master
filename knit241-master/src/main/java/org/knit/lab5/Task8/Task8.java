package org.knit.lab5.Task8;

import java.util.*;

public class Task8 {
    public void execute() {
        String[] names = {"Книга", "Ручка", "Линейка", "Пенал"};
        Random random = new Random();
        ShopItem[] items = new ShopItem[100];

        for (int i = 0; i < 90; i++) {
            String name = names[random.nextInt(names.length)];
            double price = Math.round((10 + random.nextDouble() * 90) * 100.0) / 100.0;
            int quantity = random.nextInt(50) + 1;
            items[i] = new ShopItem(name, price, quantity);
        }
        items[90] = new ShopItem("Книга", 10.00, 1);
        items[91] = new ShopItem("Книга", 10.00, 1);
        items[92] = new ShopItem("Книга", 10.00, 1);
        items[93] = new ShopItem("Ручка", 20.00, 3);
        items[94] = new ShopItem("Ручка", 20.00, 3);
        items[95] = new ShopItem("Линейка", 50.00, 10);
        items[96] = new ShopItem("Линейка", 50.00, 10);
        items[97] = new ShopItem("Пенал", 60.00, 5);
        items[98] = new ShopItem("Пенал", 60.00, 5);
        items[99] = new ShopItem("Пенал", 60.00, 4);

        Arrays.sort(items, new ItemComparator());


        System.out.println("Отсортированные объекты:");
        for (ShopItem item : items) {
            System.out.println(item);
        }


        Map<ShopItem, Integer> itemCounts = new HashMap<>();
        for (ShopItem item : items) {
            itemCounts.put(item, itemCounts.getOrDefault(item, 0) + 1);
        }


        System.out.println("\nКоличество одинаковых объектов:");
        for (Map.Entry<ShopItem, Integer> entry : itemCounts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " раз(а)");
            }
        }
    }
}

