import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input data
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + friends[i] + ":");
            System.out.print("Age: ");
            ages[i] = scanner.nextInt();
            System.out.print("Height (in cm): ");
            heights[i] = scanner.nextDouble();
        }

        // Find youngest
        int youngestAge = ages[0];
        String youngest = friends[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngest = friends[i];
            }
        }

        // Find tallest
        double tallestHeight = heights[0];
        String tallest = friends[0