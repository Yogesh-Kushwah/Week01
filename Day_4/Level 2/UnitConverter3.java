import java.util.Scanner;

public class UnitConverter3{

      // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

     // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

        // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

     // Method to convert kilograms to pounds
     public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
		public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
		public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

		public static void main(String[] args) {
			
        Scanner input = new Scanner(System.in);

        // Fahrenheit to Celsius
			System.out.print("Enter temperature in Fahrenheit: ");
			double fahrenheit = input.nextDouble();
        System.out.println(fahrenheit + "°F is equal to " + convertFahrenheitToCelsius(fahrenheit) + "°C.");

        // Celsius to Fahrenheit
			System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
			System.out.println(celsius + "°C is equal to " + convertCelsiusToFahrenheit(celsius) + "°F.");

        // Pounds to Kilograms
        System.out.print("Enter weight in Pounds: ");
			double pounds = input.nextDouble();
			System.out.println(pounds + " pounds is equal to " + convertPoundsToKilograms(pounds) + " kilograms.");

        // Kilograms to Pounds
			System.out.print("Enter weight in Kilograms: ");
        double kilograms = input.nextDouble();
			System.out.println(kilograms + " kilograms is equal to " + convertKilogramsToPounds(kilograms) + " pounds.");

        // Gallons to Liters
        System.out.print("Enter volume in Gallons: ");
			double gallons = input.nextDouble();
			System.out.println(gallons + " gallons is equal to " + convertGallonsToLiters(gallons) + " liters.");

        // Liters to Gallons
        System.out.print("Enter volume in Liters: ");
			double liters = input.nextDouble();
			System.out.println(liters + " liters is equal to " + convertLitersToGallons(liters) + " gallons.");

        input.close();
    }
}
