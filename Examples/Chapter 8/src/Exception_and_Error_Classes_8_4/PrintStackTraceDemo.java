/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_and_Error_Classes_8_4;

/**
 *
 * @author Jakexz
 */
public class PrintStackTraceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            a();
            
        
        }// TODO code application logic here
        catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
    
    public static void a(){
        try{
            b();
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
    }
    
    public static void b(){
        try{
            c();
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
    }
    
    public static void c(){
        try{
            d();
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
    }
    
    public static void d(){
        try{
            int i = 1, j = 0;
            System.out.println(i/j);
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
    }
}
