// 1. Number Guessing Game
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        String feedback = "";
        System.out.println("Think of a number between 1 and 100");
        while (!feedback.equalsIgnoreCase("correct")) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (Enter: high / low / correct)");
            feedback = sc.next();
            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            }
        }
        System.out.println("Yay! Guessed correctly.");
    }

    public static int generateGuess(int low, int high) {
        return (low + high) / 2;
    }
}

// 2. Maximum of Three Numbers
class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Maximum: " + findMax(a, b, c));
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}

// 3. Prime Number Checker
class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num + (isPrime(num) ? " is Prime." : " is not Prime."));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

// 4. Fibonacci Sequence Generator
class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generateFibonacci(n);
    }

    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = b;
            b = a + b;
            a = temp;
        }
    }
}

// 5. Palindrome Checker
class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str) ? "Palindrome" : "Not a Palindrome");
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
}

// 6. Factorial Using Recursion
class FactorialRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial: " + factorial(n));
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}

// 7. GCD and LCM Calculator
class GCDLCMCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = findGCD(a, b);
        int lcm = (a * b) / gcd;
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

// 8. Temperature Converter
class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter C to F or F to C:");
        String choice = sc.next();
        System.out.println("Enter Temperature:");
        double temp = sc.nextDouble();
        if (choice.equalsIgnoreCase("C"))
            System.out.println("Fahrenheit: " + cToF(temp));
        else
            System.out.println("Celsius: " + fToC(temp));
    }

    public static double cToF(double c) {
        return (c * 9/5) + 32;
    }

    public static double fToC(double f) {
        return (f - 32) * 5/9;
    }
}

// 9. Basic Calculator
class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Enter operation (+, -, *, /):");
        char op = sc.next().charAt(0);

        switch(op) {
            case '+': System.out.println(add(a, b)); break;
            case '-': System.out.println(sub(a, b)); break;
            case '*': System.out.println(mul(a, b)); break;
            case '/': System.out.println(div(a, b)); break;
            default: System.out.println("Invalid operator");
        }
    }

    public static double add(double a, double b) { return a + b; }
    public static double sub(double a, double b) { return a - b; }
    public static double mul(double a, double b) { return a * b; }
    public static double div(double a, double b) { return b != 0 ? a / b : 0; }
}



