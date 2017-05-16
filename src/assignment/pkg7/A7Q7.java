/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg7;

import static assignment.pkg7.A7Q6.lastDigit;
import java.util.Scanner;

/**
 *
 * @author shebm3906
 */
public class A7Q7 {

    public static void firstDigit(int digit) {

        // continue dividing number by 10 until only 1 digit is remaining. Output the digit
        while (digit >= 10) {
            digit = digit / 10;
        }
        System.out.println(digit);
    }

    /**
     * }
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // new scanner for user input
        Scanner input = new Scanner(System.in);

        // ask and scan in a number, make sure it's positive
        System.out.println("Enter a number:");
        int digit = Math.abs(input.nextInt());

        // output first digit
        System.out.println("The first digit is:");
        firstDigit(digit);
    }
}
