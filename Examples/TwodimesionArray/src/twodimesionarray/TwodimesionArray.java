/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twodimesionarray;

/**
 *
 * @author Jakexz
 */
public class TwodimesionArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare and allocate space              
        int myArray[][]= new int[3][2];
        
        //Initialize elements 
        myArray[0][0] = 33;
        myArray[0][1] = 71;
        myArray[1][0] = -16;
        myArray[1][1] = 45;
        myArray[2][0] = 99;
        myArray[2][1] = 27;
        
        //Display length
        System.out.println("My array length is "+myArray.length);
        
        //Display elements 
        for(int i = 0; i < 3; i++){
            for(int j = 0 ; j < 2; j++ ){
                System.out.println(myArray[i][j]);
            }
        }
        
        
        System.out.println("Another example of how to initialise and print array");
        
        int myArray1[][] = {{33, 71}, {-16, 45}, {99, 27}};
        
        //Display length
        System.out.println("My array length is "+myArray.length);
        
        //Display elements 
        for(int i = 0; i < 3; i++){
            for(int j = 0 ; j < 2; j++ ){
                System.out.println(myArray1[i][j]);
            }
        }
        
        
        //An display of uneven arrays 
        int myArray2[][] = {{33, 71 }, {-16, 45, 60, -7}, {99}};
        
        //Display lengths of the array and its elements
        for(int i = 0; i < 3; i++){
            System.out.println("Myarray.length = " +  myArray2[i].length);
        }
        
        
        //Display elements 
       
        System.out.println(myArray2[0][0]);
        System.out.println(myArray2[0][1]);
        System.out.println(myArray2[1][0]);
        System.out.println(myArray2[1][1]);
        System.out.println(myArray2[1][2]);
        System.out.println(myArray2[1][3]);
        System.out.println(myArray2[2][0]);
        
            
    }
    
}
