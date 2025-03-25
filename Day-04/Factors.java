//Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results
//Hint =>
//Take the input for a number
//Write a static Method to find the factors of the number and save them in an array and return the array.
//To find factors and save to array will have two loops. The first loop to find the count and initialize the array with the count. And the second loop save the factors into the array
//Write a method to find the sum of the factors using factors array
//Write a method to find the product of the factors using factors array
//Write a method to find the sum of square of the factors using Math.pow() method


import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Factors {
    public static int[] multiples(int n){
        int count = 0;
        for (int i=1 ; i<=n ; i++){
            if(n%i==0){
                count++;

            }

        }
        int [] factors = new int[count];
        int index =0;
        for(int i =1;i<=n ;i++){
            if(n%i==0) {
                factors[index++] += i;
            }
        }
        return factors;
    }
    //method for finding sum of factors
    public static int sum(int[] factors){
        int sum = 0;
        for(int factor : factors){
            sum+=factor;
        }
        return sum;

    }

    public static long product(int[] factors){

        long prod = 1;
        for(int factor : factors){
            prod = prod * factor;
        }
        return prod;
    }
    //method for finding sum of square
    public static int sos(int[] factors){

        int sos = 0;
        for(int factor : factors){
            sos += factor*factor;

        }
        return sos;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();



        int [] factors  = multiples(num);

        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        int sum = sum(factors);
        long product = product(factors);
        int sumSquares = sos(factors);

        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumSquares);

        scanner.close();


    }
}
