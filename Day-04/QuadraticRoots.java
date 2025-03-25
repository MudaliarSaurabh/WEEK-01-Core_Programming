//Write a program Quadratic to find the roots of the equation ax2+ bx + c. Use Math functions Math.pow() and Math.sqrt()
//Hint =>
//        Take a, b, and c as input values to find the roots of x.
//The roots are computed using the following formulae
//delta = b2+ 4*a*c
//If delta is positive the find the two roots using formulae
//root1 of x = (-b + delta)/(2*a)
//root1 of x = (-b - delta)/(2*a)
//If delta is zero then there is only one root of x
//root of x = -b/(2*a)
//If delta is negative return empty array or nothing
//Write a Method to find find the roots of a quadratic equation and return the roots

import java.util.Scanner;
import java.lang.Math;
public class QuadraticRoots {
    public static double[] Quad(int a , int b, int c){
        double delta =  (Math.pow(b,2) + 4*a*c);
        double[] x = new double[2];
        if (delta > 0){
            x[0]  =  (-b + Math.sqrt(delta))/(2*a);
            x[1]  = (-b - Math.sqrt(delta))/(2*a);

        }else if(delta == 0){
            x[0] = -b/(2*a);

        }else if(delta<0){
            x= new double[0];

        }
        return x;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double[] roots = QuadraticRoots.Quad(a,b,c);

        if (roots.length ==0){
            System.out.println("No real roots");
        }else{
            System.out.println("The roots are");
            for(double root : roots){
                System.out.println(root + " ");
            }
            System.out.println(" ");
        }

    }
}
