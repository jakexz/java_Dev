/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomInts;

/**
 *
 * @author Jakexz
 */
import java.util.*;

public class RandomInts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generator = new Random();// TODO code application logic here
        
        for(int i = 0; i < 10; i++)
            System.out.println(generator.nextInt());
    }
    
}
