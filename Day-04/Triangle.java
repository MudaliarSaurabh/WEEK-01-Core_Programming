//An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
//Hint =>
//Take user input for 3 sides of a triangle
//The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
//Write a Method to compute the number of rounds user needs to do to complete 5km run

import java.util.Scanner;
public class Triangle {
    public double triangle(double a , double b, double c){

        double perimeter = a + b + c;
        double total = 5000/perimeter;

        return total;


    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        //creating a object of an class
        Triangle t = new Triangle();
        double rounds = t.triangle(a,b,c);
        System.out.println(rounds);

    }

}
