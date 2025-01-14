import java.util.Scanner;

public class FactorsOfNumber{

  
    public static int[] factor(int number) {
	   int count=0;
	    for(int i=1;i<=number; i++){
			(number%i==0){
			    count++;
				}
			}
	
		int factorArray[]= new int[count];
		int index=0;
       
			for(int i=1;i<=number; i++){
				(number%i==0){
					factorArray[index]= i;
					index++;
				}
			}
			
			System.out.println("The factors of the number are: ");
		for(int n:factorArray){
		System.out.print(n+" " );
		}	
	  	
		
		
		return factorArray;
		
		
    }

   public  int static sumFactors(int arr[]){

			int sum=0;
		 
			for(i=0; i<arr.length;i++){
		 
			sum += arr[i];
		 
				}
		 		 return sum;
  }
		
		
	 public  static int productFactors(int arr[]){

			int product=0;
		 
			for(i=0; i<arr.length;i++){
		 
			product *= arr[i];
		 
			}
		 
			return sum;
  
			}
  	
	
		 public static int sumSquare(int addition){

		 
		 int smSquare= Math.pow(addition,2)
		 
		 return smSquare;	 
  
		}
  	
	

		public static void main(String[] args){

			// Create a scanner object for input
			Scanner input = new Scanner(System.in);

			System.out.println("Enter the Number: ");
			int number = input.nextInt(); // read number from user
			
			//accepting the array
			int arr[]= factor( number);
			
			
			int sum=sumFactors(arr);
		System.out.println("The sum of the Number is "+ sum );
		
		int product=productFactors(arr);
		System.out.println("The product of the Number is "+ product );
			
			int square=sumSquare(sum);

        
        input.close();
    }
}
