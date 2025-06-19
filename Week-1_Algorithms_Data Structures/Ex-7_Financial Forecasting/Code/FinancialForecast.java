import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FinancialForecast {

    // Memoization map to store computed future values
    private static Map<Integer, Double> memo = new HashMap<>();

    // Recursive method with memoization
    public static double forecastValue(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }

        // If result is already computed, return it
        if (memo.containsKey(years)) {
            return memo.get(years);
        }

        // Recursive call to calculate future value
        double futureValue = forecastValue(initialValue, growthRate, years - 1) * (1 + growthRate);
        memo.put(years, futureValue);  // Store in memo
        return futureValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial value (e.g., 1000): ");
        double initialValue = sc.nextDouble();

        System.out.print("Enter annual growth rate (e.g., 0.05 for 5%): ");
        double growthRate = sc.nextDouble();

        System.out.print("Enter number of years to forecast: ");
        int years = sc.nextInt();

        double result = forecastValue(initialValue, growthRate, years);

        System.out.printf("Future value after %d years: %.2f\n", years, result);
        sc.close();
    }
}
