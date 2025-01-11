import java.util.Scanner;

public class TotalPriceCalculator {

    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Read the price of a single unit
        System.out.print("Enter the price of single unit: ");
        float price = input.nextFloat(); 

        // Read the quantity to be bought
        System.out.print("Enter the Quantity to be bought: ");
        int quantity = input.nextInt(); 

        // Calculate the total price
        float totalPrice = price * quantity; 

        // Display the total purchase price, quantity, and unit price
        System.out.println("The total purchase price is INR " + totalPrice +  " if the quantity is " + quantity + " and unit price is INR " + price);
    }
}
