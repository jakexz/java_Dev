/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InstanceofInterface;

/**
 *
 * @author Jakexz
 */
public class IntanceofInterface {
    public final static int NUMMAMMALS = 4;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mammal mammals[] = new Mammal[NUMMAMMALS];// TODO code application logic here
        
        mammals[0] = new Bear();
        mammals[1] = new Elephant();
        mammals[2] = new Horse();
        mammals[3] = new Lion();
        
        for(int i = 0; i < NUMMAMMALS; i++){
            if(mammals[i] instanceof Vehicle){
                Vehicle v = (Vehicle)mammals[i];
                v.drive();
            }
                
        }
    }
    
}
