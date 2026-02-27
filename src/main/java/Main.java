import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean exit = false;

        System.out.println("Welcome to the Scientific Calculator!");

        while (!exit) {
            System.out.println("\n--- Select an Operation ---");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                continue;
            }

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter the number (x): ");
                        double sqrtInput = Double.parseDouble(scanner.nextLine());
                        System.out.println("Result: √" + sqrtInput + " = " + calculator.squareRoot(sqrtInput));
                        break;
                    case 2:
                        System.out.print("Enter an integer (x): ");
                        int factInput = Integer.parseInt(scanner.nextLine());
                        System.out.println("Result: " + factInput + "! = " + calculator.factorial(factInput));
                        break;
                    case 3:
                        System.out.print("Enter the number (x): ");
                        double logInput = Double.parseDouble(scanner.nextLine());
                        System.out.println("Result: ln(" + logInput + ") = " + calculator.naturalLog(logInput));
                        break;
                    case 4:
                        System.out.println("Exiting the calculator. Goodbye!");
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice! Please select an option from 1 to 4.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Mathematical Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Input Error: Please enter valid numbers.");
            }
        }
        scanner.close();
    }
}