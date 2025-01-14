import java.util.Scanner;

public class StudentAges {

    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Declare an array to store the ages of 5 students
        int[] arr = new int[5];

        // Loop to take input for student ages
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the age of the Student: ");
            arr[i] = input.nextInt(); // Take student input
        }

        // Loop to check if the age is negative, even, odd, or zero
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println("The number is negative");
            } else if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    System.out.println("The number is even");
                } else {
                    System.out.println("The number is odd");
                }
            } else {
                System.out.println("The number is zero");
            }
        }

        // Compare the first and last elements of the array
        if (arr[0] == arr[arr.length - 1]) {
            System.out.println("The first and last elements are equal");
        } else if (arr[0] < arr[arr.length - 1]) {
            System.out.println("The number 1 (" + arr[0] + ") is less than " + arr[arr.length - 1]);
        } else {
            System.out.println("The number 1 (" + arr[0] + ") is greater than " + arr[arr.length - 1]);
        }

        // Close the Scanner
        input.close();
    }
}
