//Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct.
//        Hint =>
//Take the user input number and check whether it's a Natural number, if not exit
//Write a Method to find the sum of n natural numbers using recursion
//Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2
//Compare the two results and print the result
import java.util.Scanner;

public class NaturalNumSum {
    public static int NaturalSum(int n){
        if(n == 0){
            return 1;
        }
        return n + NaturalSum(n-1);

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sum = NaturalSum(num);
            System.out.println("Sum of first " + num + " natural numbers: " + sum);
        }

        scanner.close();

    }
}
