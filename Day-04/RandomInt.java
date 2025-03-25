//Write a program that generates five 4 digit random values and then finds their average value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().
//Hint =>
//Write a method that generates array of 4 digit random numbers given the size as a parameter as shown in the method signature
//public int[] generate4DigitRandomArray(int size)
//Write a method to find average, min and max value of an array
//public double[] findAverageMinMax(int[] numbers)

import java.util.Random;
import java.lang.Math;
import java.util.Scanner;
public class RandomInt {

    public static int[] Rand(){
        int [] arr = new int[5];
        Random rand = new Random();
        for(int i = 0; i<5; i++){
            arr[i] = rand.nextInt(9000) + 1000;
        }

        return arr;
    }

    public static double avg(int[] arr){
        double sum = 0;

        for (int num : arr){
            sum+=num;

        }
        return sum / arr.length;

    }

    public static int[] MinMax(int[] arr){

        int min= arr[0];
        int max = arr[0];

        for(int i = 0; i< arr.length; i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);

        }
        return new int[]{min,max};

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] RandomNumber = Rand();

        for(int Random: RandomNumber){
            System.out.println(Random);

        }
        double average = avg(RandomNumber);
        int[] miniMax = MinMax(RandomNumber);

        System.out.println("Average: " + average);
        System.out.println("Minimum: " + miniMax[0]);
        System.out.println("Maximum: " + miniMax[1]);

    }
}
