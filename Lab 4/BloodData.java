/*
 * Create a class named BloodData that includes String fields that hold a blood type 
 * (the four blood types are O, A, B, and AB) and an Rh factor (the factors are + and –). 
 * Create a default constructor that sets the fields to O and + and an overloaded constructor that requires values for both fields. 
 * Include get and set methods for each field. Save this file as BloodData.java.
 */

 public class BloodData {
    private String bloodType;
    private String rhFactor;

   public BloodData() {
      this.bloodType = "O";
      this.rhFactor = "+";
   }
   
   //overloaded constructor
   public BloodData(String bloodType, String rhFactor) {
      this.bloodType = bloodType;
      this.rhFactor = rhFactor;
   }

   //getters
   public String getType() {
      return bloodType;
   }

   public String getFactor() {
      return rhFactor;
   }

   //setters
   public void setBloodType(String bloodType) {
      this.bloodType = bloodType;
   }

   public void setRHFactor(String rhFactor) {
      this.rhFactor = rhFactor;
   }
   @Override
   public String toString() {
      return "\nBlood Type: " + bloodType + ", rH Factor: " + rhFactor;
   }
 }

