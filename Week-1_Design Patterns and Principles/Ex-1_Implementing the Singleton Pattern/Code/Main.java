import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get Singleton Logger instance
        Logger logger = Logger.getInstance();

        System.out.print("Enter how many messages you want to log: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter message " + i + ": ");
            String message = scanner.nextLine();
            logger.log(message);
        }

        // Confirm that Logger is a singleton
        Logger anotherLogger = Logger.getInstance();
        if (logger == anotherLogger) {
            System.out.println("Confirmed: Only one Logger instance is used.");
        } else {
            System.out.println("Different Logger instances found.");
        }

        scanner.close();
    }
}

