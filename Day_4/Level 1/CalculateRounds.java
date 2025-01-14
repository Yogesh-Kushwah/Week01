import java.util.*; //Import the java utility package

public class CalculateRounds{
	
	
	//Make a method to calculate the Handshakes
	public static void howManyRounds(){
		
		 //Make the object of the scanner class to take the input 
Scanner input = new Scanner(System.in);

//Takes the input from the user
System.out.println("Enter First side : ");
int side1 = input.nextInt();

System.out.println("Enter Second side : ");
int side2 = input.nextInt();

System.out.println("Enter Third side : ");
int side3 = input.nextInt();

//Converts the distance into kilometer to meter
int totalDistance = 5*1000;

//Calculates the perimeter of the triangle
int perimeter = side1+side2+side3;

//Calculates the total number of rounds an athelete completes
int totalRounds = totalDistance/perimeter;

System.out.println("The total number of rounds the athlete will run is "+totalRounds+" to complete 5 km");
		
		
	}
    public static void main(String args[]) {
       
		howManyRounds();//Calling the method

      
    }
}