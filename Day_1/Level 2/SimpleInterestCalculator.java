import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input the Principal amount
        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();

        // Input the Rate of Interest
        System.out.print("Enter the Rate of Interest (in %): ");
        double rate = input.nextDouble();

        // Input the Time in years
        System.out.print("Enter the Time (in years): ");
        double time = input.nextDouble();

        // Calculate the Simple Interest using the formula: SI = P * R * T / 100
        double simpleInterest = (principal * rate * time) / 100;

        // Print the Simple Interest along with the input values
        System.out.println("The Simple Interest is " + simpleInterest + 
                           " for Principal " + principal + 
                           ", Rate of Interest " + rate + 
                           " and Time " + time);
    }
}
