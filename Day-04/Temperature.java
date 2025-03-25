//Write a program calculate the wind chill temperature given the temperature and wind speed
//Hint =>
//Write a method to calculate the wind chill temperature using the formula
//windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed0.16
//public double calculateWindChill(double temperature, double windSpeed)




import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.pow;

public class Temperature {
    public double calculateWindChill(double temperature, double windspeed){
        double power = Math.pow(windspeed,0.16);
        double windchill = 35.74 + 0.6215 * temperature + (0.4275*temperature - 35.75) * power;
        return windchill;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double temperature = scanner.nextDouble();
        double windspeed = scanner.nextDouble();

        Temperature cwc = new Temperature();
        double result = cwc.calculateWindChill(temperature,windspeed);
        System.out.println(result);
    }
}
