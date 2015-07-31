/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileReaderDemo;

/**
 *
 * @author Jakexz
 */
import java.io.*;
public class FileReaderDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Create a file reader
            FileReader fr = new FileReader("Myfile.txt");
            
            //Read and display characters
            int i;
            while((i = fr.read()) != -1){
                System.out.print((char)i);
                
            }
            //Close file reader
            fr.close();
        }catch(Exception e){
            e.printStackTrace();
        }// TODO code application logic here
    }
    
}
