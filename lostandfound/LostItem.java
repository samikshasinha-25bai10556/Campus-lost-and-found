package lostandfound;

public class LostItem extends Item {

    public LostItem(int id, String name, String description,
                    String location, String date) {
        super(id, name, description, location, date);
    }

    @Override
    public void displayItem() {
        System.out.println("\n--- LOST ITEM ---");
        super.displayItem();
    }
}
