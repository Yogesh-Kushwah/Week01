import java.util.Scanner;

public class PositiveNegativeOddEvenCalci {

    // Method to check if a number is positive
    public static boolean isPositive(int number) {
        if (number <= 0) {
            return false;
        }
        return true;
    }

    // Method to check if a number is even or odd
    public static void isEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

    // Method to compare two numbers and return:
    // 1 if the first number is greater,
    // -1 if the second number is greater,
    // 0 if they are equal
    public static int compare2No(int first, int last) {
        if (first > last) {
            return 1;
        } else if (last > first) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner input = new Scanner(System.in);

        // Array to store ages of 5 numbers
        int[] positiveNoArray = new int[5];

        // Loop to take input for 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the Number " + (i + 1) + ": ");
            positiveNoArray[i] = input.nextInt();
        }

        // Loop to process each number in the array
        for (int i = 0; i < positiveNoArray.length; i++) {
            if (isPositive(positiveNoArray[i])) {
                isEvenOdd(positiveNoArray[i]);
            } else {
                System.out.println("The number is negative");
            }
        }

        // Compare the first and last number in the array
        int compare = compare2No(positiveNoArray[0], positiveNoArray[positiveNoArray.length - 1]);

        if (compare == 1) {
            System.out.println(positiveNoArray[0] + " is greater than " + positiveNoArray[positiveNoArray.length - 1]);
        } else if (compare == -1) {
            System.out.println(positiveNoArray[0] + " is less than " + positiveNoArray[positiveNoArray.length - 1]);
        } else {
            System.out.println(positiveNoArray[0] + " both are equal " + positiveNoArray[positiveNoArray.length - 1]);
        }

        // Close the scanner
        input.close();
    }
}
