import java.util.Scanner;

/*
 * Write an application that displays the factorial for every integer value from 1 to a user-entered limit. 
 * A factorial of a number is the product of that number multiplied by each positive integer lower than it. 
 * For example, 4 factorial is 4 * 3 * 2 * 1, or 24. 
 * (You can use the int data type for the factorial, but if you enter a number greater than 16, 
 * the results will be unexpected because the factorial value exceeds the largest value that can be stored in an int.) 
 * Save the file as Factorials.java.
 */

 public class Factorials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer limit (1 to 16 recommended): ");
        int limit = scanner.nextInt();

        if (limit < 1) {
            System.out.println("Please enter a number greater than 0.");
        } else {
            System.out.println("Factorials from 1 to " + limit + ":");
            for (int i = 1; i <= limit; i++) {
                int factorial = 1;
                for (int j = 1; j <= i; j++) {
                    factorial *= j;
                }
                System.out.println(i + "! = " + factorial);
            }

            if (limit > 16) {
                System.out.println("Note that Factorials above 16 may be incorrect due to integer overflow.");
            }
        }
        scanner.close();
    }
 }