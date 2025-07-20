/*
 * Create an application named TestBloodData that declares two objects. 
 * Prompt the user for values for one, and use the default constructor values for the other. 
 * Display the details of both objects. 
 * Then change the values in the default object so it uses the user’s values, and 
 * display the details for the object again to confirm the changes are made correctly. 
 * Save the application as TestBloodData.java.
 */

import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create first BloodData object using default constructor
        BloodData defaultBloodData = new BloodData();
        System.out.println("Default Blood Data: " + defaultBloodData);

        // Prompt user for values for the second BloodData object
        System.out.print("Enter blood type (O, A, B, AB): ");
        String bloodType = scanner.nextLine().toUpperCase();
        System.out.print("Enter Rh factor (+ or -): ");
        String rhFactor = scanner.nextLine();

        // Create second BloodData object with user input
        BloodData userBloodData = new BloodData(bloodType, rhFactor);
        System.out.println("\nUser Blood Data: " + userBloodData);

        // Change the default object to use user's values
        defaultBloodData.setBloodType(bloodType);
        defaultBloodData.setRHFactor(rhFactor);
        
        // Display the updated default object
        System.out.println("Updated Default Blood Data: " + defaultBloodData);

        scanner.close();
    }
}