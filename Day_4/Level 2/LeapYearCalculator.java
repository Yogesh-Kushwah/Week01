import java.util.Scanner;

public class LeapYearCalculator {

    // Method to check if a year is a leap year
    public static boolean leapYear(int year) {
        if (year < 1582) {
            return false; // Before 1582, it's not a leap year
        }
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true; // Leap year condition
        }
        return false; // Not a leap year
    }

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Year >= 1582: ");
        int year = input.nextInt(); // Read year from user

        boolean isleapYear = leapYear(year); // Check if it's a leap year

        if (isleapYear) {
            System.out.print(year + " year is a leap Year");
        } else {
            System.out.print(year + " year is not a leap Year");
        }

        input.close();
    }
}
