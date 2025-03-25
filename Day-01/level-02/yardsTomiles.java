import java.util.Scanner;
class YardsAndMiles{
	public static void main(String[] args){
	float feet;
	Scanner scanner = new Scanner(System.in);
	feet = scanner.nextFloat();
	float feetToyards = feet/3;
	float yardsTomiles = feetToyards / 1760;
	System.out.println("The distance in yards is " + feetToyards + " while the distance in miles is " + yardsTomiles);
	}
}
