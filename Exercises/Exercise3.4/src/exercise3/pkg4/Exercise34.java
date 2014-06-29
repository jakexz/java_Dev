/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise3.pkg4;
import java.util.Scanner;
/**
 *
 * @author Jakexz
 */
public class Exercise34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       for(int i = 1; i < 101; i++) // TODO code application logic here
           System.out.println("The number is " + i);
       
       //problem 2
       int i = 17;
       do{
           
           if((i %17) == 0)
               System.out.println("The number divisible by 17 is " + i);
           i++;
       }while(i <=101);
       
       //problem 3
       System.out.print("Please enter a number: ");
       Scanner input = new Scanner(System.in);
       int num = input.nextInt();
       int increment = 1;
       do{
           
           if((num % increment) == 0)
               System.out.println("Factor of "+ num +" is " + increment);
           increment++;
       }while(increment <= num);
    }
    
}
