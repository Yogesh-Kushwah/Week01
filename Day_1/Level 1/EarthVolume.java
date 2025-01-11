public class EarthVolume {

    public static void main(String[] args) {

        // Radius of the Earth in kilometers
        int earthRadius = 6378;

        // Calculate the volume of the Earth in cubic kilometers
        // Formula: (4/3) * π * r^3
        double volumeEarthInKm = (4 / 3.0) * 3.14 * earthRadius * earthRadius * earthRadius;

        // Convert the volume to cubic miles (1 km ≈ 0.621371 miles)
        double volumeEarthInMiles = volumeEarthInKm * 0.621371;

        // Print the Earth's volume in both cubic kilometers and cubic miles
        System.out.println("The volume of Earth in cubic kilometers is " + volumeEarthInKm
                + " and in cubic miles is " + volumeEarthInMiles);
    }
}
