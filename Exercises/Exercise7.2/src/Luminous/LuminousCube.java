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
public class LuminousCube extends Cube implements LuminousObject {
    LuminousCube(){}
    
    @Override
    public void lightOff(){
        System.out.println("The cube is not lit");
    }
    
    /**
     *
     */
    @Override
    public void lightOn(){
        System.out.println("The cube is lit");
    }
}
