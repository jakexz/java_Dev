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
public class LuminousCone extends Cone implements LuminousObject{

    LuminousCone() {
       
    }
    @Override
    public void lightOff(){
        System.out.println("The cone is not lit");
    }
    
    @Override
    public void lightOn(){
        System.out.println("The cone is lit");
    }
}
