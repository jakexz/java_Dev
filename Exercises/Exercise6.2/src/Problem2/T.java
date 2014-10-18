/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problem2;

/**
 *
 * @author Jakexz
 */
public class T extends S{
    StringBuffer i= new StringBuffer("new string buffer, dont touch");
    void Display(){
        System.out.println("class T i: " + i );
        System.out.println("class S i: " + super.i);
    }
}
