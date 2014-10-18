/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package staticbagtest;

/**
 *
 * @author Jakexz
 */

class StaticBag{
    static boolean flag;
    static int i, j = 2, k = 3, l, m;
    static double array[] ={-3.4, 8.8e100, -9.2e-100 };
    static String s1, s2 = "hello";
    
}
public class StaticBagTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(StaticBag.flag);
        System.out.println(StaticBag.i);
        System.out.println(StaticBag.j);
        System.out.println(StaticBag.k);
        System.out.println(StaticBag.l);
        System.out.println(StaticBag.m);
        for(int i = 0; i <StaticBag.array.length; i++)
            System.out.println(StaticBag.array[i]);
        System.out.println(StaticBag.s1);
        System.out.println(StaticBag.s2);
    }
    
}
