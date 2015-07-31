/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise10_2;

/**
 *
 * @author Jakexz
 */

import java.util.*;
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date currentEpoch = new Date();// TODO code application logic here
        long dayAfter = currentEpoch.getTime();
        
        System.out.println("It has been "+ (int)(dayAfter/(60*1000*60*24)) +" days ");
    }
    
}
