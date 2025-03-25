import java.util.Scanner;
class SmallestOfThree{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		System.out.println("Is the first number the largest " + ((num1>num2 && num1>num3)?true:false));
		System.out.println("Is the second number the largest " + ((num2>num1 && num2>num3)?true:false));
		System.out.println("Is the third number the largest " + ((num3>num1 && num3>num2)?true:false));
	}
}