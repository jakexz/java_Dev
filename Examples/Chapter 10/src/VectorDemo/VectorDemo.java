/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VectorDemo;

/**
 *
 * @author Jakexz
 */
import java.util.*;
public class VectorDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a vector and its elements
        Vector vector = new Vector();
        vector.addElement(5);
        vector.addElement(-14.13f);
        vector.addElement("Hello");
        vector.addElement(12000000);
        vector.addElement(-29.34e-22);
        
        //Display the vector elements
        System.out.println(vector);
        
        //Insert an element into the vector
        String str = "String to be inserted";
        vector.insertElementAt(str, 1);
        System.out.println(vector);
        
        //Remove an element from the vector
        vector.removeElementAt(4);
        System.out.println(vector);
        
    }
    
}
