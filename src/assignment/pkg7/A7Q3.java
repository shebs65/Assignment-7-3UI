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
public class A7Q3 {

    public static void factors(int num) {
        // find and output factors of inputted int
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");

            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner for user input
        Scanner input = new Scanner(System.in);

        // ask for and scan in a number
        System.out.println("Enter a number:");
        int num = input.nextInt();

        // calculate factors of number using method factors
        factors(num);



    }
}
