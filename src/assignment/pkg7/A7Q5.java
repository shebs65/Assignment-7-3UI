/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg7;

/**
 *
 * @author shebm3906
 */
public class A7Q5 {

    public static void chaotic(int seven) {
        
        // output number of asterisks equal to random number between 1 and 5, repeat 6 more times
        for (int x = 0; x < seven; x++) {
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            for (int i = 0; i < randNum; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // run method chaotic 7 times
        int seven = 7;
        chaotic(seven);

    }
}
