import java.util.Scanner;

public class  SwapNumbers{

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the number
        System.out.print("Enter the number 1: ");
        int num1 = input.nextInt(); // Read the input as an integer
		
		// Ask the user to enter the number2
        System.out.print("Enter the number 2: ");
        int num2 = input.nextInt(); // Read the input as an integer
		
		// Display the result before swapping
        System.out.println("The numbers are "+ num1 +" and "+ num2);
		
		int temp=0;
		
		temp = num1;
		num1=num2;
		num2 =temp;
		
        // Display the result
        System.out.println("The swapped numbers are "+ num1 +" and "+ num2);
    }
}
