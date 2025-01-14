import java.util.Scanner;

public class WindChillTemperature {

      // Method to calculate wind chill temperature
          public double calculateWindChill(double temperature, double windSpeed) {
        // Formula to calculate wind chill
          double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
         return windChill; // Return the calculated wind chill
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // For user input

         System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = input.nextDouble();

          System.out.print("Enter the wind speed (in mph): ");
        double windSpeed = input.nextDouble();

         // Create an object to call the instance method
        WindChillTemperature obj = new WindChillTemperature();

          // Display the calculated wind chill temperature
        System.out.println("The wind chill temperature is: " + obj.calculateWindChill(temperature, windSpeed));

        input.close(); // Close the scanner
    }
}
