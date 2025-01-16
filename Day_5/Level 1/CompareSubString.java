import java.util.Scanner;

	
public class CompareSubString{

	//method to find sub stirng using charAt;
	public String subStringCharAt(String str, int start, int end){
		String subStr= "";
		for(int i=start; i<end; i++){
			subStr = subStr+ str.charAt(i);
		}
		return subStr;
	}
	
	// method to find sub string using bluid in substring method
	public String subString(String str, int start, int end){
		
		String subStr = str.substring(start,end);
		
		return subStr;
	}


	//method to compare two String
	public boolean compareTwoString(String str1, String str2){
	
		//check if both string length are not same 
		if(str1.length() != str2.length()){
			return false;
		}
	
		for(int i=0; i<str1.length(); i++){
			if(str1.charAt(i) != str2.charAt(i)){
			return false;
		}
		
	}
	 return true;
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		CompareSubString obj = new CompareSubString();
		
		//taking the string as input;
		System.out.print("Enter String : ");
		String str1 = input.next();
		
		//taking start and end from user as input
		System.out.print("Enter start of the sub String: ");
		int start = input.nextInt();
		System.out.print("Enter end of the sub String: ");
		int end = input.nextInt();
		
	
		

		String subString1 = obj.subStringCharAt(str1 , start, end);
		String subString2 = obj.subString(str1 , start, end);
		
		boolean result = obj.compareTwoString(subString1, subString2);
		
		
		if(result){
			System.out.println("Both String are same "+ subString1 +  "  " + subString2 );
		}else{
			System.out.println("Both String are not same "+ subString1 +  "  " + subString2 );
		}
	
		input.close();
	}
}
