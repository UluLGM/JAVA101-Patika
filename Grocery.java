/**
 * This is a simple grocery app
 * 
 * @author UluLGM
 */

import java.util.Scanner;

public class Grocery{
    public static void main(String[] args) {
        //Constants
        final double PEAR = 2.14d;
        final double APPLE = 3.67d;
        final double TOMATO = 1.11d;
        final double BANANA = 0.95d;
        final double EGGPLANT = 5.00d;

        //Variables
        double price = 0.0d;
        Scanner sc = new Scanner(System.in);

        //Program
        System.out.print("How many kilograms of Pear?: ");
        price = price + PEAR * sc.nextInt();

        System.out.print("How many kilograms of Apple?: ");
        price = price + APPLE * sc.nextInt();

        System.out.print("How many kilograms of Tomato?: ");
        price = price + TOMATO * sc.nextInt();

        System.out.print("How many kilograms of Banana?: ");
        price = price + BANANA * sc.nextInt();

        System.out.print("How many kilograms of Eggplant?: ");
        price = price + EGGPLANT * sc.nextInt();

        sc.close();

        System.out.println("The price you need to pay is " + price + "tl." );

    }
}