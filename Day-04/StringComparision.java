import java.util.Scanner;

public class StringComparision {
    // Method to compare strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // If lengths are different, they are not equal
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // If any character mismatches, return false
            }
        }
        return true; // If no mismatches, return true
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for two strings
        System.out.print("Enter first string: ");
        String str1 = scanner.next();

        System.out.print("Enter second string: ");
        String str2 = scanner.next();

        // Comparing using charAt() method
        boolean resultCharAt = compareUsingCharAt(str1, str2);

        // Comparing using built-in equals() method
        boolean resultEquals = str1.equals(str2);

        // Displaying results
        System.out.println("Comparison using charAt(): " + resultCharAt);
        System.out.println("Comparison using equals(): " + resultEquals);

        // Verifying if both methods give the same result
        if (resultCharAt == resultEquals) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Methods give different results (should not happen).");
        }

        scanner.close(); // Closing scanner to prevent resource leaks
    }
}
