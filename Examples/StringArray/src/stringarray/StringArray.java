/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringarray;

/**
 *
 * @author Jakexz
 */
public class StringArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String array[] = new String[5];// TODO code application logic here
        
        array[0] = "String 0";
        array[1] = "String 1";
        array[2] = "String 2";

        array[4] = "String 4";
        
        System.out.println(array.length);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }
    
}
