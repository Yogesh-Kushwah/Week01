import java.util.Scanner;

public class YoungestAndTallestFriends {

    public static void main(String args[]) {
        // Create arrays to store ages and heights of the three friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        Scanner input = new Scanner(System.in);

        // Input the ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt(); //taking age as input
            System.out.print("Enter height of " + names[i] + " in cm: ");
            heights[i] = input.nextDouble(); //taking height as input
        }

        // Find the youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Compare to find the youngest
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Compare to find the tallest
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Output the results
        System.out.println("The youngest friend is " + names[youngestIndex] + " and the tallest friend is " + names[tallestIndex]);
       
		input.close();
    }
}
