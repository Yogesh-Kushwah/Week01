import java.util.Scanner;

public class CheckingSeasons {

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the number
        System.out.print("Enter the Month : ");
        int month = input.nextInt(); // Read the input as an 
		
		  // Ask the user to enter the number
        System.out.print("Enter the Day : ");
        int day = input.nextInt(); // Read the input as an integer
		
	 if(month >=3 && month<=5 && day>=20 ){
	    
	  		  System.out.println( "Its a Spring Season" );

	 }
	 else if(month >=6  &&  day<=20 ){
	    
	  		  System.out.println( "Its a Spring Season" );

	 }

		else {
		  System.out.println( "Not a Spring Season" );
		}
		
		
		input.close();
	
    }
}
