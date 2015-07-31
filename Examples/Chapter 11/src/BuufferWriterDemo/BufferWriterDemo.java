/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuufferWriterDemo;

/**
 *
 * @author Jakexz
 */
import java.io.*;
public class BufferWriterDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Create a file writer
            FileWriter fw = new FileWriter("11_3.txt");
            
            //Create a buffer writer
            BufferedWriter bw = new BufferedWriter(fw);
            
            //Write strings to the file
            for(int i = 0; i < 12 ; i++){
                bw.write("Line "+ i + "\n");
                }
            
            //Close bufferd writer
            bw.close();
        }catch(Exception e){
            System.out.println("Exception: " + e);
        }// TODO code application logic here
    }
    
}
