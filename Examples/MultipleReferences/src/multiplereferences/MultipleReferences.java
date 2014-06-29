/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multiplereferences;

/**
 *
 * @author Jakexz
 */
public class MultipleReferences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer obj1 = new Integer(5);// TODO code application logic here
        System.out.println(obj1);
        Integer obj2 = obj1;
        obj2 = 6;
        obj1 = obj2;
        Integer obj3 = obj1;

        System.out.println(obj2);
        System.out.println(obj3);
    }
    
}
