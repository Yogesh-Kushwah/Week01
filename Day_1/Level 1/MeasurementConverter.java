import java.util.Scanner;

public class MeasurementConverter {

    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their height in centimeters
        System.out.println("Enter the Height in Cm");
        double height = input.nextInt(); // Read the input as a double value

        // Convert height from centimeters to inches
        double inch = height / 2.54;

        // Convert height from inches to feet
        double feet = inch / 12;

        // Display the height in all units: cm, feet, and inches
        System.out.println("Your Height in cm is " + height + ", in feet is " + feet + ", and in inches is " + inch);
    }
}
