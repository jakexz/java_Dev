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
public class Elephant extends Mammal
implements Vehicle
{
    @Override
    public void drive(){
        System.out.println("Elephant: drive");
    }
}
