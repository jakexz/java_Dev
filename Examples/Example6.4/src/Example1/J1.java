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
public class J1 extends I1 {
    @Override
    void hello(String s){
        super.hello(s);
        System.out.println("J1: " + s);
    }
}
