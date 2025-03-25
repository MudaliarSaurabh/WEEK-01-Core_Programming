import java.util.Scanner;
class SmallestOfThree{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		if (num1<num2){
			if(num1<num3){
				System.out.println(num1 + " is the smallest of the Three");
			}
		}else{
			System.out.println(num1 + " is not the smallest of the Three");
		}
	}
}