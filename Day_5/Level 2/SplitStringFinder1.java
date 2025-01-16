import java.util.*;

public class SplitStringFinder1{
    // Method to calculate the length of the string without using length()
    public static int printLength(String word) {
        int length = 0;

        try {
            while (true) {
                word.charAt(length); // Try accessing each character
                length++; // Increment length
            }
        } catch (Exception e) {
            // Catch StringIndexOutOfBoundsException and do nothing
        }
        return length;
    }

    // Method to split the string into words without using split()
    public static String[] splitWords(String word,int count) {
       
	   int wordCount = 1;

        // Count the number of spaces to determine word count
        for (int i = 0; i < count; i++) {
            if (word.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] arr = new String[wordCount];
        int start = 0;
        int index = 0;

        // Iterate through the string to split into words
        for (int i = 0; i < count; i++) {
            if (word.charAt(i) == ' ') {
                arr[index++] = word.substring(start, i); // Add word to array
                start = i + 1; // Update start to the next word
            }
        }
        // Add the last word
        arr[index] = word.substring(start);

        return arr;
    }

    // Method to compare two string arrays
    public static boolean compare(String[] str1, String[] str2) {
        if (str1.length != str2.length) {
            return false; // Arrays of different lengths are not equal
        }
        for (int i = 0; i < str1.length; i++) {
            if (!str1[i].equals(str2[i])) {
                return false; // Mismatched word found
            }
        }
        return true; // Arrays are equal
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.println("Enter the text:");
        String word = sc.nextLine();


        int count  =  printLength(word);
      
	  // Call splitWords and compare with built-in split
        String[] customSplit = splitWords(word,count);
        String[] builtInSplit = word.split(" ");

        // Compare the results
        boolean isEqual = compare(customSplit, builtInSplit);

        // Display results
        if (isEqual) {
            System.out.println("Both the string arrays are equal.");
        } else {
            System.out.println("Both the string arrays are not equal.");
        }

        // Display the custom split result
        System.out.println("Custom Split Result: " + Arrays.toString(customSplit));
        System.out.println("Built-In Split Result: " + Arrays.toString(builtInSplit));
    }
}