/*
 * The Renew Your Home Company estimates each job cost as the cost of materials plus $35 per hour while on the job, 
 * plus $12 per hour for travel time to the job site. 
 * Create a class that contains a main() method that prompts the user for the name of a job 
 * (for example, Patel bathroom remodel), the cost of materials, the number of hours of work required, and the number of hours of travel time. 
 * Pass the numeric data to a method that computes an estimate for the job and returns the 
 * computed value to the main() method, where the job name and estimated price are displayed. 
 * Save the program as JobPricing.java.
*/
import java.util.Scanner;

public class JobPricing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is the name of the job?");
        String jobName = scanner.nextLine();
        System.out.println("What is the cost of materials?");
        int costOfMaterials = scanner.nextInt();
        System.out.println("Number of hours of work required?");
        int hoursWorkRequired = scanner.nextInt();
        System.out.println("Number of hours of travel time?");
        int hoursTravelTime = scanner.nextInt();

        int estimate = estimatedCost(costOfMaterials, hoursWorkRequired, hoursTravelTime);

        System.out.println("Job Name: " + jobName + "\nEstimated Cost: $" + estimate);
        scanner.close();
    }

    public static int estimatedCost(int costOfMaterials, int hoursWorkRequired, int hoursTravelTime) 
    {
        int estimatedEverything = (costOfMaterials + (35 * hoursWorkRequired) + (12 * hoursTravelTime));
        return estimatedEverything;
    }
}