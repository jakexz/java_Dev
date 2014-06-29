/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package angle;
import java.util.Scanner;

/**
 *
 * @author Jakexz
 */
public class Angle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double angle;
         
        do{
        
           System.out.println("Please enter a dicimal number: ");// TODO code application logic here
          Scanner input = new Scanner(System.in);
           angle = input.nextDouble();
          if(angle > 0){
              double radians = angle * Math.PI/180;
              System.out.println("cosine: " + Math.cos(radians));
              System.out.println("sine: " + Math.sin(radians));
              System.out.println("tangent: " + Math.tan(radians));
        }
        else
            System.out.println("Please enter a positive angle");
        
        }while(angle <= 0);
    }
    
}
