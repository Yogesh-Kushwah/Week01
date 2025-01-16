import java.util.Scanner;

public class ComparingStrings{



public static boolean compareString(String str1, String str2){

     if(str1.length()!=str2.length()){
	    
		return false;
	 }
	 
	 
	for(int i=0;i<str1.length();i++){
	
	if(str1.charAt(i)==str2.charAt(i));
	 return true;
	 
	}
	
	return false;

}

public static void main(String[] args){

        // Create a scanner object for input
			Scanner input = new Scanner(System.in);

			System.out.print("Enter the String 1 ");
			String str1 = input.nextLine(); // read number from user
			
		    System.out.print("Enter the String 2 ");
			String str2 = input.nextLine(); // read number from user
			
		     boolean checkString1= str1.equals(str2);
			 
			
			
			if(checkString1 == compareString(str1, str2)){
			   System.out.print("The Strings are equal ");
			}
			 
			 else{
			   System.out.print("The Strings are  not equal ");
			}
			

        input.close();
    }
}
