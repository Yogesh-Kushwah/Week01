import java.util.Scanner;

public class UniversityFees{

public static void main(String[] args){

Scanner input= new Scanner(System.in);

System.out.println("Enter the Student fees in INR");
int studentFee= input.nextInt();
System.out.println("Enter the Discount offerd by the college in %");

int discoutPercentage = input.nextInt();  //discout is in the percentage

int discountedAmount = (discoutPercentage*studentFee)/100;  //discount that student will receive
int feeToPay = studentFee-discountedAmount;  //  finding the fee how much student has to pay ,after the discount


System.out.println("The discount amount is INR "+ discountedAmount +" and final discounted fee is INR "+ feeToPay
);
}
}