class studentFee{
	public static void main(String[] args){
	double studentFee = 125000;
	double offerDiscount = 10;
	double discountedSum = studentFee * offerDiscount/100;
	double finalFee = studentFee -discountedSum;
	System.out.println("The discount amount is INR " + discountedSum + " and the final discounted fee is INR " + finalFee );
	}
}
