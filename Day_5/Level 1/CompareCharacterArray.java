import java.util.*;

	
public class CompareCharacterArray{

	//method to find sub stirng using charAt;
	public static char[] stringToChar(String str){
		
	   char[] charArray =new char[str.length()];
		for(int i=0; i<str.length(); i++){
			charArray[i] = str.charAt(i);
		}
		return charArray;
	}
	
	
	// method to find sub string using bluid in substring method
	public static char[] builtInCharArray(String str){
			return str.toCharArray();
	}


	//method to compare two String
	public static boolean compareTwoCharArray( char[] charArray1,char[] charArray2){
	     
		 return Arrays.equals(charArray1,charArray2);
		
		}
	
	
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		
		//taking the string as input;
		System.out.print("Enter String : ");
		String str = input.next();
		
		
	
		

		char[] charArray1 = stringToChar(str);
		char[] charArray2 = builtInCharArray(str);
		
		
	
		if(compareTwoCharArray( charArray1,  charArray2)){
			System.out.println("Both Character Arrays are same ");
		}else{
			System.out.println("Both character Arrays are not same " );
		}
	
		input.close();
	}
}
