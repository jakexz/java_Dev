/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tail;

import java.io.*;
/**
 *
 * @author Jakexz
 */
public class Tail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Create random access file 
            RandomAccessFile raf = new RandomAccessFile(args[0], "r");
            
            //Determine number of bytes 
            //to display at end of file
            long count = Long.valueOf(args[1]).longValue();
            
            //Determine file length
            long position = raf.length();
            
            //Seek to the correct position 
            position -= count;
            if(position < 0)
                position = 0;
            raf.seek(position);
            
            //Read and display the bytes
            while(true){
                //Read byte
                try{
                    byte b = raf.readByte();
                    
                    //Display as character
                    System.out.print((char)b);
                }catch(EOFException eofe){
                    break;
                }
            }
                
        }catch(Exception e){
            System.out.println("Exception " + e);
        }
// TODO code application logic here
    }
    
}
