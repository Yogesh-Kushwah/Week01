import java.util.Scanner;

public class SmallestLargestFinder {

public static int[] findSmallestAndLargest(int number1, int number2, int number3){

 int smallest= number1;
 int largest = number1;
 
 
// Calculating the Smallest Of  number
  if(number2<smallest){
     smallest=number2;
  }
 else if( number3<smallest){
      smallest=number3;
  }

//calculation of the largest number 

if(number2>largest){
     largest=number2;
  }
 else if( number3>largest){
     largest=number3;
  }
  
  return new int[]{smallest,largest};
  
}




    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number1 = input.nextInt();
		
		 System.out.print("Enter a number:");
        int number2 = input.nextInt();
		
		 System.out.print("Enter a number:");
        int number3 = input.nextInt();
		
		int[] arr= findSmallestAndLargest(number1,number2,number3);
	
		 
      System.out.println("The smallest number is "+ arr[0]);
      System.out.print("The Lagest number is "+ arr[1]);
       
		
	
		
	
        
		input.close();
		}
	}
