package lostandfound;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    private static final String FILE_NAME = "items.txt";

    public void saveItem(Item item) {

        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {

            writer.write(
                "ID: " + item.getId() +
                ", Name: " + item.getName() +
                ", Description: " + item.getDescription() +
                ", Location: " + item.getLocation() +
                ", Date: " + item.getDate() +
                "\n"
            );

        } catch (IOException e) {
            System.out.println("Error while saving item: " + e.getMessage());
        }
    }
}
