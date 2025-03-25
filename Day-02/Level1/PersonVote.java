import java.util.Scanner;

class PersonVote{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		if(age>=18){
			System.out.println("The person's age is " + age + " and can vote.");
			return;
		}
		System.out.println("The person's age is " + age + " and cannot vote.");
	}
}