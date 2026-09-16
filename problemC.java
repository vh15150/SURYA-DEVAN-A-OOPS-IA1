import java.util.Scanner;

class InvalidDataLimitException extends Exception {
    InvalidDataLimitException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter data limit: ");
        int limit = sc.nextInt();

        try {
            if (limit < 0) {
                throw new InvalidDataLimitException(
                    "Data limit cannot be negative"
                );
            }

            System.out.println("Valid data limit: " + limit);

        } catch (InvalidDataLimitException e) {
            System.out.println(e.getMessage());
        }
    }
}
