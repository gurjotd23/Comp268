package src.com.AliceInWonderland;

import java.util.ArrayList;

public class Inventory {
    private static ArrayList<Item> CollectedItems = new ArrayList<Item>();

    public static int Count() {
        return CollectedItems.size();
    }

    public static boolean AddItem(Item item) {
        if (Inventory.Count() < 3) {
            Inventory.CollectedItems.add(item);
            return true;
        }
        return false;
    }

    public static void DropItem(int index) {
        if (Inventory.Count() >= index) CollectedItems.remove(index);
    }

    public static ArrayList<Item> MyInventory() {
        return CollectedItems;
    }

    public static boolean HasItem(Item item) {

        for (Item i : Inventory.MyInventory()) {
            if (i.Name.compareToIgnoreCase(item.Name) == 0) {
                return true;
            }
        }

        return false;
    }
}
