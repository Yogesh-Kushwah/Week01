import java.util.Scanner;

public class StudentGrades {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt(); //taking number of students

        // Initialize arrays to store data
        int[] physicsMarks = new int[numStudents];
        int[] chemistryMarks = new int[numStudents];
        int[] mathMarks = new int[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Take input for each student's marks
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");

            System.out.print("Enter marks in Physics: ");
            physicsMarks[i] = input.nextInt();
            while (physicsMarks[i] < 0) {
                System.out.print("Invalid marks. Enter positive value: ");
                physicsMarks[i] = input.nextInt();
            }

            System.out.print("Enter marks in Chemistry: ");
            chemistryMarks[i] = input.nextInt();
            while (chemistryMarks[i] < 0) {
                System.out.print("Invalid marks. Enter positive value: ");
                chemistryMarks[i] = input.nextInt();
            }

            System.out.print("Enter marks in Math: ");
            mathMarks[i] = input.nextInt();
            while (mathMarks[i] < 0) {
                System.out.print("Invalid marks. Enter positive value: ");
                mathMarks[i] = input.nextInt();
            }

            // Calculate percentage
            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathMarks[i]) / 3.0;

            // Determine grade
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        // Display results
        System.out.println("Results ");
	    System.out.println("Student | Physics | Chemistry | Math | Percentage | Grade");
		for (int i = 0; i < numStudents; i++) {
			System.out.println((i + 1) + " | " + physicsMarks[i] + " | " + chemistryMarks[i] + " | " + mathMarks[i] + " | " + percentages[i] + " | " + grades[i]);
		}

        input.close();
    }
}