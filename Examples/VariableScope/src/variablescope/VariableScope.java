/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package variablescope;

/**
 *
 * @author Jakexz
 */

class X{
    void f(){
        for(int j = 0; j < 5; j++ ){
            int k = 100;
            System.out.println("j = " + j + ": k = " + k);
        }
    }
}
public class VariableScope {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        X x = new X();// TODO code application logic here
        x.f();
    }
    
}
