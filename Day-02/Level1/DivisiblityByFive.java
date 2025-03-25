import java.util.Scanner;
class FizzBuzz{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num = scanner.nextInt();
	
	System.out.println(" Is the number " + num + " divisible by 5?" + (num%5==0));
	
	}
}
