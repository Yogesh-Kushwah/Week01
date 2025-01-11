import java.util.Scanner;

public class  ChocolateDistribution{

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the number
        System.out.print("Enter the number of chocolates: ");
        int numberOfchocolates = input.nextInt(); // Read the input as an integer
		
		// Ask the user to enter the number2
        System.out.print("Enter the number of Children: ");
        int numberOfChildren = input.nextInt(); // Read the input as an integer
		
		int remainingChocolates= numberOfchocolates%numberOfChildren;
		int chocolatesChildrenGet= numberOfchocolates/numberOfChildren;
		

        // Display the result
        System.out.println( "The number of chocolates each child gets is " + chocolatesChildrenGet +
                        " and the number of remaining chocolates are " + remainingChocolates);
    }
}
