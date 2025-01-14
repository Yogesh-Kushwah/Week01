import java.util.Scanner;

public class EmployeeBonusCalculator {

    public static void main(String[] args) {
       
         int numEmployees = 10;

        // Arrays to store employee salary, years of service, bonus, and new salary
        double[] salary = new double[numEmployees];
        int[] yearsOfService = new int[numEmployees];
        double[] bonus = new double[numEmployees];
        double[] newSalary = new double[numEmployees];

        // Variables to calculate totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        Scanner input = new Scanner(System.in);

        // Input loop for employee data
        for (int i = 0; i < numEmployees; i++) {
           
                    // Input salary and years of service
                    System.out.print("Enter salary for employee " + (i + 1) + ": ");
                    salary[i] = input.nextDouble();
                    System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                    yearsOfService[i] = input.nextInt();

                    // Check for valid salary and years of service
                    if (salary[i] < 0 || yearsOfService[i] < 0) {
                        System.out.println("Invalid input! Salary should be positive and years of service should be non-negative. Please enter again.");
						i--;
                      
                    }
                 
                }

        // Calculate bonus, new salary, and totals
        for (int i = 0; i < numEmployees; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;  // 5% bonus for more than 5 years of service
            } else {
                bonus[i] = salary[i] * 0.02;  // 2% bonus for 5 years or less of service
            }

            // Calculate new salary
            newSalary[i] = salary[i] + bonus[i];

            // Update totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
		System.out.println("Employee Bonus Details ");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee: " +i +" years Of Service: "+ yearsOfService[i]+ " bonus: "+bonus[i]+ " new salary: " + newSalary[i]); 

        }

        System.out.printf("total Bonus Payout "+ totalBonus + " total Old Salary of all employees "+ totalOldSalary +" total New Salary of all employees "+ totalNewSalary);
		input.close();
      
    }
}
