package JUnitTesting;

import java.util.Scanner;

public class TemperatureConversion {
      //Declaring and initializing variables
        static double celsius;
        static double fahrenheit;

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in); //Use scanner to read values
            System.out.println("Enter temperature in fahrenheit");
            double temp = sc.nextInt();
            conversion(temp); //Call method to convert temperature
        }

        private static void conversion(double temp) {

            celsius = (double) (temp - 32) * 5 / 9;
            fahrenheit = (double) (celsius * 1.6) + 32;
            System.out.println("Temperature in Celsius = " + celsius);
            System.out.println("Temperature in Fahrenheit = " + fahrenheit);
        }
}
