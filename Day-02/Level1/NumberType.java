import java.util.Scanner;

class NumberType{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num<0){
			System.out.println("Negative");
		}else if(num==0){
			System.out.println("Zero");
		}else if(num>0){
			System.out.println("Positive");
		}
	}
}