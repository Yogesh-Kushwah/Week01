import java.util.Scanner;

public class SalaryCalculator{

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the number
        System.out.print("Enter the number 1: ");
        int salary = input.nextInt(); // Read the input as an integer
		
		// Ask the user to enter the number2
        System.out.print("Enter the number 2: ");
        int bonus = input.nextInt(); // Read the input as an integer
		
		int totalIncome= salary+bonus;

        // Display the result
        System.out.println( The salary is INR "+salary+" 
		and bonus is INR "+ bonus+". 
		Hence Total Income is INR "+ totalIncome);  }
}
