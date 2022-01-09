/**
 * This program calculates the average of the grades
 * of a studend
 * 
 * @author UluLGM
 */

import java.util.Scanner;

public class GPA {
    public static void main(String[] args) {
        //Variables
        int math, phys, chem, turk, hist, music;
        double gpa;
        Scanner sc = new Scanner(System.in);

        //Program
        System.out.print("Please enter Math grade: ");
        math = sc.nextInt();

        System.out.print("Please enter Physics grade: ");
        phys = sc.nextInt();

        System.out.print("Please enter Chemistry grade: ");
        chem = sc.nextInt();

        System.out.print("Please enter Turkish grade: ");
        turk = sc.nextInt();

        System.out.print("Please enter History grade: ");
        hist = sc.nextInt();

        System.out.print("Please enter Music grade: ");
        music = sc.nextInt();

        sc.close();

        gpa = ( math + phys + chem + turk + hist + music ) / 6.0;

        System.out.println( (gpa > 60) ? "Passed" + gpa : "Not Passed" + gpa );

    }
}
