import java.util.Scanner;

public class  WeightConverter{

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the Weight in pounds
        System.out.print("Enter the Weight in Pounds: ");
       float pound = input.nextInt(); // Read the input as an integer
		
		float kilogram = (float)(pound/2.2);  //converting the pound to kilogram

        // Displaying the result
        System.out.println("The weight of the person in pound is "+pound +" and in kg is "+ kilogram);
    }
}
