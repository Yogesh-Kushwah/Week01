import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter a number ");
        int number = input.nextInt(); //taking number as input
        
        
        int count = 0;
        int temp = number;
        
        // Calculate the number of digits
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        
        // Create an array to store the digits of the number
        int[] digits = new int[count];
        
        // Store the digits in the array
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10; // Get the last digit
            temp /= 10; // Remove the last digit
        }
        
        // Display the digits in reverse order
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
		input.close();
    }
}
