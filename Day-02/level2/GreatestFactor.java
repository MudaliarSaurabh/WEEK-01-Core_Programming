import java.util.Scanner;

class GreatestFactor{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int GreatestFactor = 1;
		int counter = number - 1;
		
		while (counter!=1){
			if (number%counter == 0){
				GreatestFactor = counter;
				break;
				
			}
			counter--;
			
		}
		System.out.println(GreatestFactor);
		
	}	
}