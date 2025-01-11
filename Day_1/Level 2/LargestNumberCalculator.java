import java.util.Scanner;

public class SmallestNumberCalculator {

    public static void main(String[] args) {
		
		boolean Check= false;

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the number
        System.out.print("Enter the number 1: ");
        int num1 = input.nextInt(); // Read the input as an integer
		
		// Ask the user to enter the number2
        System.out.print("Enter the number 2: ");
        int num2 = input.nextInt(); // Read the input as an integer
	
		
		// Ask the user to enter the number2
        System.out.print("Enter the number 3: ");
        int num3 = input.nextInt(); // Read the input as an integer
		
		if(num1<num2 && num1<num3){
			 check=true;
		  System.out.println( "Is the first number the smallest? " + check );
		}
		
		
		
		else{
		  System.out.println( ""Is the first number the smallest? " + check );
		}
		
		
    }
}
