/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problem1;

/**
 *
 * @author Jakexz
 */
public class ReturnDisc {
    public static void main(String args[]){
        System.out.println("Instantiating I1");
        I1 obj = new I1();
        obj.getDiscription("Good morning");
        
        System.out.println("Instantiating I1");
        obj = new J1();
        obj.getDiscription("Good afternoon");
        
        System.out.println("Instantiating I1");
        obj = new K1();
        obj.getDiscription("Good evening");
    }
}
