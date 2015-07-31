/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example8.pkg1;
import java.util.Scanner;
/**
 *
 * @author Jakexz
 */
public class Example81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Before Division");
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(i/j);
            System.out.println("After division");
            
            
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException");
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch(NumberFormatException e){
            System.out.println("NumberFormatException");
        }finally{
            System.out.println("Finally block");
        }
        
    }
    
}
