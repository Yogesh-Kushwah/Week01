import java.util.*; //Import the java utility package

public class MaximumHandshakes{
	
	
	//Make a method to calculate the Handshakes
	public static void findHandshakes(){
		
		 Scanner sc = new Scanner(System.in);
		
		//Take input from the user
		System.out.println("Enter number");
		int number = sc.nextInt();	
	   
	   //Formula to cacculate the maximum number of handshakes
		int handShakes = (number*(number-1))/2;
		
		
		System.out.println("The maximum number of hanshakes "+handShakes);
		
		
	}
    public static void main(String args[]) {
       
		findHandshakes();//Calling the method

      
    }
}