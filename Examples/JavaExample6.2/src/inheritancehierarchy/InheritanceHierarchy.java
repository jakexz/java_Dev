/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritancehierarchy;
class x{}

class x1 extends x{}

class x11 extends x1{}

class x12 extends x1{}

class x21 extends x11{}

class x22 extends x11{}


/**
 *
 * @author Jakexz
 */
public class InheritanceHierarchy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        x X;// TODO code application logic here
        System.out.println("Instanitating X");
        
        X = new x();
        X = new x1();
        X = new x11();
        X = new x12();
        X = new x21();
        X = new x22();
        
        
    }
    
}
