/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excerise11_3;

/**
 *
 * @author Jakexz
 */
import java.io.*;
import java.util.ArrayList;
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Create a file Writer to write tabs
            FileWriter fw = new FileWriter("This.txt");
            //Create a loop to write to This.txt with tabs 
            for(int i = 1; i < 19; i++){
                fw.write("\t" + i + "\n");
            }
            
            //Close the file 
            fw.close();
            
            //Create a file reader
            FileReader fr = new FileReader("This.txt");
            //Create file buffer 
            BufferedReader br = new BufferedReader(fr);
            //create another file writer 
            FileWriter write = new FileWriter("WriteThis.txt");

                String s;
                char c;
            while((s =br.readLine()) != null){
                StringBuffer sb = new StringBuffer();
                for(int i = 0; i < s.length() ; i++){
                    c = s.charAt(i);
                    if( c == '\t')
                        c = ' ';
                sb.append(c);
                }
                s = sb.toString();
                write.write(s);

            }
            
            //Close the file 
            fr.close();
            write.close();
            //Read the array list, convert tab to space 
            
            
        }catch(Exception e ){
            e.printStackTrace();
        }// TODO code application logic here
    }
    
}
