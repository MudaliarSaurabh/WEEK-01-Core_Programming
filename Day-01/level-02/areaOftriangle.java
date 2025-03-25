import java.util.Scanner;

class areaOftriangle{
	public static void main(String[] args){
	int base;
	int height;
	Scanner scanner = new Scanner(System.in);
	base = scanner.nextInt();
	height = scanner.nextInt();
	double area = 0.5 * base * height;
	double areaIninch = area/2.54;
	System.out.println("The Area of the triangle in sq in is " + areaIninch + " and in sq cm is " + area);
	}
}