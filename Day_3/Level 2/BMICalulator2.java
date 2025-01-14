import java.util.Scanner;

class BMICalulator2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter the number of persons ");
        int numberOfPersons = input.nextInt();//taking number of person

        // Create a 2D array to store weight, height, and BMI for each person
        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];

        // taking weight and height for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");

            // Take input for height and weight with validation for positive values
            do {
                System.out.print("Height (in meters): ");
                personData[i][0] = input.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Height must be a positive value. Please try again.");
                }
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Weight (in kg): ");
                personData[i][1] = input.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Weight must be a positive value. Please try again.");
                }
            } while (personData[i][1] <= 0);

         
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determine the weight status based on BMI
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
			
        }
		System.out.println("\nPerson Details (Height, Weight, BMI, Weight Status):");
		for (int i = 0; i < numberOfPersons; i++) {
			System.out.println("Person " + (i + 1) + ":");
			System.out.println("Height: " + personData[i][0] + " meters");
			System.out.println("Weight: " + personData[i][1] + " kg");
			System.out.println("BMI: " + personData[i][2]);
			System.out.println("Weight Status: " + weightStatus[i]);
		}
		 input.close();
	}

     
       
}