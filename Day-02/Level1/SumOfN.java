import java.util.Scanner;

class SumOfN{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num>=1){
			int sum = 0;
			for(int i=1; i<=num; i++){
				sum+=i;
			}
			
			int sum1 = num * (num + 1) / 2;
			if (sum1 == sum){
				System.out.println(sum);
			}
		
		}
	}
}
