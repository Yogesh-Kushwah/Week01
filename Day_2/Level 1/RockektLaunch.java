import java.util.Scanner;

public class RockektLaunch{

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the number
        System.out.print("Enter the number: ");
        int  counter = input.nextInt(); // Read the input as an integer
		
		while(counter!=0){
		
		System.out.println( counter);
		counter--;
		
		}

		
		input.close();
    }
}
