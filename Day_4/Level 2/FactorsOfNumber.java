import java.util.Scanner;

public class FactorsOfNumber {

    // Method to find all factors of a number
    public static int[] factor(int number) {
        int count = 0; // Count the number of factors

        // Loop to count total factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Array to store factors
        int factorArray[] = new int[count];
        int index = 0;

        // Loop to add factors to the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorArray[index] = i;
                index++;
            }
        }

        // Print factors
        System.out.print("The factors of the number are: ");
        for (int n : factorArray) {
            System.out.print(n + " ");
        }
        System.out.println();
        return factorArray;
    }

    // Method to calculate the sum of all factors
    public static int sumFactors(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Method to calculate the product of all factors
    public static int productFactors(int[] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }

    // Method to calculate the square of the sum of factors
    public static double sumSquare(int addition) {
        return Math.pow(addition, 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int number = input.nextInt();

        int arr[] = factor(number);

        int sum = sumFactors(arr);
        System.out.println("The sum of the factors is: " + sum);

        int product = productFactors(arr);
        System.out.println("The product of the factors is: " + product);

        double square = sumSquare(sum);
        System.out.println("The square of the sum of factors is: " + square);

        input.close();
    }
}
