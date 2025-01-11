import java.util.Scanner;

public class LargestNumberCalculator {

    public static void main(String[] args) {

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
		
		if(num1>num2 && num1>num3){
		  System.out.println( "The number "+num1+" is the Largest number"  );
		}
		
		else if(num2 > num1){
		  System.out.println( "The number "+num2+" is the Largest number"  );
		}
		
		else{
		  System.out.println( "The number "+num3+" is the Largest number"  );
		}
		
		
    }
}
