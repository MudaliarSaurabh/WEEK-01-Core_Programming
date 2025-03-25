import java.util.Scanner;

class Fact{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number<0){
			System.out.println("Enter a positive number!");
		
		}
		int counter = number;
		int fact = 1;
		while(counter>=1){
			fact*=counter;
			counter--;
		}
		System.out.println(fact);
		
	
	}
}