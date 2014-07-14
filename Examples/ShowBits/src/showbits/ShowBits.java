/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package showbits;

/**
 *
 * @author Jakexz
 */
public class ShowBits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte b = -5;
        for(int i = 7; i >= 0; i--){// TODO code application logic here
            if((b & 0x80) == 0)
                System.out.println("Bit " + i + " is 0");
            else 
                System.out.println("Bit " + i + " is 1");
        b<<=1;
    }
    }
    
}
