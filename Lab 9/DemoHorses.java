import java.util.Scanner;

/*
 * Write an application that prompts the user for appropriate field values and demonstrates using objects of each class, Horse and RaceHorse. 
 * Save the file as DemoHorses.java.
 */

public class DemoHorses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Horse horse = new Horse();
        System.out.println("Enter details for a Horse:");
        System.out.print("Name: ");
        horse.setName(scanner.nextLine());
        System.out.print("Color: ");
        horse.setColor(scanner.nextLine());
        System.out.print("Birth Year: ");
        horse.setBirthYear(scanner.nextInt());
        scanner.nextLine();

        RaceHorse raceHorse = new RaceHorse();
        System.out.println("\nEnter details for a RaceHorse:");
        System.out.print("Name: ");
        raceHorse.setName(scanner.nextLine());
        System.out.print("Color: ");
        raceHorse.setColor(scanner.nextLine());
        System.out.print("Birth Year: ");
        raceHorse.setBirthYear(scanner.nextInt());
        System.out.print("Number of Races: ");
        raceHorse.setNumberOfRaces(scanner.nextInt());

        //display results
        System.out.println("\n=== Horse Details ===");
        System.out.println(horse);

        System.out.println("\n=== RaceHorse Details ===");
        System.out.println(raceHorse);

        scanner.close();
    }
}
