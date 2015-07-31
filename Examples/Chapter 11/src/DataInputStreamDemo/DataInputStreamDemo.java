/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataInputStreamDemo;

/**
 *
 * @author Jakexz
 */
import java.io.*;
public class DataInputStreamDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Create a file input stream
            FileInputStream fis = new FileInputStream("ByteFile.txt");
            
            //Create a data input stream
            DataInputStream dis = new DataInputStream(fis);
            
            //Read and display data
            System.out.println(dis.readBoolean());
            System.out.println(dis.readByte());
            System.out.println(dis.readChar());
            System.out.println(dis.readDouble());
            System.out.println(dis.readInt());
            System.out.println(dis.readFloat());
            System.out.println(dis.readLong());
            System.out.println(dis.readShort());
            
            //Close file input stream
            fis.close();
            
        }catch(Exception e){
            System.out.println("Exception " + e);
        }// TODO code application logic here
    }
    
}
