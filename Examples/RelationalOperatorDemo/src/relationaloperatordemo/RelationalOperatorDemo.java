/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package relationaloperatordemo;
import java.util.Scanner;

/**
 *
 * @author Jakexz
 */
public class RelationalOperatorDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter 2 integers");// TODO code application logic here
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int j = input.nextInt();
        
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("Relational operators: ");
        System.out.println("i < j " + (i < j));
        System.out.println("i <= j " + (i <= j));
        System.out.println("i == j " + (i == j));
        System.out.println("i > j " + (i > j));
        System.out.println("i = " + i);
    }
    
}
