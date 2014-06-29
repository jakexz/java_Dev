/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package countlettersdigits2;
import java.util.Scanner;

/**
 *
 * @author Jakexz
 */
public class CountLettersDigits2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int digits = 0;// TODO code application logic here
        int letters = 0;
        System.out.println("Please enter whatever");
        Scanner input = new Scanner(System.in);
        String in = input.next();
        
        
        for(int i = 0;i < in.length(); i++  ){
           char ch = in.charAt(i);
            if(Character.isDigit(ch))
                digits++;
            else if (Character.isLetter(ch))
                letters++;
        }
        System.out.println("There are " + digits + " digits");
        System.out.println("There are " + letters + " letters");
    }
    
}
