/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excerise11_2;

/**
 *
 * @author Jakexz
 */
import java.io.*;
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        //Create file reader
        FileReader fr = new FileReader("Myfile.txt");
        
        //Create file writer
        FileWriter fw = new FileWriter("MyFile2.txt");
        
        //reading loop 
        int i ;
        while ((i = fr.read()) != -1){
            fw.write(i);
            }       
        
        //close both io operation
        fr.close();fw.close();
            
        }catch (Exception e ){
            e.printStackTrace();
            
        }
        
    }
    
}
