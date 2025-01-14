import java.util.Arrays;

public class NumberChecker01{

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to check if the number is a Duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true; 
            }
        }
        return false; 
    }

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrongNumber(int[] digits, int originalNumber) {
        int sum = 0;
        int n = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, n);
        }
        return sum == originalNumber;
    }

    // Method to find the largest and second largest elements in the digits array
    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        System.out.println("Largest: " + largest + ", Second Largest: " + secondLargest);
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        System.out.println("Smallest: " + smallest + ", Second Smallest: " + secondSmallest);
    }

    // Main method to call and test the above methods
    public static void main(String[] args) {
        int number = 153;  // Example number for testing

        // Store the digits of the number in an array
        int[] digits = storeDigits(number);

        // Find count of digits
        System.out.println("Count of digits: " + countDigits(number));

        // Check if it's a Duck number
        System.out.println("Is Duck Number: " + isDuckNumber(digits));

        // Check if it's an Armstrong number
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(digits, number));

        // Find the largest and second largest digits
        findLargestAndSecondLargest(digits);

        // Find the smallest and second smallest digits
        findSmallestAndSecondSmallest(digits);
    }
}
