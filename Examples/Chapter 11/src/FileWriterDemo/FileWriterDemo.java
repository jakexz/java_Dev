/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileWriterDemo;

/**
 *
 * @author Jakexz
 */
import java.io.*;
public class FileWriterDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a file writer
        try{
        FileWriter fw = new FileWriter("Myfile.txt");
        
        //Write string to file
        for(int i = 0; i < 12; i++){
            fw.write("Line " + i + "\n");
            
        }
        //Close file writer 
        fw.close();
        }catch(Exception e){
            System.out.println("Exception: " + e);
        }
    }
    
}
