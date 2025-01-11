import java.util.Scanner;

public class TraingleAreaCalculator {

    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Read the base of the triangle in centimeters
        System.out.print("Enter the base of triangle in CM: ");
        double base = input.nextDouble();

        // Read the height of the triangle in centimeters
        System.out.print("Enter the Height of triangle in Cm: ");
        double height = input.nextDouble();

        // Calculate the area of the triangle in square centimeters
        double areaInCm = (1.0 / 2.0) * base * height;

        // Convert area from square centimeters to square inches
        double areaInInch = areaInCm / 2.54;

        // Convert area from square inches to square feet
        double areaInFeet = areaInInch / 12;

        // Display the result: area in cm, feet, and inches
        System.out.println("Your Height in cm is " + height +  ", in feet is " + areaInFeet + ", and in inches is " + areaInInch);
    }
}
