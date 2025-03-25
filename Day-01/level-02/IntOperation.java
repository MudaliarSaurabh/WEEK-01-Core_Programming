import java.util.Scanner;
class IntOperation{
	public static void main(String[] args){
	int a,b,c;
	Scanner scanner  = new Scanner(System.in);
	a = scanner.nextInt();
	b = scanner.nextInt();
	c = scanner.nextInt();
	
	System.out.println("The results of Int Operations are " + (a + b *c) + "," +  (a * b + c) + "," + (c + a / b) + "," + (a % b + c));
	}
}