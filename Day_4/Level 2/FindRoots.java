import java.util.*; // Import the java utility package

public class FindRoots {

    // Method to calculate the roots of the quadratic equation
    public static double[] rootsOfQuadraticEquation(double a, double b, double c) {
        
        // Calculate the delta
        double delta = Math.pow(b, 2) + (4 * a * c);
        
        if (delta > 0) {
            // This has two distinct roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } 
        else if (delta == 0) {
            // This has only one root
            double root = -b / (2 * a);
            return new double[]{root};
        } 
        else {
            // No roots are found
            return new double[]{};
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Taking the inputs from the user
        System.out.println("Enter a:");
        double a = sc.nextDouble();  
        
        System.out.println("Enter b:");
        double b = sc.nextDouble();
        
        System.out.println("Enter c:");
        double c = sc.nextDouble();
        
        // Condition for the denominator being zero or not
        if (a == 0) {
            System.out.println("The denominator cannot be zero.");
            return;
        }
        
        // Stores the results of the method rootsOfQuadraticEquation in this result array
        double[] result = rootsOfQuadraticEquation(a, b, c);
        
        // Printing the results according to the output
        if (result.length == 2) {
            System.out.println("The two distinct roots are found.");
            System.out.println("The first root is: " + result[0]);
            System.out.println("The second root is: " + result[1]);
        } 
        else if (result.length == 1) {
            System.out.println("Only one root is found.");
            System.out.println("The root is: " + result[0]);
        } 
        else {
            System.out.println("No root is found.");
        }
    }
}
