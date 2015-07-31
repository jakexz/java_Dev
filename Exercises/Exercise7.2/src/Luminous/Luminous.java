/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Luminous;

/**
 *
 * @author Jakexz
 */
public class Luminous {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LuminousObject LO;

        LO = new LuminousCone();
            LO.lightOff();
            LO.lightOn();
                
        LO = new LuminousCube();
            LO.lightOff();
            LO.lightOn();
        
        // TODO code application logic here
    }
    
}
