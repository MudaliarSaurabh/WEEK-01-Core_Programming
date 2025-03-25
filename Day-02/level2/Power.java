import java.util.Scanner;

class Power{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		System.out.println("Enter the power of the number : ");
		int power = scanner.nextInt();
		int counter = 1;
		
		for(int i=1;i<=power;i++){
			counter*=num;
		}
		System.out.println("the value of num times the power is " + counter);
		
	}
}