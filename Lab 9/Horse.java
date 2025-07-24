/*
 * Create a class named Horse that contains data fields for the name, color, and birth year. 
 * Include get and set methods for these fields. 
 * Save the file as Horse.java.
 */

public class Horse {
    private String name;
    private String color;
    private int birthYear;

    //Getters
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getBirthYear() {
        return birthYear;
    }

    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nColor: " + color + "\nBirth Year: " + birthYear; 
    }
}