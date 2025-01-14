import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote based on their age
    public static boolean canStudentVote(int age) {

        if (age <= 0) {
            // If the age is less than or equal to 0, the student cannot vote
            return false;
        }

        if (age >= 18) {
            // If the age is 18 or above, the student can vote
            return true;
        }

        // Otherwise, the student cannot vote
        return false;
    }

    public static void main(String[] args) {

        // Create a scanner object for input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the age of the student 1: ");
        int age = input.nextInt();

        int studentAge[] = new int[10];

        // Loop to take input for ages of multiple students
        for (int i = 0; i < studentAge.length - 1; i++) {
            System.out.print("Enter the age of student " + (i + 2) + ": ");
            age = input.nextInt();
            studentAge[i] = age;
        }

        // Loop to check voting eligibility for each student
        for (int i = 0; i < studentAge.length; i++) {

            boolean canVote = canStudentVote(studentAge[i]);

            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote\n");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote\n");
            }
        }

        input.close();
    }
}
