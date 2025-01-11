import java.util.Scanner;

public class  QuotientRemainderCalci{

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the number
        System.out.print("Enter the number 1: ");
        int num1 = input.nextInt(); // Read the input as an integer
		
		// Ask the user to enter the number2
        System.out.print("Enter the number 2: ");
        int num2 = input.nextInt(); // Read the input as an integer
		
		// printing the quotient 
		int  quotient = num1/num2;
		
		// printing the remainder
		int remainder= num1%num2;

      

        // Display the result
        System.out.println("The Quotient is "+quotient+
		" and Reminder is "+
		remainder+" of two number"+ num1+" and "+num2 );
    }
}
