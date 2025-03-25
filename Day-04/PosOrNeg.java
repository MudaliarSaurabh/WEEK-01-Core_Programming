//Write a program to check whether a number is positive, negative, or zero.
//Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero

import java.util.Scanner;
public class PosOrNeg {
    public int positiveornegative(int n){
        if (n>0) {
            return 1;
        }else if(n==0){
            return 0;

        }else{
            return -1;
        }

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        PosOrNeg PoN = new PosOrNeg();

        int result = PoN.positiveornegative(n);

        if (result == 1){
            System.out.println("Positive");

        }else if(result == 0){
            System.out.println("Zero");
        }else{
            System.out.println("Negative");
        }


    }
}
