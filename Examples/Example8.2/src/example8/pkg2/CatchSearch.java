/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example8.pkg2;

/**
 *
 * @author Jakexz
 */
public class CatchSearch {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        try{
            System.out.println("Before a");
            a();
            System.out.println("Before a");
        }catch(Exception e){
            System.out.println("main: " + e );
        }finally {
            System.out.println("main: finally ");
        }// TODO code application logic here
    }
    
    public static void a(){
        try{
            System.out.println("Before b");
            b();
            System.out.println("Before b");
        }catch(ArithmeticException e){
            System.out.println("a: " + e );
        }finally {
            System.out.println("a: finally ");
        }
    }
    
    public static void b(){
        try{
            System.out.println("Before c");
            c();
            System.out.println("Before c");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("b: " + e );
        }finally {
            System.out.println("b: finally ");
        }
    }
    
    public static void c(){
        try{
            System.out.println("Before d");
            d();
            System.out.println("Before d");
        }catch(NumberFormatException e){
            System.out.println("c: " + e );
        }finally {
            System.out.println("c: finally ");
        }
    }
    
    public static void d(){
        try{
            int array[] = new int[4];
            array[10] = 10;
        }catch(ClassCastException e){
            System.out.println("d: " + e );
        }finally {
            System.out.println("d: finally ");
        }
    }
    
}
