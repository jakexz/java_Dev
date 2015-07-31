/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise10_1;

/**
 *
 * @author Jakexz
 */

import java.util.*;
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Lent me your ears, give me a point to start: ");
        long seed ;

        Scanner scan = new Scanner(System.in);
        seed = scan.nextLong();
        Random rand = new Random(seed);
        
        System.out.println("First set of random");
        for(int i = 0; i< 10 ; i++){
            
            System.out.print(rand.nextInt() + " ");
        }
        
        System.out.println("\nSecond set of random:");
        for(int i = 0; i< 10 ; i++){
            System.out.print(rand.nextInt() + " ");
        }        
        // TODO code application logic here
    }
    
}
