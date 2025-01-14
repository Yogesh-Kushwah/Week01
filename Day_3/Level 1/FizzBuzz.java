import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = input.nextInt();
		
		String [] string= new String[number];
		
		if(number<0){
		  return;
		}
		
		
		if(number>0){
			for(int i=1; i<=number; i++){
			
			if(i%3==0 && i%5==0){
					string[i-1]= "FizzBuzz";
			  }
				else if(i%3==0){
			      string[i-1]=" Fizz";
				}
				
				else if(i%5==0){
				  string[i-1]= "Buzz";
				}
				
			     else {
				  string[i-1]= String.valueOf(i);
				}
			}
		
			
       for(int i=0;i<string.length;i++){
	   
	   System.out.println("The elements of the array position " +(i+1)+ " = "+ string[i]);
	   }
		
        
		input.close();
		}
	}
}