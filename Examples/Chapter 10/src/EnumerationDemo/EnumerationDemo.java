/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumerationDemo;

/**
 *
 * @author Jakexz
 */
import java.util.*;
public class EnumerationDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector vector = new Vector();// TODO code application logic here
        vector.addElement(5);
        vector.addElement(-14.42f);
        vector.addElement("Hello");
        vector.addElement(1200000000);
        vector.addElement(-23.34e-11);
        vector.addElement('c');
        vector.addElement("World");
        
        Enumeration e = vector.elements();
        
        while(e.hasMoreElements()){
             Object obj = e.nextElement();
             System.out.print(obj + " ");
        }
    }
    
}
