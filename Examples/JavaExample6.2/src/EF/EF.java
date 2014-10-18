/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EF;

class E {
    int x;
}

class F extends E{
    String x;
}
/**
 *
 * @author Jakexz
 */
public class EF {
    public static void main(String args[]){
        F f = new F();
        f.x = "This is a string";
        System.out.println("class f string x: "+ f.x);
        E e = new E();
        e.x = 34;
        System.out.println("class e interger x: " + e.x);
    }
}
