import java.util.Scanner;

class Calc{
	public static void main(String[] args){
	int number1;
	int number2;
	Scanner scanner = new Scanner(System.in);
	number1 = scanner.nextInt();
	number2 = scanner.nextInt();
	double add  =  number1 + number2;
	double sub = number1 - number2;
	double mult = number1 * number2;
	double div = number1 / number2;
	System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + add + "," + sub + "," + mult + ", and" + div );
	}
}
