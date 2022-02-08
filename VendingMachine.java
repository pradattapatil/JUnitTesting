package JUnitTesting;

import java.util.Scanner;

public class VendingMachine {
    static int I, TOTAL;

    static int[] NOTES = { 1 , 2 , 5 , 10 , 50 , 100 , 500 , 1000 };

    static void notes(int value)
    {
        if (value / NOTES[I] != 0)
        {
            TOTAL += (value / NOTES[I]);
            System.out.println(NOTES[I] + "rs notes :" + value / NOTES[I]);
            value = value % NOTES[I];
        }
        I++;
        if (value == 0)
        {
            System.out.println("total notes :" + TOTAL);
            return;
        }

        notes(value);

    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter amoumt");
        int value = s.nextInt();
        notes(value);
        s.close();
    }

}
