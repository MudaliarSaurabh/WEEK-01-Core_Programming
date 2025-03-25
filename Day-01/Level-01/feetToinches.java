import java.util.Scanner

class feetToinch{
	public static void main(Strings[] args){
	double height;
	System.out.println("Enter your height in cms: ");
	Scanner input = new Scanner(System.in);
	height = input.nextInt();
	double inches =  height / 2.54;
	double feet = inches /12;
	System.out.println("Your Height in cm is " + height + " while in feet is " + feet + " and inches is " + inches );
	}
}