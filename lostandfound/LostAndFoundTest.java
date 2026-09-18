package lostandfound;

public class LostAndFoundTest {

    public static void main(String[] args) {

        System.out.println("===== TESTING CAMPUS LOST & FOUND SYSTEM =====");

        // Test 1: Valid item
        boolean result1 = Validation.isValidText("Laptop");
        System.out.println("Test 1 - Valid item name: "
                + (result1 ? "PASSED" : "FAILED"));

        // Test 2: Empty item
        boolean result2 = Validation.isValidText("");
        System.out.println("Test 2 - Empty item name: "
                + (!result2 ? "PASSED" : "FAILED"));

        // Test 3: Valid ID
        boolean result3 = Validation.isValidId(10);
        System.out.println("Test 3 - Valid ID: "
                + (result3 ? "PASSED" : "FAILED"));

        // Test 4: Invalid ID
        boolean result4 = Validation.isValidId(-1);
        System.out.println("Test 4 - Invalid ID: "
                + (!result4 ? "PASSED" : "FAILED"));

        // Test 5: Add item
        ItemManager manager = new ItemManager();

        LostItem item = new LostItem(
                1,
                "Mobile Phone",
                "Black Samsung phone",
                "Library",
                "18-09-2026"
        );

        manager.addItem(item);

        Item found = manager.getItemById(1);

        System.out.println("Test 5 - Add and find item: "
                + (found != null ? "PASSED" : "FAILED"));

        System.out.println("\n===== TESTING COMPLETED =====");
    }
}
