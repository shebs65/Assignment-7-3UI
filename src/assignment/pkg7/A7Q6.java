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
public class A7Q6 {

    public static void lastDigit(int num) {
        //divide by 10 to seperate last digit, then output it
        int digit = 0;
        digit = num % 10;
        System.out.println(digit);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner for user input
        Scanner input = new Scanner(System.in);

        //ask user to input number, then scan it in and make sure it's positive
        System.out.println("Enter a number:");
        int num = Math.abs(input.nextInt());

        // output last digit
        System.out.println("The last digit is:");
        lastDigit(num);
    }
}
