import java.util.Scanner;
class BonusOfEmployee{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Salary amount:");
		
		float Salary = scanner.nextInt();
		
		System.out.println("Enter the total year:");
		int Year = scanner.nextInt();
		float bonus = 5;
		float bonusFromsal = Salary * 5/100;
		
		if(Year>5){
			System.out.println("The New Salary including the bonus is " + (Salary+bonusFromsal));
		}else{
			System.out.println("Your Salary remains the same.");
		}
		
	}
}
