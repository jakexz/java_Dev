/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise4.pkg2;
import java.util.Scanner;

/**
 *
 * @author Jakexz
 */
public class Exercise42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Exercise1(); // TODO code application logic here
       Exercise2();
    }
    
    public static void Exercise1(){
        System.out.print("Please enter an integer: ");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        for(; i > 0 ; i--){

            System.out.println("T-minus: " + i );
            
        }
        System.out.println("~bell~ \u0007");
    }
    
    public static void Exercise2(){
        System.out.println("Displaying powers of 2");
        for(int i = 1; i <= 1000000;){
            System.out.println(i);
            i += i;
                    }
    }
    
    
}
