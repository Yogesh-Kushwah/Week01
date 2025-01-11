import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Input for month, day, and year
        System.out.print("Enter month (1-12): ");
        int m = scanner.nextInt();

        System.out.print("Enter day (1-31): ");
        int d = scanner.nextInt();

        System.out.print("Enter year: ");
        int y = scanner.nextInt();

        // Calculations based on the formulas
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Determine the day of the week
        if (d0 == 0) {
            System.out.println("Day of the week: Sunday (0)");
        } else if (d0 == 1) {
            System.out.println("Day of the week: Monday (1)");
        } else if (d0 == 2) {
            System.out.println("Day of the week: Tuesday (2)");
        } else if (d0 == 3) {
            System.out.println("Day of the week: Wednesday (3)");
        } else if (d0 == 4) {
            System.out.println("Day of the week: Thursday (4)");
        } else if (d0 == 5) {
            System.out.println("Day of the week: Friday (5)");
        } else if (d0 == 6) {
            System.out.println("Day of the week: Saturday (6)");
        } else {
            System.out.println("Error: Invalid day calculated.");
        }

        scanner.close(); // Close the scanner
    }
}
