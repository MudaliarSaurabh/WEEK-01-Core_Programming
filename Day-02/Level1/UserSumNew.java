import java.util.Scanner;

class UserSum{
	public static void main(String[] args){
		int sum = 0;
		while(true){
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			if (num == 0 || num < 0){
				break;
			}
			sum+=num;
			
		}
		System.out.println(sum);
		
	}
}