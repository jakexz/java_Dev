/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package expressionloop;
import java.util.Scanner;  
/**
 *
 * @author Jakexz
 */
public class ExpressionLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter an integer: ");// TODO code application logic here
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        
        for(;i > 0; --i)
            System.out.println(i + " ");
        
    }
    
}
