/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binaryhexoctal;

/**
 *
 * @author Jakexz
 */
public class BinaryHexOctal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 11;// TODO code application logic here
        System.out.println("Binary is " + Integer.toBinaryString(i));
        System.out.println("Hex is " + Integer.toHexString(i));
        System.out.println("Octal is " + Integer.toOctalString(i));
    }
    
}
