/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alphabet3;

/**
 *
 * @author Jakexz
 */
public class Alphabet3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i , j, k;// TODO code application logic here
        for(i = 0; i < 3 ; i++){
            for(j = 0  ; j < 26; j++)
                for(k = 0 ; k < 2 ; k++)
                    System.out.print((char)('A' + j));
        }
    }
    
}
