import java.util.*; //Import the java utility package


public class SpringSeasonByMethod {

    // Method to check if the given date is in the Spring season
	
    public static boolean isSpringSeason(int month, int day) {
		
        // Check for March
		
        if (month == 3 && day >= 20 && day <= 31) {
            return true;
        }
        // Check for April
		
        else if (month == 4 && day >= 1 && day <= 30) {
            return true;
        }
        // Check for May
		
        else if (month == 5 && day >= 1 && day <= 31) {
            return true;
        }
        // Check for June
		
        else if (month == 6 && day >= 1 && day <= 20) {
            return true;
        }
        // If not in Spring season
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take month and day as input from the user
        System.out.print("Enter the month");
        int month = sc.nextInt();

        System.out.print("Enter the day");
        int day = sc.nextInt();

        // Validate the input for month and day
		
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid date. Please enter a valid month and day.");
        } else {
            // Call the method and print the result
			
            if (isSpringSeason(month, day)) {
                System.out.println("It's a Spring Season!");
            } else {
                System.out.println("Not a Spring Season.");
            }
        }
    }
}