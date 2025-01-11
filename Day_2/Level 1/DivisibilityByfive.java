import java.util.Scanner;

public class DivisibilityByfive {

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the number
        System.out.print("Enter the number : ");
        int num = input.nextInt(); // Read the input as an integer
		
		boolean divisibility = (num%5==0);
			
        // Display the result
        System.out.println( "Is the number "+ num +" divisible by 5? "+  divisibility
);
    }
}
