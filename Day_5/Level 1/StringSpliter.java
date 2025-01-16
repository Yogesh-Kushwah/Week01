import java.util.*;
class StringSpliter{
       public static void main(String[] args){
		   
		   //Take input from user
              Scanner input = new Scanner(System.in);
			  System.out.println("Enter the sentence");
              String str = input.nextLine();
              
              int wordcount = 1; // Initialise the wordcount to count the words from the text
              for(int i=0;i<str.length();i++){
                   if(str.charAt(i)==' '){
                         wordcount++;
                    }
              }
              System.out.println("wordcount" + wordcount); //Print the wordcount
              int index = 0; 
              String[] strArray = new String[wordcount];
              int low = 0; //Initialize the variable low and high from the first character of the text
              int high = 0;
              for(int i = 0;i<str.length();i++){
                    
                    if(str.charAt(i) != ' '){
                         high++;
                        
                 //Stores teh word fron the text in the array        
                     }else{ 
                            strArray[index] = str.substring(low,high);
                            index++;
                            high = high +1;
                            low = high;
                     }
              }
              strArray[index] = str.substring(low,high); //again write this to get the last word of the input text
              System.out.println("The array is " + Arrays.toString(strArray));
			  
			  //Make the 2-D array to show the result
              String[][] star = new String[strArray.length][2];
              for(int i=0;i<strArray.length;i++){
                    star[i][0] = strArray[i];
                    star[i][1] = Integer.toString(strArray[i].length());
              }
			  //print the 2-D array
              System.out.println("array 2d is "+ Arrays.deepToString(star));
              for(int i=0;i<star.length;i++){
                 for(int j=0;j<star[0].length;j++){
            
                      System.out.print(star[i][j] + " ");
                   }
                  System.out.println();
                }
              
       }
}