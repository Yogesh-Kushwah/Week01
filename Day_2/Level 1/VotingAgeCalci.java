import java.util.Scanner;

public class  VotingAgeCalci{

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the Age
        System.out.print("Enter the Age: ");
        int age = input.nextInt(); // Read the input as an integer
		
	 if(age>=18){
	    
	  		  System.out.println( "The person's age is "+ age+" and can vote " );
			  
	 }else{
		  System.out.println( "The person's age is"+age +" and cannot vote " );
		}
		
	
    }
}