import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] employeeData = new double[10][2]; // [salary, yearsOfService]
        double[][] bonusData = new double[10][2]; // [bonus, newSalary]
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Input loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            while (salary <= 0) {
                System.out.println("Invalid salary. Please enter again:");
                salary = scanner.nextDouble();
            }
            
            System.out.print("Years of service: ");
            double years = scanner.nextDouble();
            while (years < 0) {
                System.out.println("Invalid years. Please enter again:");
                years = scanner.nextDouble();
            }
            
            employeeData[i][0] = salary;
            employeeData[i][1] = years;
        }

        // Calculation loop
        for (int i = 0; i < 10; i++) {
            double bonus;
            if (employeeData[i][1] > 5) {
                bonus = employeeData[i][0] * 0.05;
            } else {
                bonus = employeeData[i][0] * 0.02;
            }
            
            bonusData[i][0] = bonus;
            bonusData[i][1] = employeeData[i][0] + bonus;
            
            totalBonus += bonus;
            totalOldSalary += employeeData[i][0];
            totalNewSalary += bonusData[i][1];
        }

        // Output results
        System.out.println("\nResults:");
        System.out.printf("Total bonus payout: %.2f\n", totalBonus);
        System.out.printf("Total old salary: %.2f\n", totalOldSalary);
        System.out.printf("Total new salary: %.2f\n", totalNewSalary);
    }
}