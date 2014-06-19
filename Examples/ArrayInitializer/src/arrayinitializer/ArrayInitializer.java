/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrayinitializer;

/**
 *
 * @author Jakexz
 */
public class ArrayInitializer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int myArray[] = {33, 71 , -16, 45};// TODO code application logic here
        
        //Display length
        System.out.println("My array length is " + myArray.length);
        
        //Display element
        for(int i = 0; i < 4; i++){
            System.out.println(myArray[i]);
        }
    }
    
}
