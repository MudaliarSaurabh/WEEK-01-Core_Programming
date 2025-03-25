//Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
//Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false
import java.util.Scanner;
public class SpringSeason {
    public boolean weather(int month, int day) {
        if (month > 12 || month < 1 || day > 31 || day < 1) {
            return false;
        } else if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month and day: ");
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        SpringSeason ss = new SpringSeason();
        boolean val = ss.weather(month, day);
        System.out.println(val);

    }
}

