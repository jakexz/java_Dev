/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InetAddressDemo;

import java.net.InetAddress;

/**
 *
 * @author Jake
 */
public class Chapter12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Get an address 
            InetAddress ias[] = 
                    InetAddress.getAllByName("1");
            
            for(int i = 0; i < ias.length ; i++){
                System.out.println(ias[i].getHostName());
                System.out.println(ias[i].getHostAddress());
                
                byte bytes[] = ias[i].getAddress();
                
                for(int j = 0; j < bytes.length; j++){
                    if(j > 0)
                        System.out.print(".");
                    if(bytes[j] >= 0)
                        System.out.println(bytes[j]);
                    else
                        System.out.println(bytes[j] + 256);
                    
                }
                System.out.println("");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
