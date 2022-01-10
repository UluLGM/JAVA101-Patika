/**
 * 
 * This program calculates a person's BMI.
 * 
 * @author UluLGM
 */

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        //Variables
        double weight;
        double height;
        double bmi;

        //Program
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter your weight in kilograms: " );
        weight = sc.nextDouble();
        System.out.print( "Enter your height in meters: " );
        height = sc.nextDouble();

        bmi = weight / Math.pow(height, 2);

        if( bmi < 18.5 ){
            System.out.printf("Your BMI is %.2f and you are in the category of underweight." , bmi );
        }
        else if ( bmi < 25 ){
            System.out.printf("Your BMI is %.2f and you are in the category of healthy." , bmi );
        }
        else if ( bmi < 30 ){
            System.out.printf("Your BMI is %.2f and you are in the category of overweight." , bmi );
        }
        else {
            // BMI >= 30
            System.out.printf("Your BMI is %.2f and you are in the category of obese." , bmi );
        }

        sc.close();

    }
}
