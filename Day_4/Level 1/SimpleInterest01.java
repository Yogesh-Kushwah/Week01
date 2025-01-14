import java.util.*;

public class SimpleInterest01 {

    // Method to calculate Simple Interest
    public static void calculateSimpleInterest() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Principal amount: ");
        int P = sc.nextInt();  
        
        System.out.print("Enter Rate of Interest: ");
        int R = sc.nextInt();
        
        System.out.print("Enter Time (in years): ");
        int T = sc.nextInt();
        
        double simpleInterest = (P * R * T) / 100.0;  // Calculate Simple Interest
        
        System.out.println("The Simple Interest for principal " + P + ", Rate of Interest " + R + ", and time " + T + " is: " + simpleInterest);
    }

    public static void main(String args[]) {
        calculateSimpleInterest();  // Call the method to perform the calculation
    }
}
