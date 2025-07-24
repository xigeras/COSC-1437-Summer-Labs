import java.util.Scanner;

/*
 * Write an application that prompts the user for three first names and concatenates them in every 
 * possible two-name combination so that new parents can easily compare them to find the most pleasing baby name. 
 * Save the file as BabyNameComparison.java.
 */

public class BabyNameComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        String name1 = scanner.nextLine(); 

        System.out.println("Enter the second name: ");
        String name2 = scanner.nextLine();

        System.out.println("Enter the third name: ");
        String name3 = scanner.nextLine();

        System.out.println("\nHere are all of the possible two-name combinations:");

        System.out.println(name1 + " " + name2);
        System.out.println(name2 + " " + name1);

        System.out.println(name1 + " " + name3);
        System.out.println(name3 + " " + name1);

        System.out.println(name2 + " " + name3);
        System.out.println(name3 + " " + name2);

        scanner.close();
    }
}

