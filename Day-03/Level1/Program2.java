import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0)
                    System.out.println(num + " is positive even");
                else
                    System.out.println(num + " is positive odd");
            } else if (num < 0)
                System.out.println(num + " is negative");
            else
                System.out.println(num + " is zero");
        }
        if (numbers[0] == numbers[4])
            System.out.println("First and last are equal");
        else if (numbers[0] > numbers[4])
            System.out.println("First is greater than last");
        else
            System.out.println("First is less than last");
    }
}