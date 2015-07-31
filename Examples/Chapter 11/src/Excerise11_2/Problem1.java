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
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //allocate an array to hold digits counts
            int counts [] = new int[10];
            
            //Create file reader
            FileReader fr = new FileReader("intfile.txt");
            
            //Read characters
            int i;
            while((i = fr.read()) != -1){
                char c = (char)i;
                int k = c -'0';
                if(k >= 0 && k < 10)
                    ++counts[k];
                
            }
            
            //Display digit counts 
            for(int j = 0; j < 10; j++){
                char c = (char)('0'  + j);
                System.out.print(c + "= ");
                System.out.print(counts[j] + "; ");
                
            }
            
            //Close file reader
            fr.close();
        }catch(Exception e){
            e.printStackTrace();
        }// TODO code application logic here
    }
    
}
