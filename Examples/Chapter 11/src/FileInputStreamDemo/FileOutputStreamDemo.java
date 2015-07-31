/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileInputStreamDemo;

import java.io.FileInputStream;

/**
 *
 * @author Jakexz
 */
public class FileOutputStreamDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Create a file input stream 
            FileInputStream fis = new FileInputStream("ByteFile.txt");
            
            //Read and display data
            int i ;
            while((i = fis.read()) != -1){
                System.out.println(i);
                
                
        }
            //Close file input stream 
            fis.close();
            
        }catch(Exception e){
            System.out.println("Exception " + e);
        }// TODO code application logic here
    }
    
}
