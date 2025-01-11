import java.util.Scanner;

public class TravelComputation {

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the Cityname
        System.out.print("Enter the Current Cityname: ");
        String fromCity = input.nextLine(); // Read the input as an integer
		
		// Ask the user to enter the Cityname
        System.out.print("Enter the Cityname via reaches Finalcity: ");
        String viaCity = input.nextLine(); // Read the input as an integer 

		// Ask the user to enter the Cityname
        System.out.print("Enter the Final Cityname : ");
        String toCity = input.nextLine(); // Read the input as an integer
		
		// Ask the user to enter the distance
        System.out.print("Enter the distance From city to viaCity: ");
      double distanceFromToVia = input.nextDouble(); // Read the input as an integer
		
		  // Ask the user to enter the distance
        System.out.print("Enter the distance from via to Finalcity : ");
       double distanceViaToFinalCity = input.nextDouble(); // Read the input as an integer
		
		// Ask the user to enter the time
        System.out.print("Enter the Time from city to via in Minutes: ");
        int timeFromToVia = input.nextInt(); // Read the input as an integer
		
		  // Ask the user to enter the time
        System.out.print("Enter the time from via to final city in Minutes: ");
       int timeViaToFinalCity = input.nextInt(); // Read the input as an integer
		
	
		
	double totalDistance= distanceFromToVia+distanceViaToFinalCity;
	int totalTime = timeFromToVia+timeViaToFinalCity;
		
		
      
   // Print the travel details
      System.out.println("The Total Distance travelled by from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
   }
}

   
