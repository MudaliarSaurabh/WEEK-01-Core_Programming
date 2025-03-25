import java.util.Scanner;

public class NumberReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        int count = 0;
        long temp = number;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(number % 10);
            number /= 10;
        }
        
        System.out.print("Reversed number: ");
        for (int digit : digits) {
            System.out.print(digit);
        }
    }
}