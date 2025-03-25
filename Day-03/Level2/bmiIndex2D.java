import java.util.Scanner;

public class bmiIndex2D{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        // Create arrays to store height, weight, and BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Take input for weight and height, ensuring positive values
        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            
            do {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Weight must be positive. Please enter again.");
                }
            } while (personData[i][0] <= 0);
            
            do {
                System.out.print("Enter height (m): ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Height must be positive. Please enter again.");
                }
            } while (personData[i][1] <= 0);

            // Calculate BMI
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the details
       
        System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
		personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);


        scanner.close();
    }
}
