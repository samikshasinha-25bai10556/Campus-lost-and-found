package lostandfound;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ItemManager manager = new ItemManager();
        SearchService searchService = new SearchService();
        FileHandler fileHandler = new FileHandler();

        int nextId = 1;

        while (true) {

            System.out.println("\n==============================");
            System.out.println(" CAMPUS LOST & FOUND SYSTEM");
            System.out.println("==============================");
            System.out.println("1. Add Lost Item");
            System.out.println("2. Add Found Item");
            System.out.println("3. View All Items");
            System.out.println("4. Search Item by Name");
            System.out.println("5. Search Item by Location");
            System.out.println("6. Search Item by ID");
            System.out.println("7. Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");

            int choice;

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {

                case 1:

                    System.out.println("\n--- ADD LOST ITEM ---");

                    System.out.print("Enter item name: ");
                    String lostName = scanner.nextLine();

                    System.out.print("Enter description: ");
                    String lostDescription = scanner.nextLine();

                    System.out.print("Enter location where item was lost: ");
                    String lostLocation = scanner.nextLine();

                    System.out.print("Enter date: ");
                    String lostDate = scanner.nextLine();

                    if (!Validation.isValidText(lostName) ||
                        !Validation.isValidText(lostDescription) ||
                        !Validation.isValidText(lostLocation) ||
                        !Validation.isValidDate(lostDate)) {

                        System.out.println("Invalid details. Item was not added.");
                        break;
                    }

                    LostItem lostItem = new LostItem(
                            nextId,
                            lostName,
                            lostDescription,
                            lostLocation,
                            lostDate
                    );

                    manager.addItem(lostItem);
                    fileHandler.saveItem(lostItem);

                    nextId++;
                    break;

                case 2:

                    System.out.println("\n--- ADD FOUND ITEM ---");

                    System.out.print("Enter item name: ");
                    String foundName = scanner.nextLine();

                    System.out.print("Enter description: ");
                    String foundDescription = scanner.nextLine();

                    System.out.print("Enter location where item was found: ");
                    String foundLocation = scanner.nextLine();

                    System.out.print("Enter date: ");
                    String foundDate = scanner.nextLine();

                    if (!Validation.isValidText(foundName) ||
                        !Validation.isValidText(foundDescription) ||
                        !Validation.isValidText(foundLocation) ||
                        !Validation.isValidDate(foundDate)) {

                        System.out.println("Invalid details. Item was not added.");
                        break;
                    }

                    FoundItem foundItem = new FoundItem(
                            nextId,
                            foundName,
                            foundDescription,
                            foundLocation,
                            foundDate
                    );

                    manager.addItem(foundItem);
                    fileHandler.saveItem(foundItem);

                    nextId++;
                    break;

                case 3:

                    manager.displayAllItems();
                    break;

                case 4:

                    System.out.print("Enter item name to search: ");
                    String searchName = scanner.nextLine();

                    searchService.searchByName(manager, searchName);
                    break;

                case 5:

                    System.out.print("Enter location to search: ");
                    String searchLocation = scanner.nextLine();

                    searchService.searchByLocation(manager, searchLocation);
                    break;

                case 6:

                    System.out.print("Enter item ID: ");

                    try {

                        int id = Integer.parseInt(scanner.nextLine());

                        if (!Validation.isValidId(id)) {
                            System.out.println("Invalid ID.");
                            break;
                        }

                        Item item = manager.getItemById(id);

                        if (item != null) {
                            item.displayItem();
                        } else {
                            System.out.println("Item not found.");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID. Please enter a number.");
                    }

                    break;

                case 7:

                    System.out.println("Thank you for using Campus Lost & Found System.");
                    scanner.close();
                    return;

                default:

                    System.out.println("Invalid choice. Please select 1-7.");
            }
        }
    }
}
