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
public class Horse extends Mammal
implements Vehicle{
    @Override
    public void drive(){
        System.out.println("Horse: drive");
    }
}
