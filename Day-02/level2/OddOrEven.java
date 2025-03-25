import java.util.Scanner;
class oddOreven{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number between 1 to any :");
		int num = scanner.nextInt();
		if (num>1){
			for (int i = 1;i<=num;i++){
				if (i%2==0){
					System.out.println("The number " + i + " is even");
					
				}else{
					System.out.println("The number " + i + " is odd");
				}
			}
		}
	}
}