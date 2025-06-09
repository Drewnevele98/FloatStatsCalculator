package FloatStats;


import java.util.Scanner;

public class FloatStats {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Variables to store the sum, max, and min of the inputs
        float total = 0;
        float max = Float.MIN_VALUE; // Initialize max to the lowest possible float value
        float min = Float.MAX_VALUE; // Initialize min to the highest possible float value
        int count = 0; // Counter to track how many values have been entered

        System.out.println("Enter 5 floating-point numbers:");

        // While loop to collect exactly 5 valid float values from the user
        while (count < 5) {
            System.out.print("Enter value #" + (count + 1) + ": ");
            
            // Check if the input is a valid float
            if (scanner.hasNextFloat()) {
                float value = scanner.nextFloat(); // Read the input

                total += value; // Add the value to the running total

                // Update max if the current value is greater
                if (value > max) {
                    max = value;
                }

                // Update min if the current value is smaller
                if (value < min) {
                    min = value;
                }

                count++; // Increment counter for valid input
            } else {
                // If input is not a float, prompt again and discard invalid input
                System.out.println("Invalid input. Please enter a valid float number.");
                scanner.next(); // Consume the invalid token to prevent infinite loop
            }
        }

        // Calculate average and interest
        float average = total / 5;
        float interest = total * 0.20f;

        // Print results with formatting
        System.out.println("\nResults:");
        System.out.printf("Total: %.2f%n", total);
        System.out.printf("Average: %.2f%n", average);
        System.out.printf("Maximum: %.2f%n", max);
        System.out.printf("Minimum: %.2f%n", min);
        System.out.printf("Interest on Total at 20%%: %.2f%n", interest);

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}
