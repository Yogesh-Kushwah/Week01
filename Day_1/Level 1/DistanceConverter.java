public class DistanceConverter {

    public static void main(String[] args) {

        float distance = 10.8f; // Distance in kilometers
        double miles = distance * 0.621371; // Convert distance to miles using the conversion factor

        // Print the converted distance in miles
        System.out.println("The distance " + distance + " km in miles is " + miles);
    }
}
