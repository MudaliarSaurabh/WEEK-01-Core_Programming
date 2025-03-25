//Create a program to find the maximum number of handshakes among N number of students.
//Hint =>
//Get integer input for number of students
//Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
//Write a method to use the combination formulae to calculate the number of handshakes






import java.util.Scanner;
public class Handshakes {
    public int fact(int n){
        int total = (n*(n-1))/2;
        return total;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = scanner.nextInt();
        Handshakes h = new Handshakes();
        int factorial = h.fact(n);
        System.out.println("The number of possible hanshakes with " + n + " students are " + factorial);

    }


}