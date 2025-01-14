import java.util.Scanner;

public class UnitConvertor2 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meter) {
        double meters2inches = 39.3701;
        return meter * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the yards to Convert: ");
        double yards = input.nextDouble(); // Read yards

        System.out.print("Enter the feet to Convert: ");
        double feet = input.nextDouble(); // Read feet

        System.out.print("Enter the meters to Convert: ");
        double meter = input.nextDouble(); // Read meters

        System.out.print("Enter the inches to Convert: ");
        double inches = input.nextDouble(); // Read inches

        // Accepting the return method
        double feets = convertYardsToFeet(yards);
        System.out.println(yards + " yards is equal to " + feets + " feet.");

        double inch = convertMetersToInches(meter);
        System.out.println(meter + " meter is equal to " + inch + " inches.");

        double meters = convertInchesToMeters(inches);
        System.out.println(inches + " inches is equal to " + meters + " meters.");

        double centimeters = convertInchesToCentimeters(inches);
        System.out.println(inches + " inches is equal to " + centimeters + " centimeters.");

        input.close();
    }
}
