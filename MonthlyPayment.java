package JUnitTesting;

import java.util.Scanner;

public class MonthlyPayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Use Scanner to read values
        System.out.println("Enter Principle amount, Rate of interest and Year");
        int principleAmount = sc.nextInt();
        int rateOfInterest = sc.nextInt();
        int year = sc.nextInt();
        System.out.println("Monthly payment = " +getPayment(principleAmount, rateOfInterest, year));
    }

    private static double getPayment(int principleAmount, int rateOfInterest, int year) {
        double rate = (double)(Math.floorDiv(rateOfInterest, (12 * 100)));
        double noOfYear = 12 * year;
        double payment = (double)((principleAmount * rate) / 1 - Math.pow((1 + rate), (-noOfYear)));
        return (payment);
    }
}