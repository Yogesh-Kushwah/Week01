import java.util.Scanner;

public class SinCosTangentCalculator {

     // Method to calculate sine, cosine, and tangent
    public double[] calculateTrigonometricFunctions(double radians) {
          double sine = Math.sin(radians);   // Calculate sine
         double cosine = Math.cos(radians); // Calculate cosine

        double tangent = Math.tan(radians); // Calculate tangent

        // Return all values in an array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {

         // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

         System.out.println("Enter the angle in degrees: ");

         double angle = input.nextDouble(); // Read angle from user
           
        // Convert angle to radians
        double radians = angle * (Math.PI / 180);

            // Create an object of the class
          SinCosTangentCalculator obj = new SinCosTangentCalculator();

        // Calculate trigonometric functions
        double[] results = obj.calculateTrigonometricFunctions(radians);

        // Display the results
        System.out.println("The sine of " + angle + "° is: " + results[0]);

         System.out.println("The cosine of " + angle + "° is: " + results[1]);
        System.out.println("The tangent of " + angle + "° is: " + results[2]);


        // Close the scanner
        input.close();
    }
}
