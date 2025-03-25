import java.util.Scanner;

public class StringCompare {
    // Method to convert a string to a char array manually
    public static char[] charInString(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) { // Correct char comparison
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Converting using custom method
        char[] manualCharArray = charInString(input);
        // Converting using built-in toCharArray() method
        char[] builtInCharArray = input.toCharArray();

        // Comparing both arrays
        boolean isEqual = compareCharArrays(manualCharArray, builtInCharArray);

        // Displaying results
        System.out.println("Manual char array: " + new String(manualCharArray));
        System.out.println("Built-in char array: " + new String(builtInCharArray));
        System.out.println("Are both char arrays equal? " + isEqual);

        scanner.close();
    }
}
