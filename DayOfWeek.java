package JUnitTesting;

import jdk.jshell.execution.Util;

import java.util.Scanner;

public class DayOfWeek {
    static int dayOfWeek; //Declaring and initializing variables

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Use scanner to read values
        System.out.println("Enter Day,Month & Year");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        getDay(day, month, year); //Call method to get day of the week
        checkDay();
    }

    private static void getDay(int day, int month, int year) {

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        dayOfWeek = (day + x + (31 * m0) / 12) % 7;
        System.out.println("Day of the week = " + dayOfWeek);
    }

    private static void checkDay() {

        switch (dayOfWeek) { // use switch case to check day
            case 0:
                System.out.println("Day of the week is Sunday");
                break;
            case 1:
                System.out.println("Day of the week is Monday");
                break;
            case 2:
                System.out.println("Day of the week is Tuesday");
                break;
            case 3:
                System.out.println("Day of the week is Wednesday");
                break;
            case 4:
                System.out.println("Day of the week is Thursday");
                break;
            case 5:
                System.out.println("Day of the week is Saturday");
        }
    }
}