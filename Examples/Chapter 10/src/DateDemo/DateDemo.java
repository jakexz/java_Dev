/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateDemo;

/**
 *
 * @author Jakexz
 */
import java.util.*;
public class DateDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Get date object init
        //to current date and time
        Date currentDate = new Date();
        
        //Display current date
        System.out.println(currentDate);
        
        //Get date object init
        //the epoch
        Date epoch = new Date(0);
        
        //Display epoch date
        System.out.println(epoch);
    }
    
}
