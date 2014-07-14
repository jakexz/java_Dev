/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package switchdemo;
import java.util.Scanner;
/**
 *
 * @author Jakexz
 */
public class SwitchDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Please enter an integer: "); // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        switch(i)
        {
            case 1: System.out.println("One"); break;
            case 2: System.out.println("Two"); break;
            case 3: System.out.println("Three"); break;
            case 4: System.out.println("Four"); break;
            default : System.out.println("Unrecognized Number");
        }
        
        
    }
    
    
    
}
