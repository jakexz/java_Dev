/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataOutputStreamDemo;

/**
 *
 * @author Jakexz
 */
import java.io.*;
public class DataOutputStreamDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Create a file output stream 
            FileOutputStream fos = new FileOutputStream("ByteFile.txt");
            
            //Create a data output stream
            DataOutputStream dos = new DataOutputStream(fos);
            
            //Write various types of data
            dos.writeBoolean(false);
            dos.writeByte(Byte.MAX_VALUE);
            dos.writeChar('A');
            dos.writeDouble(Double.MAX_VALUE);
            dos.writeFloat(Float.MAX_VALUE);
            dos.writeInt(Integer.MAX_VALUE);
            dos.writeLong(Long.MAX_VALUE);
            dos.writeShort(Short.MAX_VALUE);
            
            //Close file output stream
            fos.close();
        }catch(Exception e){
            System.out.println("Exception " + e);
        }
// TODO code application logic here
    }
    
}
