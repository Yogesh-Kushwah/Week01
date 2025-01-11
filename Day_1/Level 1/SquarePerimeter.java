import java.util.Scanner;

public class SquarePerimeter {

    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the perimeter of the square
        System.out.print("Enter the Perimeter of the Square: ");

        // Read the perimeter value from the user input
        float perimeter = input.nextFloat(); 

        // Calculate the length of one side of the square
        float side = perimeter / 4; 

        // Display the result: the length of one side and the perimeter provided
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
