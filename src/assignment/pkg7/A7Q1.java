/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg7;

import java.util.Scanner;

/**
 *
 * @author shebm3906
 */
public class A7Q1 {

    public static double circleArea(double radius) {
        // new double equal to radius squared
        double rSquared = Math.pow(radius, 2);
        
        // calculate area
        double area = Math.PI * rSquared;

        return area;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner for user input
        Scanner input = new Scanner(System.in);

        // get user to input radius
        System.out.println("What is the radius of the circle?");
        double radius = input.nextDouble();

        //calculate area using circleArea method
        double answer = circleArea(radius);

        // output area
        System.out.println("The area is " + answer + ".");



    }
}
