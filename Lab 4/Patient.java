/*
 * Create a class named Patient that includes an ID number, age, and BloodData. 
 * Provide a default constructor that sets the ID number to 0, the age to 0, and the BloodData values to the default BloodData values (O and +). 
 * Create an overloaded constructor that provides values for each field. 
 * Also provide get methods for each field. Save the file as Patient.java.
 */

public class Patient {
    private int idNumber;
    private int age;
    private BloodData bloodData;

    public Patient() {
        this.idNumber = 0;
        this.age = 0;
        this.bloodData = new BloodData(); // Default BloodData values (O and +)
    }

    public Patient(int idNumber, int age, BloodData bloodData) {
        this.idNumber = idNumber;
        this.age = age;
        this.bloodData = bloodData;
    }

    public getIdNumber() {
        return idNumber;
    }

    public getAge() {
        return age;
    }

    public BloodData getBloodData() {
        return bloodData;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBloodData(BloodData bloodData) {
        this.bloodData = bloodData;
    }

    @Override
    public String toString() {
        return "Patient ID: " + idNumber +
                ", Age: " + age +
                ", Blood Data: " + bloodData;    
}