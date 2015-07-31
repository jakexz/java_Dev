/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set1;

/**
 *
 * @author Jakexz
 */
public class Instance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        W w = new W();// TODO code application logic here
        
        if(w instanceof I1)
            System.out.println("I have I1");
        if(w instanceof I2)
            System.out.println("I have I2");
        if(w instanceof I3)
            System.out.println("I have I3");
        if(w instanceof I4)
            System.out.println("I have I4");
        
        
    }
    
}
