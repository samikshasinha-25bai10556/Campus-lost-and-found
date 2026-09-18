package lostandfound;

import java.util.ArrayList;

public class ItemManager {

    private ArrayList<Item> items;

    public ItemManager() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Item added successfully!");
    }

    public void displayAllItems() {

        if (items.isEmpty()) {
            System.out.println("No items available.");
            return;
        }

        System.out.println("\n===== ALL ITEMS =====");

        for (Item item : items) {
            item.displayItem();
        }
    }

    public Item getItemById(int id) {

        for (Item item : items) {
            if (item.getId() == id) {
                return item;
            }
        }

        return null;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
