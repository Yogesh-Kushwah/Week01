import java.util.Scanner;

public class QutientRemainderFinder {

    // Method to find the remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor; // Calculate remainder
        int quotient = number / divisor; // Calculate quotient

        return new int[]{remainder, quotient}; // Return both values in an array
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // For user input

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        // Call the method and get the result
        int[] arr = findRemainderAndQuotient(number, divisor);

        // Display the remainder and quotient
        System.out.println("The remainder is: " + arr[0]);
        System.out.println("The quotient is: " + arr[1]);

        input.close(); // Close the scanner
    }
}
