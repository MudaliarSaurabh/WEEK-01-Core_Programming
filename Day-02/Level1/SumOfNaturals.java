import java.util.Scanner;
class SumOfNarutals{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i<=num ;i++){
			sum+=i;
			
		}
		System.out.println("The sum of n natural numbers are: " + sum);
	}
}