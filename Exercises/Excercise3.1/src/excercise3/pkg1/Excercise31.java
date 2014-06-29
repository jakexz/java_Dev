/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package excercise3.pkg1;
import java.util.Scanner;

/**
 *
 * @author Jakexz
 */
public class Excercise31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Please enter an integer: ");
        Scanner input = new Scanner(System.in);// TODO code application logic here
       int i = input.nextInt();
        int oddOrEven = i%2;
        
        if(oddOrEven == 0) {
            System.out.println(i + " is even");
        } else {
            System.out.println(i + " is odd");
        }
        
    }
    
}
