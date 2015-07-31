/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOutputStreamDemo;

import java.io.FileOutputStream;

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
            //Create a file output stream 
            FileOutputStream fos = new FileOutputStream("ByteFile.txt");
            
            //Write 12 bytes to the file 
            for(int i = 0; i<12 ; i++){
                fos.write(i);
            }
            
            //Close file output stream 
            fos.close();
        }catch(Exception e){
            System.out.println("Exception " + e);
         }// TODO code application logic here
    }
    
}
