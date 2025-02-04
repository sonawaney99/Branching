import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Adding the numbers
        double sum = num1 + num2;

        // Displaying the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        // Closing the scanner
        scanner.close();
    }
}	 
