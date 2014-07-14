/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primenumbers;

/**
 *
 * @author Jakexz
 */
public class PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 0, number = 1;// TODO code application logic here
        do {
            //Test for factors
            boolean prime = true;
            for(int i = 2; i <= number/2; i++)
                if((number%i) == 0 ) prime = false;
               
            //Display if prime
            if(prime == true){
                System.out.print(number + " ");
                ++count;
            }
            
            //Increment number
            ++number;
            
        }while(count < 15);
    }
    
}
