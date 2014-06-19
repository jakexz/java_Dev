/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package onedimensionarray;

/**
 *
 * @author Jakexz
 */
public class OneDimensionArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int myArray[] = new int[4];// TODO code application logic here
        myArray[0]= 33;
        myArray[1]= 71;
        myArray[2]= -16;
        myArray[3]= 45;
        
        System.out.println("my array length is " + myArray.length);
        
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);
        System.out.println(myArray[3]);
        
    }
    
}
