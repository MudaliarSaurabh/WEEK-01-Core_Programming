import java.util.Scanner;

class Factorial{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num>0){
			int i = 1;
			int fact = 1;
			while(i<=num){
				fact*=i;
				i++;
			}
			System.out.println(fact);
		}else{
			System.out.println("Enter a positive number");
		}
	
	}
}