/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excerise10_4;

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
        Random rand = new Random();// TODO code application logic here
        Vector vector = new Vector();
        for(int i = 0; i < (int)(10 +10*Math.random()); i++){
            vector.addElement(rand.nextGaussian());
        }
        Enumeration e = vector.elements();
        
        System.out.print("[ ");
        while(e.hasMoreElements()){
            Object obj = e.nextElement();
            System.out.print(obj + " ");
        }
        System.out.println("]");
        
    }
    
}
