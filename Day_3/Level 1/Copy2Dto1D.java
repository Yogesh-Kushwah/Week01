import java.util.Scanner;

public class Copy2Dto1D {

    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a rows:");
        int rows = input.nextInt();

    System.out.print("Enter a column :");
        int column = input.nextInt();
		
		int[][] twoDArray= new int[rows][column]; 
		
		
		System.out.print("The factors of the number are: ");
        for (int i = 0; i < rows; i++) {
		
		  
		   for (int j = 0; j < column; j++){
		   
		   System.out.print("Enter The position value : [ "+i +" ] [ "+j+" ]");
           twoDArray[i][j] = input.nextInt();
        }
		}
		
		int oneDArray[]= new int[column*rows];
		
		int index=0; 
        for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++){
		  
		  oneDArray[index++]= twoDArray[i][j];
        }
		
		}
		
		  // Print all the factors
        System.out.print("The factors of the number are: ");
        for (int i = 0; i < rows*column; i++) {
            System.out.print(oneDArray[i] + " ");
        }
		
        

        input.close();
    }
}
