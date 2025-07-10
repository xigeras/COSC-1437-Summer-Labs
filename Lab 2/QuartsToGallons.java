public class QuartsToGallons {
    public static void main(String[] args) {
        int quartsNeeded = 18;
        int gallonsNeeded = quartsNeeded / 4;
        int quartsRemain = quartsNeeded % gallonsNeeded;

        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallonsNeeded + " gallons plus " + quartsRemain + " quarts.");
    }
}