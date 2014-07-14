/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifelseladder;
import java.util.Scanner;
/**
 *
 * @author Jakexz
 */
public class IfElseLadder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Please enter an integer: ");// TODO code application logic here
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        if(i < 0)
            System.out.println("Negative number");
        else if(i == 0)
            System.out.println("Zero");
        else if(i == 1)
            System.out.println("One");
        else if(i == 2)
            System.out.println("Two");
        else if(i == 3)
            System.out.println("Three");
        else
            System.out.println("Greater than three");
    }
    
}
