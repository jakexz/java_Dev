/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise2.pkg7;

/**
 *
 * @author Jakexz
 */
public class Exercise27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char c = 'a'; // TODO code application logic here
        System.out.println(Character.isDefined(c));
        System.out.println(Character.isLetterOrDigit(c));
        System.out.println(Character.isWhitespace(c));
        System.out.println(Character.isLowerCase(c));
        
        //exercise problem 2
        String s1= "07";
        String s2 = "5.45342";
        String s3 = "42";
        
        System.out.println(Short.valueOf(s1)+ Short.valueOf(s2)+ Short.valueOf(s3));
       
        
        
    }
    
}
