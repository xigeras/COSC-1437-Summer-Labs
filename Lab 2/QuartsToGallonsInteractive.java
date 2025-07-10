/*
 * Convert the QuartsToGallons program to an interactive application.
 * Instead of assigning a value to the number of quarts, accept the value from the user as input. 
 * Save the revised program as QuartsToGallonsInteractive.java.
 */

import java.util.Scanner;

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many quarts are needed: ");
        int quartsNeeded = scanner.nextInt();
        int gallonsNeeded = quartsNeeded / 4;
        int quartsRemain = quartsNeeded % gallonsNeeded;

        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallonsNeeded + " gallons plus " + quartsRemain + " quarts.");
        scanner.close();
    }
}