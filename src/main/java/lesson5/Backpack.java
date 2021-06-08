package lesson5;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private final int maxWeight;
    private int bestPrice;
    private List<Item> bestItems = null;

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void calcBestSet(List<Item> items){
        if (items.isEmpty()) return;
        bestSet(items);
        for (int i = 0; i < items.size(); i++) {
            List<Item> copiedItems = new ArrayList<>(items);
            copiedItems.remove(i);
            calcBestSet(copiedItems);
        }
    }

    private void bestSet(List<Item> items) {
        int sumPrice = calcPrice(items);
        int sumWeight = calcWeight (items);
        if (sumWeight <= maxWeight && sumPrice > bestPrice){
            bestItems = items;
            bestPrice = sumPrice;
        }
    }

    private int calcWeight(List<Item> items) {
        int sum = 0;
        for (Item i: items) {
            sum += i.getWeight();
        }
        return sum;
    }

    private int calcPrice(List<Item> items) {
        int sum = 0;
        for (Item i: items) {
           sum += i.getPrice();
        }
        return sum;
    }

    public int getPrice() {
        return bestPrice;
    }

    public List<Item> getItems() {
        return bestItems;
    }
}
