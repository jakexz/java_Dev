/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise2.pkg3;

/**
 *
 * @author Jakexz
 */
public class Exercise23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "This is the sentence, I don't know how many characters are in here";// TODO code application logic here
        int end = s.length();
        int begin = s.length() - 10;
        
        System.out.println("The last ten characters are " + "\""+  s.substring(begin, end) + "\"");
        
        // Exercise part 2
        
        String s2 = "1,2,3,4,5";
        
        System.out.println("The last character of string s2 is " + s2.substring(s2.length() - 1));
    }
    
}
