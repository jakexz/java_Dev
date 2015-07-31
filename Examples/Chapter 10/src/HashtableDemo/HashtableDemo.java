/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashtableDemo;

/**
 *
 * @author Jakexz
 */
import java.util.*;
public class HashtableDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a hash table and populate it
        Hashtable hashtable  = new Hashtable();
        hashtable.put("apple", "red");
        hashtable.put("strawberry", "red");
        hashtable.put("lime", "green");
        hashtable.put("banana", "yellow");
        hashtable.put("orange", "orange");
        
        //display the elements of the hash table
        Enumeration e = hashtable.keys();
        while(e.hasMoreElements()){
            Object k = e.nextElement();
            Object v = hashtable.get(k);
            System.out.println("key = " + k + ";value = " + v);
        }
        
        //display the value for "apple"
        System.out.print("\nThe color of an apple is: ");
        Object v = hashtable.get("apple");
        System.out.println(v);
    }
    
}
