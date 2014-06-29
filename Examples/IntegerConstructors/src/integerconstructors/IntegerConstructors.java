/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package integerconstructors;

/**
 *
 * @author Jakexz
 */
public class IntegerConstructors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer iobj1 = 5;// TODO code application logic here
        Integer iobj2 = new Integer("6");
        int i1 = iobj1;
        int i2 = iobj2;
        
        int sum = i1 + i2;
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("Sum = " + sum);
        
    }
    
}
