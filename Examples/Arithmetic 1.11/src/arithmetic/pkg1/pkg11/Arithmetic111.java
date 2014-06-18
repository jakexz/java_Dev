/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arithmetic.pkg1.pkg11;
import java.util.Scanner;

/**
 *
 * @author Jakexz
 */
public class Arithmetic111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print(5/2);
        System.out.print(" " + 5%2);
        System.out.print(" " + 4/2);// TODO code application logic here
        System.out.println(" " + 4%2);
        
        System.out.print("Example 2");//too small to be its own, so it is here
        int count, num, val;
        Scanner input = new Scanner(System.in);
        count = input.nextInt();
        num = input.nextInt();
        val = input.nextInt();
        
        System.out.println((count*num) + (88/val) - (19 % count));
        
        
        System.out.println("Example 3");
        int i = 10;
        i = -1;
        
        System.out.println("This is " + i);
        
        
        
    }
    
}
