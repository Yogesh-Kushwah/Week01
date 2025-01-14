import java.util.Scanner;

public class StoringMultipleValueTillZero {

    public static void main(String[] args) {

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // Array to store numbers
        double[] array = new double[10];

        double totalValue = 0.0; // To store the sum of numbers
        int index = 0; // To track array position

        // Loop to take inputs
        while (true) {
            System.out.println("Enter a the number :");
            double num = input.nextDouble();

            // Stop if input is 0 or negative
            if (num <= 0) {
                break;
            }

            // Add to array if there's space
            if (index < 10) {
                array[index] = num;
                index++;
            } else {
                System.out.println("Array is full. Stopping input.");
                break;
            }
        }

        // Calculate the sum
        for (int i = 0; i < index; i++) {
            totalValue += array[i];
        }

        // Print the total
        System.out.println("The total value of the array is: " + totalValue);

        input.close();
    }
}
