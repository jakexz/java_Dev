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
public class FileSplitter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Create a file output stream
            FileInputStream fis = new FileInputStream("Split.txt");
            
            //Determine size of the buffer 
            int size = 1024;
            if(args.length > 2){
                size = Integer.parseInt(args[2]);
            }
            
            //Create a buffer of the correct size 
            byte buffer[] = new byte[size];
            
            //Initialize the count 
            int count = 0;
            
            //Process data from the file 
            while(true){
                //Read a block from the file 
                int i = fis.read(buffer, 0 , size);
                if(i == -1)
                    break;
                
                //Create an output file 
                String filename = args[1] + count;
                FileOutputStream fos = new FileOutputStream(filename);
                fos.write(buffer,0,i);
                fos.flush();
                fos.close();
                
                //increment count 
                ++count;
            }
        }catch(Exception e){
            e.printStackTrace();
        }// TODO code application logic here
    }
    
}
