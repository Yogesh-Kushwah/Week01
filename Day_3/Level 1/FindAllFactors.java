import java.util.Scanner;

public class FindAllFactors {

    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive number:");
        int number = input.nextInt();

        int maxFactor = 10; 
        int indexArr = 0;

        // Array to store factors
        int[] factors = new int[maxFactor];

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {

                if (maxFactor == indexArr) {
                    maxFactor *= 2; 

                    int tempArr[] = new int[maxFactor];

                    for (int j = 0; j < factors.length; j++) {
                        tempArr[j] = factors[j];
                    }

                    factors = tempArr;
                }

                factors[indexArr] = i;
                indexArr++;
            }
        }

        // Print all the factors
        System.out.print("The factors of the number are: ");
        for (int i = 0; i < indexArr; i++) {
            System.out.print(factors[i] + " ");
        }

        input.close();
    }
}
