/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bagtest;

/**
 *
 * @author Jakexz
 */

class Bag{
    boolean flag;
    int i, j = 2, k = 3, l, m;
    double array[] = {-3.4, 8.8e100, -9.2e-100};
    String s1, s2 = "Hello";
    
}
public class BagTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bag bag = new Bag();// TODO code application logic here
        System.out.println(bag.flag);
        System.out.println(bag.i);
        System.out.println(bag.j);
        System.out.println(bag.k);
        System.out.println(bag.l);
        System.out.println(bag.m);
        for(int i = 0; i <bag.array.length; i++)
        
            System.out.println(bag.array[i]);
        System.out.println(bag.s1);
        System.out.println(bag.s2);
        
    }
    
}
