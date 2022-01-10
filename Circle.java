/**
 * This program calculates the area and
 * circumference of circle
 * 
 * @author UluLGM
 */

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        //Constants
        final double PI = 3.14;

        //Variables
        double radius , alpha , area;
        Scanner sc = new Scanner(System.in);

        //Program
        System.out.printf("Please enter the radius: ");
        radius = sc.nextDouble();

        System.out.printf("Please enter the alpha: ");
        alpha = sc.nextDouble();

        sc.close();

        while( alpha > 2*PI ){
            alpha = alpha - 2*PI;
        }

        area = radius * radius * ( alpha / 2.0 );

        System.out.println("The area is: " + area);

    }
    
}
