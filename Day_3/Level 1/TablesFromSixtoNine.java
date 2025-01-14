import java.util.Scanner;

public class TablesFromSixtoNine{

    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
		
		//Taking the integer input
		System.out.print("Enter the value between 6-9: ");
		  int num = input.nextInt();

        // Declare an array to store values
        int[] multiplicationArr = new int[11];
		
		 // Loop to take input for student ages
        for (int i = 1; i <multiplicationArr.length; i++) {
            System.out.println(i+" * "+num +" = "+ (num*i));
            

       
        input.close();
    }
}
}