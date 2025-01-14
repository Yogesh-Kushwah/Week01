import java.util.Scanner;

public class UnitConvertor1{

  
  // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double mile) {
        double miles2km = 1.60934;
        return mile * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meter) {
        double meters2feet = 3.28084;
        return meter * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

		public static void main(String[] args){

			// Create a scanner object for input
			Scanner input = new Scanner(System.in);

			System.out.print("Enter the Number Km to Convert: ");
			double km = input.nextDouble(); // read number from user
			
			
		 System.out.print("Enter the Number miles to Convert: ");
			double mile = input.nextDouble(); // read number from user
							 
		System.out.print("Enter the Number meters to Convert: ");
			double meter = input.nextDouble(); // read number from user
			
			
		System.out.print("Enter the feet to Convert: ");
			double feet = input.nextDouble(); // read number from user	


      //Accepting the return method
	  double miles = convertKmToMiles( km);
System.out.println(km + " kilometers is equal to " + miles + " miles.");
	  
	  double kilometers= convertMilesToKm( mile) ;
	  System.out.println(mile + " miles is equal to " + kilometers + " kilometers.");

	  double feets=convertMetersToFeet(meter);
	  System.out.println(meter + " meters is equal to " + feet + " feet.");
	  
	  double metersResult =convertFeetToMeters( feet);
	  System.out.println(feet + " feet is equal to " + metersResult + " meters.");
        
        input.close();
    }
}
