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
public class A7Q9 {

    public static boolean allDigitsOdd(int num) {

        // if there is a digit left, check if it's even. If it is, return false
        while (num > 0) {
            int num2 = num % 10;
            if (num2 % 2 == 0) {
                return false;
            }
            num = num / 10;

            // if no digit is even, return true
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // new Scanner for user input
        Scanner input = new Scanner(System.in);

        // ask for and scan in a number
        System.out.println("Enter a number:");
        int num = input.nextInt();

        // depending on output from method allDigitsOdd, output respective string
        boolean output = allDigitsOdd(num);
        if (output == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
