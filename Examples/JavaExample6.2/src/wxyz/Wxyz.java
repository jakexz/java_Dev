/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wxyz;

class W{
    float f;
}

class X extends W{
    StringBuffer sb;
}

class Y extends X{
    String s;
}

class Z extends Y{
    int i;
}
/**
 *
 * @author Jakexz
 */
public class Wxyz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Z z = new Z();// TODO code application logic here
        z.f = 4.56f;
        z.sb = new StringBuffer("abcde");
        z.s = "What the fuck is this string";
        z.i = 42;
        
        System.out.println("class Z float: " + z.f);
        System.out.println("class Z string buffer: " + z.sb);
        System.out.println("class Z string: " + z.s);
        System.out.println("class Z integer: " + z.i);
    }
    
}
