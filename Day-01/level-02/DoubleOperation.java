import java.util.Scanner;
class DoubleOperation{
	public static void main(String[] args){
	Double a,b,c;
	Scanner scanner  = new Scanner(System.in);
	a = scanner.nextDouble();
	b = scanner.nextDouble();
	c = scanner.nextDouble();
	
	System.out.println("The results of Int Operations are " + (a + b *c) + "," +  (a * b + c) + "," + (c + a / b) + "," + (a % b + c));
	}
}