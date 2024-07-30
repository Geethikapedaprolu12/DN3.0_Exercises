import java.util.Scanner;

public class FinancialForecasting {

    // Method to calculate future value using iteration
    public static double calculateFutureValue(double initialInvestment, double annualGrowth, int years) {
        double projectedValue = initialInvestment;
        for (int i = 0; i < years; i++) {
            projectedValue *= (1 + annualGrowth);
        }
        return projectedValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the initial investment: ");
        double initialInvestment = scanner.nextDouble();

        System.out.print("Enter the annual growth rate (as a decimal): ");
        double annualGrowth = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        // Calculate future value
        double projectedValue = calculateFutureValue(initialInvestment, annualGrowth, years);
        System.out.printf("Projected Value after %d years: %.2f\n", years, projectedValue);

    }
}