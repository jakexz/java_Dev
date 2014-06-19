/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise1.pkg16.pkg1;

/**
 *
 * @author Jakexz
 */
public class Exercise1161 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float myArray[][] = {{-56.7f},{500.1f, 70.70f},{100.9f, 0.5f, 20.20f}};// TODO code application logic here
        
        
        //Display array length
        for(int i = 0; i < 3; i++){
            System.out.println("My array element " + i +" length is: " + myArray[i].length);
            
        }
        
        //Display array elements
        System.out.println(myArray[0][0]);
        System.out.println(myArray[1][0]);
        System.out.println(myArray[1][1]);
        System.out.println(myArray[2][0]);
        System.out.println(myArray[2][1]);
        System.out.println(myArray[2][2]);
        
    }
    
}
