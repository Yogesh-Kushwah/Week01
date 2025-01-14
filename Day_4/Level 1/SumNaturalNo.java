import java.util.Scanner; // Importing Scanner class to take user input

public class SumNaturalNo {

    // Method to calculate the sum of natural numbers up to a given number
    public static int NaturalNo(int number) {
        int sum = 0; // Initialize sum to 0

        // Loop through numbers from 1 to the given number
        for (int i = 1; i <= number; i++) {
            sum += i; // Add the current number to the sum
        }

        return sum; // Return the final sum
    }

    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: "); // Prompt the user to enter a number
        int number = input.nextInt(); // Read the input as an integer
		
        // Call the method to calculate the sum of natural numbers and store the result
        int sumNaturalNo = NaturalNo(number);

        // Display the result to the user
        System.out.print("The sum of the natural numbers is: " + sumNaturalNo);

        // Close the Scanner object to free resources
        input.close();
    }
}
