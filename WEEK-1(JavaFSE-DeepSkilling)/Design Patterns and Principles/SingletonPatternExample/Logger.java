public class Logger {
    // Private static instance
    private static Logger instance;

    // Private constructor
    private Logger() {
        System.out.println("Logger initialized.");
    }

    // Public method to return the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Logging method
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}