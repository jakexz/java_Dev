/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excerise11_3;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Jakexz
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Create a file reader and pass it to a reader buffer
            FileReader fr = new FileReader("WriteThis.txt"); BufferedReader br = new BufferedReader(fr);
            //Store the read data into a string, then segment the string into char
            String s; char c;
            
            while((s = br.readLine() ) != null){
                for(int i = s.length() -1; i >= 0 ; i --){
                    c = s.charAt(i );
                    //Display the final result
                    System.out.print(c + " ");
                }
            }
            fr.close();
            //Display the final result
            
        }catch(Exception e) {
            e.printStackTrace();
        }// TODO code application logic here
    }
    
}
