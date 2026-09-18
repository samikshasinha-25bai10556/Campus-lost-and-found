package lostandfound;

public class Item {
    protected int id;
    protected String name;
    protected String description;
    protected String location;
    protected String date;

    public Item(int id, String name, String description, String location, String date) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.location = location;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public void displayItem() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
    }
}
