import java.util.Scanner;

public class DistanceMilesConverter {

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a distance in kilometers
        System.out.println("Enter the distance in KM");
        double km = input.nextInt(); // Read the distance as input

        // Convert the distance from kilometers to miles
        double mile = km * 0.621371;

        // Print the converted distance in miles
        System.out.println("The total miles is " + mile + " mile for the given " + km + " km");
    }
}
