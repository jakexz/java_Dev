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
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date current = new Date();
        long getTime = current.getTime();
        getTime += 100*60*60*24*1000L;
        
        current.setTime(getTime);
        System.out.println(current);
        // TODO code application logic here
    }
    
}
