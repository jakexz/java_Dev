/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excerise10_4;

/**
 *
 * @author Jakexz
 */
import java.util.*;
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Vector vector = new Vector();

        double d = 0.00;
        System.out.print("Please enter a number to add to the array: ");
        while(scan.hasNextDouble()){
            System.out.print("Please enter a number to add to the array: ");
            d = scan.nextDouble();
            vector.addElement(d);
        }
        
        for(int i = vector.size() -1 ;i >= 0 ; i--){
            System.out.print(vector.elementAt(i) + " ");
        }
        // TODO code application logic here
    }
    
}
