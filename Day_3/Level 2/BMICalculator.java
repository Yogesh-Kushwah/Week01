import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number of persons
        System.out.print("Enter the number of persons ");
        int numPersons = input.nextInt(); // taking number of person as input

        // Initialize arrays to store data
        double[] heights = new double[numPersons];
        double[] weights = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] status = new String[numPersons];

        // Take input for each person's height and weight
        for (int i = 0; i < numPersons; i++) {
		
         //   System.out.println("Person " + (i + 1) + ":");
            System.out.print("Enter weight of person " +(i + 1)+" in kg : ");
            weights[i] = input.nextDouble();
			
            System.out.print("Enter height of person " +(i + 1)+" in meters: ");
            heights[i] = input.nextDouble();

            // Calculate BMI
            bmi[i] = weights[i] / (heights[i] * heights[i]);

            // Determine status
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

       
        System.out.println("Results ");
        System.out.println("Person | Height (m) | Weight (kg) | BMI   | Status");
		for (int i = 0; i < numPersons; i++) {
			System.out.println((i + 1) + " | " + heights[i] + " | " + weights[i] + " | " + bmi[i] + " | " + status[i]);
		}


        input.close();
    }
}