import java.util.Scanner;

public class RockektLaunchForlp{

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the number
        System.out.print("Enter the number: ");
        int  counter = input.nextInt(); // Read the input as an integer
		
		for(int i=counter; i>0;counter--){
		
		System.out.println( counter);
	
		
		}

		
		input.close();
    }
}
