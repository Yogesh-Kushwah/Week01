import java.util.Scanner;

public class  BasicOperationsWithDouble{

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the number
        System.out.print("Enter the value of a: ");
        Double a = input.nextDouble(); // Read the input as an integer
		
		// Ask the user to enter the number2
        System.out.print("Enter the value of b: ");
        Double b = input.nextDouble(); // Read the input as an integer
		
		   // Ask the user to enter the number
        System.out.print("Enter the value of c: ");
        Double c = input.nextDouble(); // Read the input as an integer
		
		//storing the operation into the variables
		
		Double operation1= a+b*c;
		Double operation2= a*b+c;
		Double operation3= c+a/b;
		Double operation4= a%b+c;

        // Display the result
        System.out.println(" The results of Int Operations are "+ 
		operation1 +","+
		operation2+"," +
		operation3+" and "+
		operation4);
    }
}
