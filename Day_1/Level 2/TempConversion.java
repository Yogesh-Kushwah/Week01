import java.util.Scanner;

public class TempConversion {

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the number
        System.out.print("Enter the number 1: ");
        int celsius = input.nextInt(); // Read the input as an integer
		
		int farenheitResult= (celsius * 9/5) + 32;
      

        // Display the result
        System.out.println("The " +celsius+ " celsius is "+
		farenheitResult+
		" fahrenheit " );
    }
}
