import java.util.Scanner;

public class OddEvenArray {

    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a positive number
        System.out.println("Enter a positive number:");
        int number = input.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.err.println("Error");
            return; // Exit the program
        }

        // Arrays to store even and odd numbers
        int[] even = new int[number / 2 + 1]; 
        int[] odd = new int[number / 2 + 1];  

        // Index taking for both arrays
        int indexEven = 0;
        int indexOdd = 0;

        // Loop to separate even and odd numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[indexEven] = i; 
                indexEven++;
            } else {
                odd[indexOdd] = i; 
                indexOdd++;
            }
        }

        // Print the even numbers
        System.out.print("The even numbers are: ");
        for (int i = 0; i < indexEven; i++) { 
            System.out.print(even[i] + " ");
        }
        System.out.println(); 

        // Print the odd numbers
        System.out.print("The odd numbers are: ");
        for (int i = 0; i < indexOdd; i++) { 
            System.out.print(odd[i] + " ");
        }

        // Close the scanner
        input.close();
    }
}
