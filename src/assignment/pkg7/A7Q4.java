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
public class A7Q4 {

    public static double compoundInterest(double balance, double rate, int years) {
        // calculate compound interest with given rate, balance and time
        double interestRate = 1 + rate;
        double step2 = balance * interestRate;
        double finalStep = Math.pow(step2, years);

        // output final balance
        System.out.println(finalStep);

        return finalStep;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner for user input
        Scanner input = new Scanner(System.in);

        // ask for and scan in balance, interest rate, and time
        System.out.println("Please enter your balance, interest rate, and number of years the money will be in your account:");
        double balance = input.nextDouble();
        double rate = input.nextDouble();
        int years = input.nextInt();

        // use method compoundInterest
        compoundInterest(balance, rate, years);

    }
}
