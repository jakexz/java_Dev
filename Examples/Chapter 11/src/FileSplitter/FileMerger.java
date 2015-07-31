/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileSplitter;

/**
 *
 * @author Jakexz
 */

import java.io.*;
public class FileMerger {
    private final static int BUFFERSIZE = 1024;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Create a file output stream 
            FileOutputStream fos = new FileOutputStream("Merge.txt");
            
           byte buffer[];
            
            buffer = new byte[BUFFERSIZE];
            
            //init the count 
            int count = 0;
            
            //Process data from the input files 
            while(true){
                //Create a file input stream 
                String filename = args[0] + count;
                FileInputStream fis;
                try{
                    fis = new FileInputStream(filename);
                    
                }catch(FileNotFoundException fnfex){
                    break;
                }
                
                //Process data from the file
                while(true){
                    //Read a block from the file
                    int i = fis.read(buffer, 0, BUFFERSIZE);
                    
                    if(i == -1)
                        break;
                    
                    //Append data to the output file
                    fos.write(buffer, 0, i);
                    fos.flush();
                }
                
                //Increment count 
                ++count;
            }
            
            //Close the output file
            fos.close();
        }catch(Exception e) {
            e.printStackTrace();
        }// TODO code application logic here
    }
    
}
