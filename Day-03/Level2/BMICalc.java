import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = scanner.nextInt();
        
        double[][] personData = new double[number][3]; // [weight, height, BMI]
        String[] weightStatus = new String[number];
        
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");
            
            System.out.print("Weight (kg): ");
            double weight = scanner.nextDouble();
            while (weight <= 0) {
                System.out.println("Invalid weight. Please enter again:");
                weight = scanner.nextDouble();
            }
            
            System.out.print("Height (m): ");
            double height = scanner.nextDouble();
            while (height <= 0) {
                System.out.println("Invalid height. Please enter again:");
                height = scanner.nextDouble();
            }
            
            double bmi = weight / (height * height);
            String status;
            
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            
            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = bmi;
            weightStatus[i] = status;
        }
        
        System.out.println("\nResults:");
        for (int i = 0; i < number; i++) {
            System.out.printf("\nPerson %d:", i + 1);
            System.out.printf("\nWeight: %.2f kg", personData[i][0]);
            System.out.printf("\nHeight: %.2f m", personData[i][1]);
            System.out.printf("\nBMI: %.2f", personData[i][2]);
            System.out.println("\nStatus: " + weightStatus[i]);
        }
    }
}