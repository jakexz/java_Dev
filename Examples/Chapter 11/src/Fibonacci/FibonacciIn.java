/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci;
import java.io.*;
/**
 *
 * @author Jakexz
 */
public class FibonacciIn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Create a file input stream
            FileInputStream fis = 
                    new FileInputStream("Fibo.txt");
            
            //Create a data input stream
            DataInputStream dis = 
                    new DataInputStream(fis);
            
            //Read and display data
            
            for(int i = 0; i < 15 ; i++){
                System.out.print(dis.readShort() + " ");
            }
            
            //Close file input stream
            fis.close();
        }catch(Exception e ){
            System.out.println("Exception: " + e);
        }
    }
    
}
