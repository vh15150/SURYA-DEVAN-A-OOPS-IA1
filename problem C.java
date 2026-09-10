class InvalidDataLimitException extends Exception {
    InvalidDataLimitException(String msg) {
        super(msg);
    }
}

public class DataLimitCheck {
    public static void main(String[] args) {
        double dataLimit = -5;

        try {
            if (dataLimit < 0)
                throw new InvalidDataLimitException("Data limit cannot be negative");

            System.out.println("Valid Data Limit: " + dataLimit + " GB");
        } catch (InvalidDataLimitException e) {
            System.out.println(e.getMessage());
        }
    }
}
