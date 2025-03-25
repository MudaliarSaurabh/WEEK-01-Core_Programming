import java.util.Scanner;

class CountDown{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		
		for(int counter = num; counter>=1; counter--){
			System.out.println(counter);
		}
	}
}