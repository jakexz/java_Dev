/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadConsole;

/**
 *
 * @author Jakexz
 */
import java.io.*;
public class ReadConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Create an input stream reader
            InputStreamReader isr  = new InputStreamReader(System.in);
            
            //Create an buffered reader
            BufferedReader br = new BufferedReader(isr);
            
            //Read and process lines from console 
            String s;
            while((s = br.readLine()) != null)
                System.out.println(s.length());
            
            //Closes the file 
            isr.close();
        }catch(Exception e){
            e.printStackTrace();
        }// TODO code application logic here
    }
    
}
