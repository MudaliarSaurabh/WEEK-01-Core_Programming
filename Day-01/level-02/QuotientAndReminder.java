import java.util.Scanner;
class QuotientAndReminder{
	public static void main(String[] args){
	int num1, num2;
	Scanner scanner = new Scanner(System.in);
	num1 = scanner.nextInt();
	num2 = scanner.nextInt();
	float quotient = num1/num2;
	float reminder = num1%num2;
	System.out.println(" The Quotient is " + quotient + " and Reminder is " + reminder + "of two number " + num1 + " and " + num2 );
	}
}