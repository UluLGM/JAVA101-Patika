/**
 * This program calculates the KDV amount of
 * given amount of money
 * 
 * @author UluLGM
 */

import java.util.Scanner;


public class KDVCalculator {
    public static void main(String[] args) {
        //Constants
        final double KDV_0_1000 = 0.18;
        final double KDV_OVER_1000 = 0.08;

        //Variables
        double amount , KDVamount;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        amount = sc.nextDouble();

        sc.close();

        KDVamount = ( amount <= 1000 ) ? amount + amount * KDV_0_1000 : amount + amount * KDV_OVER_1000;

        System.out.printf("%1$-25s%4$-1.2f\n%2$-25s%5$-1.2f\n%3$-25s%6$-1.2f\n"
            ,"Amount without KDV:","Amount with KDV:","KDV amount:",amount,KDVamount,KDVamount-amount);
    }
}
