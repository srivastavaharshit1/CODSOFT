import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example static rates (1 INR to others)
        double usdRate = 0.012;
        double eurRate = 0.011;
        double gbpRate = 0.0094;

        System.out.println("Welcome to Currency Converter");
        System.out.println("Supported conversions: INR to USD, EUR, GBP");

        System.out.print("Enter amount in INR: ");
        double inr = scanner.nextDouble();

        System.out.println("Choose currency to convert to:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. GBP");

        int choice = scanner.nextInt();
        double result = 0;
        String currency = "";

        switch (choice) {
            case 1:
                result = inr * usdRate;
                currency = "USD";
                break;
            case 2:
                result = inr * eurRate;
                currency = "EUR";
                break;
            case 3:
                result = inr * gbpRate;
                currency = "GBP";
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        System.out.printf("₹%.2f = %.2f %s%n", inr, result, currency);
        scanner.close();
    }
}

