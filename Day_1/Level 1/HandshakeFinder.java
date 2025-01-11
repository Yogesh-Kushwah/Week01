import java.util.Scanner;

public class HandshakeFinder {

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the number of students
        System.out.print("Enter the number of Students: ");
        int students = input.nextInt(); // Read the input as an integer

        // Calculate the maximum number of handshakes
        // Formula: n * (n - 1) / 2, where n is the number of students
        int noOfHandshake = (students * (students - 1)) / 2;

        // Display the result
        System.out.println("The maximum number of handshakes among " + students + " students is " + noOfHandshake);
    }
}
