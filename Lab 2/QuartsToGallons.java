/*
 * Write a program that declares a named constant to hold the number of quarts in a gallon (4). 
 * Also declare a variable to represent the number of quarts needed for a painting job. 
 * Name the variable quartsNeeded, and assign 18 to it. 
 * Compute and display the number of gallons and quarts needed for the job. 
 * Display explanatory text in the format A job that needs 18 quarts requires 4 gallons plus 2 quarts. 
 * Save the program as QuartsToGallons.java.
 */

public class QuartsToGallons {
    public static void main(String[] args) {
        int quartsNeeded = 18;
        int gallonsNeeded = quartsNeeded / 4;
        int quartsRemain = quartsNeeded % gallonsNeeded;

        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallonsNeeded + " gallons plus " + quartsRemain + " quarts.");
    }
}