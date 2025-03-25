import java.util.Scanner;

class studentFee{
	public static void main(String[] args){
	double studentFee;
	double offerDiscount;
	System.out.println("Enter the fee amount: ");
	Scanner input = new Scanner(System.in);
	studentFee = input.nextInt();
	System.out.println("Enter the discount percentge");
	Scanner input1 = new Scanner(System.in);
	offerDiscount = input1.nextInt();
	double discountedSum = studentFee * offerDiscount/100;
	double finalFee = studentFee -discountedSum;
	System.out.println("The discount amount is INR " + discountedSum + " and the final discounted fee is INR " + finalFee );
	}
}
