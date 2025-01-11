import java.util.Scanner;

public class TriangularParkRun {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read the lengths of the sides of the triangular park
        System.out.print("Enter the first side of the park (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter the second side of the park (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter the third side of the park (in meters): ");
        double side3 = input.nextDouble();

        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3;

        // Calculate how many rounds the athlete needs to complete 5 km
        double distanceToRun = 5000; // in meters
        double rounds = distanceToRun / perimeter;

        // Display the result
        System.out.println("The total number of rounds the athlete will run is " + (rounds) + " to complete 5 km.");
    }
}
