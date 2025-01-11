import java.util.Scanner;

public class Calci {

    public static void main(String[] args) {

        // Scanner to take input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user for the first number
        System.out.println("Enter the Bigger number: ");
        double number1 = input.nextDouble();

        // Ask for the second number
        System.out.println("Enter the Second number");
        double number2 = input.nextDouble();

        // Perform basic calculations
        double addition = number1 + number2;         // Sum of the two numbers
        double subtraction = number1 - number2;      // Difference between the two numbers
        double multiplication = number1 * number2;   // Product of the two numbers
        double division = number1 / number2;         // Division result

        // Print out all the results in one statement
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " 
                + number1 + " and " + number2 + " is " 
                + addition + ", " + subtraction + ", " 
                + multiplication + ", and " + division);
    }
}
