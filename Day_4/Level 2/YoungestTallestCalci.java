import java.util.Scanner;

public class YoungestTallestCalci {

    // Method to find the index of the youngest person
    public static int youngest(int[] ageArray) {
        int youngestIndex = 0;

        for (int i = 1; i < ageArray.length; i++) {
            if (ageArray[i] < ageArray[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }

    // Method to find the index of the tallest person
    public static int tallest(double[] heightArray) {
        int tallestIndex = 0;

        for (int i = 1; i < heightArray.length; i++) {
            if (heightArray[i] > heightArray[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner input = new Scanner(System.in);

        double[] heightArray = new double[3]; // Array to store heights
        int[] ageArray = new int[3];           // Array to store ages

        String[] name = {"Amar", "Akbar", "Anthony"}; // Names of the individuals

        // Loop to get input for ages and heights of individuals
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the Age of " + name[i] + ": ");
            ageArray[i] = input.nextInt();

            System.out.print("Enter the Height of " + name[i] + ": ");
            heightArray[i] = input.nextDouble();
        }

        // Find the indices of the youngest and tallest individuals
        int youngestIndex = youngest(ageArray);
        int tallestIndex = tallest(heightArray);

        // Output the results
        System.out.println("The tallest among the three is: " + name[tallestIndex]);
        System.out.print("The youngest among the three is: " + name[youngestIndex]);

        // Close the scanner
        input.close();
    }
}
