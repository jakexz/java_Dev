/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Example1;

/**
 *
 * @author Jakexz
 */
public class AbstractClassDemo {
    public static void main(String args[]){
        Shape s = new Circle();
        s.display();
        s = new Rectangle();
        s.display();
        s = new Triangle();
        s.display();
        s = new Rhombus();
        s.display();
        s = new Trapezoid();
        s.display();
    }
}
