/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise12_1;
import java.net.*;
/**
 *
 * @author Jake
 */
public class LocalFlavor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Get local name and address
            InetAddress ia = InetAddress.getLocalHost();
            String name = ia.getHostName();
            String address = ia.getHostAddress();
            
            System.out.println(name + '\n' + address);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
