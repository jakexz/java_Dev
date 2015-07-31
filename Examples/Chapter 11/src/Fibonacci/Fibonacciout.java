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
public class Fibonacciout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Create a file output stream 
            FileOutputStream fos = 
                    new FileOutputStream("Fibo.txt");
            
            //Create a data  output stream 
            DataOutputStream dos =
                    new DataOutputStream(fos);
            
            //Write 15 fibo numbers 
            int count = 0, i = 0, j = 1;
            
            do{
                dos.writeShort(j);
                int k = i + j;
                i = j;
                j = k;
            }while(++count < 15);
        
            //Close file output stream 
            fos.close();
        }catch(Exception e){
            System.out.println("Exception: " + e);
        }
    }
    
}
