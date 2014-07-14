/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise5.pkg4;

/**
 *
 * @author Jakexz
 */


class Circle{
    double x, y, radius;
    Circle (double ax, double ay, double aradius){
        x = ax; y = ay; radius = aradius;
    }
    
    Circle(double aradius){
        radius = aradius; x = 0; y = 0;
    }

}
public class Exercise54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c1 = new Circle(2.2, 42.9, 45.8); // TODO code application logic here
        System.out.println("A circle of radius of " + c1.radius + " is centered at:(" + c1.x + "," + c1.y +")");
        
        Circle c2 = new Circle(4.4);
        System.out.println("A circle of radius of " + c2.radius + " is centered at:(" + c2.x + "," + c2.y +")");
    }
    
}
