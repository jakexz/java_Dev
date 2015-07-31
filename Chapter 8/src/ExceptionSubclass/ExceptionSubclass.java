/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionSubclass;

/**
 *
 * @author Jakexz
 */
import java.util.*;

public class ExceptionSubclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        a();// TODO code application logic here
    }
    
    static void a(){
        try{
            b();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    static void b() throws ExceptionA{
        try{
            c();
        }catch(ExceptionB e){
            e.printStackTrace();
        }
    }
    
    static void c() throws ExceptionA, ExceptionB{
        Random random = new Random();
        int i = random.nextInt();
        if(i%2== 0){
            throw new ExceptionA("We have a problem");
        }
        else{
            throw new ExceptionB("We have a big problem");
        }
    }
    

}

    class ExceptionA extends Exception {
        public ExceptionA(String message){
            super(message);
        }
    }
    
    class ExceptionB extends Exception{
        public ExceptionB(String message){
            super(message);
        }
    }

