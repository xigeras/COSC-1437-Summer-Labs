/*
 * Create an application that declares three Patient objects. 
 * Use all default values for one Patient object, prompt the user for values for the second Patient object, 
 * and for the third object, prompt the user for Patient data but use default values for that Patient’s BloodData. 
 * Save the file as TestPatient.java.
 */

import java.util.Scanner;

public class TestPatient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Patient 1: Default values
        Patient defaultPatient = new Patient();
        System.out.println("Default Patient: " + defaultPatient);

        // Patient 2: User input for all fields
        System.out.print("Enter Patient ID: ");
        int idNumber = scanner.nextInt();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Blood Type (O, A, B, AB): ");
        String bloodType = scanner.nextLine().toUpperCase();
        System.out.print("Enter Rh Factor (+ or -): ");
        String rhFactor = scanner.nextLine();

        BloodData userBloodData = new BloodData(bloodType, rhFactor);
        Patient userPatient = new Patient(idNumber, age, userBloodData);
        System.out.println("User Patient: " + userPatient);

        // Patient 3: User input for ID and Age, but default BloodData
        System.out.print("Enter Patient ID for third patient: ");
        int idNumber3 = scanner.nextInt();
        System.out.print("Enter Age for third patient: ");
        int age3 = scanner.nextInt();

        Patient defaultBloodDataPatient = new Patient(idNumber3, age3, new BloodData());
        System.out.println("Default Blood Data Patient: " + defaultBloodDataPatient);

        scanner.close();
    }
}