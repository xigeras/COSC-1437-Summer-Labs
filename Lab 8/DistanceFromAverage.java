import java.util.Scanner;

/*
 * Allow a user to enter any number of double values up to 15. 
 * The user should enter 99999 to quit entering numbers. 
 * Display an error message if the user quits without entering any numbers; 
 * otherwise, display a count of the numbers entered, the arithmetic average of the numbers, and each entered value and its distance from the average. 
 * Save the file as DistanceFromAverage.java.
 */

public class DistanceFromAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MAX_VALUES = 15;
        double[] values = new double[MAX_VALUES];
        int count = 0;
        int sum = 0;

        System.out.println("Enter any number of double values up to 15. Enter 99999 to quit entering numbers.");

        while (count < MAX_VALUES) {
            double input = scanner.nextDouble();
            if (input == 99999) {
                break;
            }
            values[count] = input;
            sum += input;
            count++;
        }

        if (count == 0) {
            System.out.println("No numbers were entered.");
        } else {
            double average = sum / count;
            System.out.println("\nNumber of values entered: " + count);
            System.out.printf("Average: %.2f\n", average);
            System.out.println("Values and their distance from the average:");

            for (int i = 0; i < count; i++) {
                double distance = Math.abs(values[i] - average);
                System.out.printf("Value: %.2f, Distance from average: %.2f\n", values[i], distance);
            }
        }
        scanner.close();
    }
}
