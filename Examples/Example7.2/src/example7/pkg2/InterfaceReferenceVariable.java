/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example7.pkg2;

/**
 *
 * @author Jakexz
 */
public class InterfaceReferenceVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       A a;
       a = new C1();
       a.display("String 1");
       a = new C2();
       a.display("String 2");
       a = new C3();
       a.display("String 3");
    }
    
}
