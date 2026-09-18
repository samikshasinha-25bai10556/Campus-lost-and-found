package lostandfound;

public class FoundItem extends Item {

    public FoundItem(int id, String name, String description,
                     String location, String date) {
        super(id, name, description, location, date);
    }

    @Override
    public void displayItem() {
        System.out.println("\n--- FOUND ITEM ---");
        super.displayItem();
    }
}
