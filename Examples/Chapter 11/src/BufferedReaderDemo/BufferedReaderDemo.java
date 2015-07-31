/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BufferedReaderDemo;

/**
 *
 * @author Jakexz
 */
import java.io.*;
public class BufferedReaderDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Create a file reader
            FileReader fr = new FileReader("11_3.txt");
            
            //Create a buffer reader 
            BufferedReader br = new BufferedReader(fr);
            
            //Read and display lines from the file 
            String s ;
            while((s = br.readLine()) != null){
                System.out.println(s);
            }
            
            //Close the file
            fr.close();
        }catch(Exception e){
            e.printStackTrace();
        }// TODO code application logic here
    }
    
}
