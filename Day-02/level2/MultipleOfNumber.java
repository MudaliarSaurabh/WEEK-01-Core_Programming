import java.util.Scanner;

class MultipleOfNumber{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if (num>0 && num<100){
			for (int i=100; i>=1; i--){
				if(i%num==0){
					System.out.println(i);
				}
			}
		}
			
		
	}
}