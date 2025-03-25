//Write a program to take 2 numbers and print their quotient and reminder
//Hint =>
//Take user input as integer
//Use division operator (/) for quotient and moduli operator (%) for reminder
//Write Method to find the reminder and the quotient of a number
//public static int[] findRemainderAndQuotient(int number, int divisor)

import java.util.Scanner;
public class Divisor {
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int quotient = number / divisor;
        int remainder = number%divisor;

        return new int[]{quotient,remainder};
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = scanner.nextInt();
        System.out.println("Enter the divisor");
        int divisor = scanner.nextInt();

        Divisor nn = new Divisor();
        int [] arr = nn.findRemainderAndQuotient(num,divisor);

        System.out.println("The Quotient of the number "+ num + " when divided by "+ divisor + " is " + arr[0] + " and the remainder is " + arr[1]);
    }
}
