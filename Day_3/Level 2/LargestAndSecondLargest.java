import java.util.Scanner;

public class LargestAndSecondLargest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter a number ");
        int number = input.nextInt(); //taking number as input

        final int maxDigit = 10;

        // Array to store the digits of the number
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits of the number and store them in the array
        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit
            index++;
        }

        int largest = -1;
        int secondLargest = -1;

        // Loop through the array to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

       
        if (largest != -1 && secondLargest != -1) {
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Unable to find the largest and second largest digits.");
        }
    }
}
