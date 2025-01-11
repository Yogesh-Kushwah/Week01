
import java.util.Scanner;

public class NaturalNoSumCalci {

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the number
        System.out.print("Enter the number : ");
        int number = input.nextInt(); // Read the input as an integer
		
	 if(number>0){
	    
		float sumNaturalNo= number * (number+1) / 2 ;
	  		  System.out.println( "The sum of "+number +" natural numbers is "+sumNaturalNo );

	 }
	else{
		  System.out.println( "The number " +number+" is not a natural number " );
		}
		
	
    }
}
