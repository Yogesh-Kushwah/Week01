import java.util.Scanner;

public class UpperCaseCoverter{

public static String convertToUppercase(String input){

   StringBuilder sb= new StringBuilder();
   
     for(int i=0;i<input.length();i++){
	 
	 char ch= input.charAt(i);
	 if(ch>= 'a' && ch<='z'){
	  sb.append((char)(ch-32));
	 }
	 else{
	 sb.append(ch);
	 }
	 }
       return sb.toString();
}

public static boolean compare(String str1,String str2){

    if(str1.length()!= str2.length()){
	    return false;
	}
	
	for(int i=0;i<str1.length();i++){
	if(str1.charAt(i) != str2.charAt(i)){
	return false;
	}

   
}
 return true;
}
  public static void main(String[] args){

Scanner input =new Scanner(System.in);

String str =input.nextLine();

String str1= convertToUppercase( str);
String str2= str.toUpperCase();

boolean isEquals= compare( str1, str2);

if(isEquals){
  System.out.println(" Both are Equal "+ str1 + " , "+str2);
}
else{
  System.out.println(" Both are not  Equal "+ str1 + " , "+str2);
}


}
}