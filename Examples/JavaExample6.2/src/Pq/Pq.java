/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pq;

class P{
    static int x;
}

class Q extends P{
    static String x;
}

/**
 *
 * @author Jakexz
 */
public class Pq {
    public static void main(String args[]){
        P p = new P();
        p.x = 55;
        System.out.println("class p static int x: " + p.x);
        Q q = new Q();
        q.x = "This is a string";
        System.out.println("class q string: " + q.x);
        
    }
}
