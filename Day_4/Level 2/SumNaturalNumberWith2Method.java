import java.util.Scanner;

public class SumNaturalNumberWith2Method {

    // Method to calculate the sum of natural numbers using recursion
    public static int recurssionSum(int number) {
        if (number == 1) {
            return 1;
        }
        return number + recurssionSum(number - 1);
    }

    // Method to calculate the sum of natural numbers using the formula
    public static int sumWithFormula(int number) {
        return number * (number + 1) / 2;
    }

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int number = input.nextInt(); // Read number from user

        int recurssiveSum = recurssionSum(number);
        int normalSum = sumWithFormula(number);

        if (recurssiveSum == normalSum) {
            System.out.print("The results are equal: " + normalSum);
        } else {
            System.out.print("The results are not equal, sum from formula: " +
                             normalSum + ", sum from recursion: " + recurssiveSum);
        }

        input.close();
    }
}
