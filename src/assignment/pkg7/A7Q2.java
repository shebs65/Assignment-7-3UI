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
public class A7Q2 {

    public static char examGrade(int mark) {
        // depending on mark int, output respective grade letter
        if (mark <= 49) {
            System.out.println("F");
        }

        if (mark >= 50 && mark < 60) {
            System.out.println("D");
        }

        if (mark >= 60 && mark < 70) {
            System.out.println("C");
        }
        if (mark >= 70 && mark < 80) {
            System.out.println("B");
        }
        if (mark >= 80) {
            System.out.println("A");
        }
        return 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner for user input
        Scanner input = new Scanner(System.in);

        // ask user to enter mark and scan it in
        System.out.println("Enter your mark:");
        int mark = input.nextInt();

        // calculate grade using examGrade method on inputted mark
        char grade = examGrade(mark);
    }
}
