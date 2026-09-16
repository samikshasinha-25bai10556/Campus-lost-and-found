
import java.util.ArrayList;
import java.util.Scanner;

class Item {
    int id;
    String name;
    String type;
    String location;

    Item(int id, String name, String type, String location) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.location = location;
    }

    void display() {
        System.out.println("----------------------------");
        System.out.println("ID       : " + id);
        System.out.println("Item     : " + name);
        System.out.println("Type     : " + type);
        System.out.println("Location : " + location);
    }
}

public class LostAndFound {

    static ArrayList<Item> items = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int nextId = 1;

    // Report a lost or found item
    static void reportItem(String type) {

        System.out.print("Enter item name: ");
        String name = sc.nextLine();

        System.out.print("Enter location: ");
        String location = sc.nextLine();

        Item item = new Item(nextId++, name, type, location);
        items.add(item);

        System.out.println("\n" + type + " item reported successfully!");
        System.out.println("Item ID: " + item.id);
    }

    // Display all items
    static void viewItems() {

        if (items.isEmpty()) {
            System.out.println("\nNo items reported yet.");
            return;
        }

        System.out.println("\n========== ALL ITEMS ==========");

        for (Item item : items) {
            item.display();
        }
    }

    // Search item by name
    static void searchItem() {

        System.out.print("Enter item name to search: ");
        String search = sc.nextLine().toLowerCase();

        boolean found = false;

        for (Item item : items) {

            if (item.name.toLowerCase().contains(search)) {
                item.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching item found.");
        }
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n================================");
            System.out.println("       CAMPUS LOST & FOUND");
            System.out.println("================================");
            System.out.println("1. Report Lost Item");
            System.out.println("2. Report Found Item");
            System.out.println("3. View All Items");
            System.out.println("4. Search Item");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");

            try {

                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    case 1:
                        reportItem("LOST");
                        break;

                    case 2:
                        reportItem("FOUND");
                        break;

                    case 3:
                        viewItems();
                        break;

                    case 4:
                        searchItem();
                        break;

                    case 5:
                        System.out.println("Thank you for using Campus Lost & Found!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Please enter 1-5.");
                }

            } catch (NumberFormatException e) {

                System.out.println("Please enter a valid number.");
            }
        }
    }
}
