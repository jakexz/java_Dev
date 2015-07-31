/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise10_1;

/**
 *
 * @author Jakexz
 */
import java.util.*;

public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size; String select;
        Random generator = new Random();// TODO code application logic here
        double total = 0;
        
        
        
        try{
            System.out.println("Would you like to enter a size for random stack, Y/N");
            select = scan.next();

            if("Y".equals(select) || "y".equals(select)){
                System.out.print("insert seed: " );
                size = scan.nextInt();                
                for(int i = 0; i < size; i++)
                    total += generator.nextGaussian();
                System.out.println("Mean: " + (total/size));
            }else {
                for(int i = 0; i < 100; i++)
                    total += generator.nextGaussian();
                System.out.println("Mean; " + (total/100));
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        
        
    }
    
}
