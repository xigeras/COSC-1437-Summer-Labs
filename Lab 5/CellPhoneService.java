import java.util.Scanner;

/*
 * Write a program for Horizon Phones, a provider of cellular phone service. 
 * Prompt a user for maximum monthly values for talk minutes needed, text messages needed, and 
 * gigabytes of data needed, and then display a recommendation for the best plan for the customer’s needs. 
 * A customer who needs fewer than 500 minutes of talk and no text or data should buy Plan A at $49 per month. 
 * A customer who needs fewer than 500 minutes of talk and any text messages should buy Plan B at $55 per month. 
 * A customer who needs 500 or more minutes of talk and no data should buy either Plan C for up to 100 text messages at $61 per month 
 * or Plan D for 100 text messages or more at $70 per month. 
 * A customer who needs any data should buy Plan E for up to 3 gigabytes at $79 per month or Plan F for 3 gigabytes or more at 
 * $87 per month. 
 * Save the file as CellPhoneService.java.
 */


public class CellPhoneService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Maximum monthly values for talk minutes needed?");
        int minutes = scanner.nextInt();

        System.out.println("Maximum monthly values for text messages needed?");
        int texts = scanner.nextInt();

        System.out.println("Maximum monthly values for gigabytes of data needed?");
        double data = scanner.nextDouble();


        if (data > 0) {
            if (data <= 3) {
                System.out.println("You should buy Plan E for up to 3 gigabytes at $79 per month!");
            } else {
                System.out.println("You should buy Plan F for 3 gigabytes or more at $87 per month!");
            }
        } else if (minutes < 500) {
            if (texts == 0) {
                System.out.println("You should buy Plan A at $49 per month!");
            } else {
                System.out.println("You should buy Plan B at $55 per month!");
            }
        } else {
            if (texts <= 100) {
                System.out.println("You should buy Plan C at $61 per month for up to 100 text messages!");
            } else {
                System.out.println("You should buy Plan D at $70 per month for 100 or more text messages!");
            }
        }
        scanner.close();
    }
}
