import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("=== Calculator ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square Root");
            System.out.println("8. Exit");
            System.out.print("Choose an operation: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1, 2, 3, 4, 5 -> {
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    double result = switch (choice) {
                        case 1 -> num1 + num2;
                        case 2 -> num1 - num2;
                        case 3 -> num1 * num2;
                        case 4 -> (num2 != 0) ? num1 / num2 : Double.NaN;
                        case 5 -> num1 % num2;
                        default -> 0;
                    };
                    if (choice == 4 && num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.println("Result: " + result);
                    }
                }
                case 6 -> {
                    System.out.print("Enter base number: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Result: " + Math.pow(base, exponent));
                }
                case 7 -> {
                    System.out.print("Enter number: ");
                    double number = scanner.nextDouble();
                    if (number >= 0) {
                        System.out.println("Result: " + Math.sqrt(number));
                    } else {
                        System.out.println("Error: Square root of a negative number is not allowed.");
                    }
                }
                case 8 -> {
                    exit = true;
                    System.out.println("Exiting the calculator. Goodbye!");
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
        scanner.close();
    }
}