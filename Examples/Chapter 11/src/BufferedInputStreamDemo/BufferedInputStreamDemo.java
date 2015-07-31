/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BufferedInputStreamDemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 *
 * @author Jakexz
 */
public class BufferedInputStreamDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Create a file input stream 
            FileInputStream fis = new FileInputStream("ByteForce.txt");
            
            //Create a buffered input stream 
            BufferedInputStream bis = new BufferedInputStream(fis);
            
            //Read and display data
            int i ;
            while((i = bis.read()) != -1){
                System.out.println(i);
            }
            
            //Close file input stream
            fis.close();
        }catch(Exception e){
            System.out.println("Exception " + e);
        }// TODO code application logic here
    }
    
}
