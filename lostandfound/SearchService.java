package lostandfound;

public class SearchService {

    public void searchByName(ItemManager manager, String name) {

        boolean found = false;

        for (Item item : manager.getItems()) {

            if (item.getName().equalsIgnoreCase(name)) {
                item.displayItem();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No item found with name: " + name);
        }
    }

    public void searchByLocation(ItemManager manager, String location) {

        boolean found = false;

        for (Item item : manager.getItems()) {

            if (item.getLocation().equalsIgnoreCase(location)) {
                item.displayItem();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No item found at location: " + location);
        }
    }
}
