/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrayreference;

/**
 *
 * @author Jakexz
 */
public class ArrayReference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declare and allocate space for array
        float array1[] = new float[3];
        
        //initialize array1
        array1[0] = -3.45f;
        array1[1] = 7.7f;
        array1[2] = 101.56f;
        
        //Declare and allocate space for array2
        float array2[] = new float[3];
        
        array2 = array1;
        
        //Display the elements of array2
        System.out.println("array2: ");
        for(int i = 0; i < 3; i++){
            System.out.println(array2[i]);
        }
        
        //Change an element 
        array2[1] = 100;
        
        //Display the elements of array1
        System.out.println("array1: ");
        for(int i = 0; i < 3; i++){
            System.out.println(array1[i]);
        }
        
        //Display the elements of array2
        System.out.println("array2: ");
        for(int i = 0; i < 3; i++){
            System.out.println(array2[i]);
        }        
        
    }
    
}
