/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Example1;

/**
 *
 * @author Jakexz
 */
public class SuperForMethods1 {
    public static void main(String args[]){
        System.out.println("Instantiating I1");
        I1 obj = new I1();
        obj.hello("Good morning");
        
        System.out.println("Instantiating I1");
        obj = new J1();
        obj.hello("Good afternoon");
        
        System.out.println("Instantiating I1");
        obj = new K1();
        obj.hello("Good evening");
    }
}
