public class UniversityFee{

public static void main(String[] args){

int studentFee= 1_25_000;
int discoutPercentage = 10;   //discout is in the percentage

int discountedAmount = (discoutPercentage*studentFee)/100;  //discount that student will receive
int feeToPay = studentFee-discountedAmount;  //  finding the fee how much student has to pay after the discount


System.out.println("The discount amount is INR "+ discountedAmount +" and final discounted fee is INR "+ feeToPay
);
}
}