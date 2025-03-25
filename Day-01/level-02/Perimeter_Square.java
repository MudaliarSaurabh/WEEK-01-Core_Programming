import java.util.Scanner;

class perimeterOfsquare{
	public static void main(String[] args){
		int perimeter;
		Scanner scanner = new Scanner(System.in);
		perimeter = scanner.nextInt();
		float side = perimeter / 4;
		System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
	}
}