/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circleexample;

/**
 *
 * @author Jakexz
 */

class Circle{
    double x, y, radius;
    Circle (double ax, double ay, double aradius){
        ax = x; ay = y; aradius = radius;
    }
}
public class CircleExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c = new Circle(17.5, 18.4, 6);// TODO code application logic here
       /* c.x = 12.1;
        c.y = 24.5;
        c.radius = 4;
        samething done in the Point3d example handling through constructors
        */
        System.out.println("c.x = " + c.x);
        System.out.println("c.y = " + c.y);
        System.out.println("c.radius = " + c.radius);
    }
    
}
