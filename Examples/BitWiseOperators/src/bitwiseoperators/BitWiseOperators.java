/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bitwiseoperators;

/**
 *
 * @author Jakexz
 */
public class BitWiseOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char c = 'A';// TODO code application logic here
        byte b = 100;
        short s = 100;
        int i = -100;
        long lo = 100;
        
        System.out.println(c & 0xf);
        System.out.println(b |1);
        System.out.println(s ^ 1);
        System.out.println(~i);
        System.out.println(lo | 1);
        System.out.println(i >> 2);
        System.out.println(s >>> 2);
        System.out.println(i << 2);
    }
    
}
