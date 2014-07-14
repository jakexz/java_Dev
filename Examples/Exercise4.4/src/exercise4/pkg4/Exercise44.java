/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise4.pkg4;

/**
 *
 * @author Jakexz
 */
public class Exercise44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        fibi();// TODO code application logic here
        forlooptowhile();
    }
    
    
    public static void fibi(){
        int number = 1 , count = 0, dec = 15, sum; 
        
        do{



           
            sum = number + count;
            System.out.print(number + " ");
            count = number;
            number = sum;


            

            
            dec--;
        }while (dec > 0);
    }
    
    public static void forlooptowhile(){
        int i = 0;
        while(i < 10){
            i+=2;
            System.out.println(i);
        }
    }
}
