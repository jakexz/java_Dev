/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package emptycase;
import java.util.Scanner;
/**
 *
 * @author Jakexz
 */
public class EmptyCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.print("Please enter a character: "); // TODO code application logic here
        Scanner input = new Scanner(System.in);
        char i = input.next(".").charAt(0);
        // TODO code application logic here
        
        switch(i){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
    
}
