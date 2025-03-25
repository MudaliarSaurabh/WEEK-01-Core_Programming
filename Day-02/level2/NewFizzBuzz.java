import java.util.Scanner;
class NewFizzBuzz{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		while (num>0){
			if(num%3==0 && num%5==0) {
				System.out.println("FizzBuzz");
			}
			else if(num%3==0) {
				System.out.println("Fizz");
			}
			else if(num%5==0) {
				System.out.println("Buzz");
			}
			break;
		}
			
	}
	
}

