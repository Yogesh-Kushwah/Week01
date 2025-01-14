import java.util.Scanner;

 class StudentGrades2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

     
        System.out.print("Enter the number of students: ");
        int students = input.nextInt(); //taking number of students

        // Create a 2D array to store marks of students in Physics, Chemistry, and Maths
        int[][] marks = new int[students][3];

        // Take input for marks of each student
        System.out.println("Enter the marks of each student in Physics, Chemistry, and Maths:");
        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ": ");
            for (int j = 0; j < 3; j++) {
                if (j == 0) System.out.print("Physics: ");
                if (j == 1) System.out.print("Chemistry: ");
                if (j == 2) System.out.print("Maths: ");
                marks[i][j] = input.nextInt();
            }
        }

        // Array to store percentages and grades
        double[] percentages = new double[students];
        char[] grades = new char[students];

        // Calculate percentage and grade for each student
        for (int i = 0; i < students; i++) {
            int total = 0;

            // Calculate total marks
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            // Calculate percentage
            percentages[i] = (total / 3.0);

            // Assign grade based on percentage
            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 75) {
                grades[i] = 'B';
            } else if (percentages[i] >= 50) {
                grades[i] = 'C';
            } else {
                grades[i] = 'F';
            }
        }
		System.out.println("Results:");
		System.out.println("Student | Physics | Chemistry | Maths | Percentage | Grade");
		
		for (int i = 0; i < students; i++) {
			System.out.println((i + 1) + " | " + marks[i][0] + " | " + marks[i][1] + " | " + marks[i][2] + " | " + percentages[i] + "% | " + grades[i]);
		}

		
        input.close();
      
    }
}