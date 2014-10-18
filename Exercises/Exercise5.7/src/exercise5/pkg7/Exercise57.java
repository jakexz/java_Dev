/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise5.pkg7;
import java.util.Scanner;

/**
 *
 * @author Jakexz
 */
class Spanish{
   static String token1 = "uno", token2 = "dos", token3 = "tres", token4 = "quatro", token5 = "cinco";
           String output;
   
   Spanish(int num){
       switch(num){
            case 1: output = token1;
                   break;
            case 2: output = token2;
                   break;
            case 3: output = token3;
                   break;
            case 4: output = token4;
                   break;    
            case 5: output = token5;
                   break;
            default:output = "Mayor que cinco";
       }
   }
    
   
}
public class Exercise57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.print("Please enter a number ");
       Scanner input = new Scanner(System.in); // TODO code application logic here
       int get = input.nextInt();
       Spanish convert = new Spanish(get);
       System.out.println(convert.output);
    }
    
}
