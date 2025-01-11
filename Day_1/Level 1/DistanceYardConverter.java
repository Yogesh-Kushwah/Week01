import java.util.Scanner;

public class DistanceYardConverter {

    public static void main(String[] args) {

        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a distance in feet
        System.out.print("Enter the Distance in Feet: ");
        double feet = input.nextDouble(); // Read the input as a double value

        // Convert feet to yards (1 yard = 3 feet)
        double yards = feet / 3;

        // Convert yards to miles (1 mile = 1760 yards)
        double mile = yards / 1760;

        // Display the results in yards, feet, and miles
        System.out.println("Your distance in Yards is " + yards 
                + ", in Feet is " + feet 
                + ", and in Miles is " + mile);
    }
}
