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
public class Display {
    public static void main(String args[]){
        N n = new N();
        n.a = 45.155f;
        n.b = 832.454f;
        n.d = 45.4;
        n.s = "Test String";
        System.out.println("Class n has: "
                + n.s + " / " 
                + n.a + " / "
                + n.b +" / "
                + n.d);
    }
}
