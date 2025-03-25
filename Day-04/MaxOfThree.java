//Write a program to find the smallest and the largest of the 3 numbers.
//        Hint =>
//Take user input for 3 numbers
//Write a single method to find the smallest and largest of the three numbers
//public static int[] findSmallestAndLargest(int number1, int number2, int number3)
//


import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class MaxOfThree {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int smallest = Math.min(number1 ,Math.min( number2, number3));
        int largest = Math.max(number1 ,Math.min( number2, number3));

        return new int[]{smallest,largest};
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        MaxOfThree max = new MaxOfThree();

        //using an array to store the array return type
        int[] res = findSmallestAndLargest(num1, num2,num3);

        System.out.println(Arrays.toString(res));

    }

}
