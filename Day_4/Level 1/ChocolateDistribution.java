import java.util.Scanner;

public class ChocolateDistribution {

    // Method to calculate the quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor; // Remaining chocolates
        int quotient = number / divisor; // Chocolates each child gets

        return new int[]{quotient, remainder}; // Return quotient and remainder
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner for user input

        // Input the total number of chocolates
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        // Input the total number of children
        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Calculate the distribution and get results
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Display the results
        System.out.println("Each child gets " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);

        input.close(); // Close the scanner
    }
}
