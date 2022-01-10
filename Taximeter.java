/**
 * This is a simple taximeter
 * 
 * @author UluLGM
 */

import java.util.Scanner;


public class Taximeter {
    public static void main(String[] args) {
        //Constants
        final double OPENING_WAGE = 10.0;
        final double MINIMUM_WAGE = 20.0;
        final double WAGE_PER_KM = 2.20;

        //Variables
        int km;
        double wage = OPENING_WAGE;
        Scanner sc = new Scanner(System.in);

        //Program
        System.out.print("Enter the km: ");
        km = sc.nextInt();

        sc.close();

        wage = km * WAGE_PER_KM + wage;

        System.out.printf("Price is %.2f tl\n" , ( wage <= MINIMUM_WAGE) ? 20 : wage);

    }
}
