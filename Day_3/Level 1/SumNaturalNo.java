import java.util.Scanner;

public class SumNaturalNo {

public static int NaturalNo(){
 int sum= 0;
 
 for(int i=1;i<=number;i++){
  sum += i;
 }
 
return sum;
}




    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = input.nextInt();
		
		int sumNaturalNo=NaturalNo(number);
		
		
		 System.out.print("The sum of the Natural No "+ sumNaturalNo);
        
		input.close();
		}
	}
