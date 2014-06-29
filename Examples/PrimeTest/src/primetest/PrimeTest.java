/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primetest;
import java.util.Scanner;

/**
 *
 * @author Jakexz
 */
public class PrimeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Please enter an integer: ");// TODO code application logic here
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        boolean prime = true;
        for(long i = 2; i <= num/2;i++)
            if((num %i) == 0)
                prime = false;
        
        if(prime)
            System.out.println("The number is prime");
        else
            System.out.println("The number is not prime");
        
    }
    
}
