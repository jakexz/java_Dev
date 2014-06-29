/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package productandsum;

/**
 *
 * @author Jakexz
 */
public class ProductAndSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;// TODO code application logic here
        int prod = 1;
        for(int num = 1; num < 6; num++){
            sum = sum + num;
            prod = prod * num;
            
         
        }
        System.out.println("product and sum: " + prod +" "+ sum);
    }
    
}
