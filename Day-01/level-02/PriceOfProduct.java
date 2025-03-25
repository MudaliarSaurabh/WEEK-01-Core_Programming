import java.util.Scanner;

class ProductPrice{
	public static void main(String[] args){
	int quantity,unitPrice;
	Scanner scanner = new Scanner(System.in);
	quantity  = scanner.nextInt();
	unitPrice = scanner.nextInt();
	float finalPrice = quantity * unitPrice;
	System.out.println("The total purchase price is INR " + finalPrice + "if the quantity " + quantity + " and unit price is INR" + unitPrice);
	}
}