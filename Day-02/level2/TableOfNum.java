import java.util.Scanner;
class TableOfNum{
	public static void main(String[] args){
		System.out.println("Enter Number Between 6 And 9");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		if (num>=6 && num<=9){
			for(int i = 1;i<=10; i++){
			System.out.println(num + " * " +  i + " = " + (num*i));
			}
			
		}else{
			System.out.println("Invalid Number");
		}
		
	}
}