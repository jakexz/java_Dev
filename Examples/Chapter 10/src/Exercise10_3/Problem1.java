/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise10_3;

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
        Calendar calendar = Calendar.getInstance();
        
        if((calendar.get(Calendar.YEAR) % 4) == 0)
            System.out.println(calendar.get(Calendar.YEAR) + " is a leap year");// TODO code application logic here
        else
            System.out.println(calendar.get(Calendar.YEAR) + " is not a leap year");
        
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }
    
}
