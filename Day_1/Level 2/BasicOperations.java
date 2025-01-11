import java.util.Scanner;

public class  BasicOperations{

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the number
        System.out.print("Enter the value of a: ");
        int a = input.nextInt(); // Read the input as an integer
		
		// Ask the user to enter the number2
        System.out.print("Enter the value of b ");
        int b = input.nextInt(); // Read the input as an integer
		
		   // Ask the user to enter the number
        System.out.print("Enter the value of c: ");
        int c = input.nextInt(); // Read the input as an integer
		
		//storing the operation into the variables
		
		int operation1= a+b*c;
		int operation2= a*b+c;
		int operation3= c+a/b;
		int operation4= a%b+c;

        // Display the result
        System.out.println(" The results of Int Operations are "+ 
		operation1 +","+
		operation2+"," +
		operation3+" and "+
		operation4);
    }
}
