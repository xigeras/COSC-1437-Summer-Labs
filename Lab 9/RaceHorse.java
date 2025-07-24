/*
 * Create a subclass of Horse named RaceHorse, 
 * which contains an additional field that holds the number of races in which the 
 * Horse has competed and additional methods to get and set the new field. 
 * Save the file as RaceHorse.java.
 */

public class RaceHorse extends Horse {
    private int numberOfRaces;

    //Getter

    public int getNumberOfRaces() {
        return numberOfRaces;
    }

    public void setNumberOfRaces(int numberOfRaces) {
        this.numberOfRaces = numberOfRaces;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumber of Races: " + numberOfRaces;
    }
}