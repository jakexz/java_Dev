/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BufferedOutputStreamDemo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Jakexz
 */
public class BufferedOutputStreamDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Create a file output stream 
            FileOutputStream fos = new FileOutputStream("ByteForce.txt");
            
            //Create a buffered output stream 
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            
            //Write 12 bytes to the file
            for(int i = 0; i < 12 ; i++){
                bos.write(i);
                
            }
            
            //Close buffered output stream
            bos.close();
            
        }catch(Exception e ){
            System.out.println("Exception " + e);
        }// TODO code application logic here
    }
    
}
