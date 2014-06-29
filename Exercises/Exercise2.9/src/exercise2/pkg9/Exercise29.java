/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise2.pkg9;

/**
 *
 * @author Jakexz
 */
public class Exercise29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float array[] = new float[5];// TODO code application logic here
        array[0] = 3.3424f;
        array[1] = 5.37404239f;
        array[2] = 6.534654f;
        array[3] = 763.45234543f;
        array[4] = 63874.5654234523f;
        
        for(int i = 0 ; i < 5; i++){
            System.out.println(array[i]);
        }
        
        
        //exercise problem 2
        Object array2[];
        array2 = new Object[5];
        array2[0] = 4;
        array2[1] = "this is a string";
        array2[2] = true;
        array2[3] = 'i';
        array2[4] = 34.0932342;
        
        for(int i = 0 ; i < 5; i++){
            System.out.println(array2[i]);
        }
        
     
    }
    
}
