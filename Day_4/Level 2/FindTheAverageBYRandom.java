import java .util.*; //Import the java utility package

public class FindTheAverageBYRandom{
	
	
	public int[] generate4DigitRandomArray(int size){
		
		int randomNumbers[] = new int[size];
		for(int i = 0;i<size;i++){
			randomNumbers[i] = 1000 +(int)(Math.random()*9000);
		}
		return randomNumbers;
	}
	
	public double[] findAverageMinMax(int[] numbers){
		
		double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
		
		for(int number : numbers){
			sum = sum+number;
			min = Math.min(numbers[0],number);
			max = Math.max(numbers[0],number);
		}
		
		double average = sum / numbers.length; // Calculate average
		
        return new double[]{average, min, max};
	}
	
	public static void main(String args[]){
		
		FindTheAverageBYRandom obj = new FindTheAverageBYRandom(); //Make the Object of the class
		
		// Generate an array of 5 size random 4-digit numbers
        int[] randomArray = obj.generate4DigitRandomArray(5);
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomArray));

        // Find the average, min, and max values of the array
        double[] results = obj.findAverageMinMax(randomArray);

        // Display the results
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + (int) results[1]);
        System.out.println("Maximum: " + (int) results[2]);
	}
}
