import java.util.*; //Import the java utility package

public class NumberIsPosNegZero{
	
	
	//Make a method to calculate the Handshakes
	public static int checkNumber(){
		
		 //Make the object of the scanner class to take the input 
	Scanner input = new Scanner(System.in);

	//Takes the input from the user
	System.out.println("Enter number : ");
	int number = input.nextInt();

	//write the conditions to check the number is positive negative or zero
	if(number>0){
	return 1;
	}
	else if(number<0){
		return -1;
	}
	else{
		return 0;

	}
	}
    public static void main(String args[]) { //main method of program
       
		int result = checkNumber();//Calling the method
		
		if(result == 1){
			System.out.println("The number is positive");
		}
		else if(result == -1){
			System.out.println("The number is negative");
		}
		else{
			System.out.println("The number is zero");
		}
    }
}