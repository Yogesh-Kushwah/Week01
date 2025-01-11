import java.util.Scanner;

public class SumOfNumberUntilZeroBreak{

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the number
        System.out.print("Enter the number : ");
       double number = input.nextDouble(); // Read the input as an integer
		
		double total= 0.0;
		
		while(true){
		
		total +=number;
     
               
                 if(number>0){
		System.out.print("Enter the number again: ");
		number =input.nextDouble();
		   	}

                    else{ break; }
		}

                
	
        // Display the result
        System.out.println(total );
		
		input.close();
    }
}
