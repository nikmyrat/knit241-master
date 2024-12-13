package org.knit.lab5.Task8;

import java.util.Comparator;

public class ItemComparator implements Comparator<ShopItem> {
    @Override
    public int compare(ShopItem o1, ShopItem o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

