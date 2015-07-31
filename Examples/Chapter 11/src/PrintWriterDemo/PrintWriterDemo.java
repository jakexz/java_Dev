/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrintWriterDemo;

import java.io.PrintWriter;

/**
 *
 * @author Jakexz
 */
public class PrintWriterDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Create a print writer
            PrintWriter pw = new PrintWriter(System.out);
            
            //Experiment with some methods
            pw.println(true);
            pw.println('a');
            pw.println(400);
            pw.println(3244325L);
            pw.println(45.67f);
            pw.println(34.85);
            pw.println("Hello");
            pw.println(new Integer("99"));
            
            //Close print writer
            pw.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }// TODO code application logic here
    }
    
}
