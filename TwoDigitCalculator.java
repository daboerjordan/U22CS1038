import java.util.Scanner;

public class TwoDigitCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first 2-digit number
        System.out.print("Enter the first 2-digit number: ");
        int num1 = getTwoDigitNumber(scanner);

        // Input second 2-digit number
        System.out.print("Enter the second 2-digit number: ");
        int num2 = getTwoDigitNumber(scanner);

        // Perform calculations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = (double) num1 / num2; // Handle division with decimal result

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        scanner.close();
    }

    // Function to get a valid 2-digit number from user input
    private static int getTwoDigitNumber(Scanner scanner) {
        int number;
        do {
            System.out.print("Enter a 2-digit number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid 2-digit number.");
                scanner.next(); // Consume invalid input
            }
            number = scanner.nextInt();
        } while (number < 10 || number > 99); // Check if the number is 2-digit

        return number;
    }
}