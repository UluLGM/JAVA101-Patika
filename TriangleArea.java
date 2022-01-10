/**
 * This program calculates the are of
 * triangle
 * 
 * @author UluLGM
 */

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        //Variables
        int a , b , c;
        double area;
        Scanner sc = new Scanner(System.in);

        //Program
        System.out.print("Enter the first side: ");
        a = sc.nextInt();

        System.out.print("Enter the second side: ");
        b = sc.nextInt();

        System.out.print("Enter the third side: ");
        c = sc.nextInt();

        sc.close();

        double u = (a+b+c)/2.0;
        area = u * (u-a) * (u-b) * (u-c);

        System.out.println("Area of triangle is: " + area);
    }
}
