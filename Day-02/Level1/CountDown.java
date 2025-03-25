import java.util.Scanner;

class CountDown{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int counter = num;
		
		
		while(counter>=1) {
			System.out.println(counter);
			counter= counter - 1;
		}
	}
}