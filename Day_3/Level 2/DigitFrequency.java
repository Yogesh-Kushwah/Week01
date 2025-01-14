import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take input for the number
        System.out.println("Enter a number ");
        int number = input.nextInt();
        
        // Create a frequency array of size 10 to store the frequency of each digit (0-9)
        int[] frequency = new int[10];
        
        // Process the digits of the number
        int temp = number;
        
        // Loop through the digits of the number
        while (temp != 0) {
            int digit = temp % 10;  // Get the last digit
            frequency[digit]++;  // Increment the frequency for that digit
            temp /= 10;  // Remove the last digit
        }
        
        // Display the frequency of each digit
        System.out.println("Digit frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) { 
                System.out.println(i + " appears " + frequency[i] + " time(s)");
            }
        }
		input.close();
    }
}
