import java.util.Scanner;

public class PlayerHeight{

    public static void main(String[] args) {

         int sum=0;
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
	

        // Declare an array to store values
        double[] height  = new double[11];
		
		 // Loop to take input for student ages
        for (int i = 0; i <height.length; i++) {
            
		System.out.print("Enter the height of the player "+(i+1)+": ");
			height[i]=input.nextDouble();
            }


      for (int i = 0; i <height.length; i++) {
            
			sum += height[i];
            }
			
		double mean= sum/11;

		System.out.println("The mean height of the players are: "+ mean);
       
        input.close();
    
}
}