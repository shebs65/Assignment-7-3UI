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
public class A7Q8 {

    public static String season(int month, int day) {

        // depending on month and day, output respective season
        if (month == 12 && day >= 16 || month <= 2 || month == 3 && day <= 15) {
            String season1 = "Winter";
            return season1;
            //System.out.println("It is Winter.");
        }
        if (month == 3 && day >= 16 || month <= 5 || month == 6 && day <= 15) {
            String season2 = "Spring";
            return season2;
            // System.out.println("It is Spring.");
        }
        if (month == 6 && day >= 16 || month <= 9 || month == 9 && day <= 15) {
            String season3 = "Summer";
            return season3;
            //System.out.println("It is Summer.");
        }
        if (month == 9 && day >= 16 || month <= 11 || month == 12 && day <= 15) {
            String season4 = "Fall";
            return season4;
            //System.out.println("It is Fall.");
        }
        return "";
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner for user input
        Scanner input = new Scanner(System.in);

        // ask and scan in month
        System.out.println("Enter the month in number form:");
        int month = input.nextInt();

        // ask and scan in day
        System.out.println("Enter the day in number form:");
        int day = input.nextInt();

        // run method seasonOutput with month and day, output season
        String seasonOutput = season(month, day);
        System.out.println(seasonOutput);

    }
}
