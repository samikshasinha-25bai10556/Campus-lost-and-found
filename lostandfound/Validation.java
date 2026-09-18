package lostandfound;

public class Validation {

    public static boolean isValidText(String value) {

        return value != null && !value.trim().isEmpty();
    }

    public static boolean isValidId(int id) {

        return id > 0;
    }

    public static boolean isValidDate(String date) {

        return date != null && !date.trim().isEmpty();
    }
}
