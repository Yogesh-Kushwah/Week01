import java.util.Scanner;

public class CelsiusConversion {

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the number
        System.out.print("Enter the number 1: ");
        int fahrenheit = input.nextInt(); // Read the input as an integer
		
		int celsiusResult= (fahrenheit − 32) * (5/9);
      

        // Display the result
        System.out.println("The " +fahrenheit+ " fahrenheit is "+
		celsiusResult+
		" celsiusResult " );
    }
}
