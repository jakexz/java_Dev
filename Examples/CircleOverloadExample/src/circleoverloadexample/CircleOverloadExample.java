/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circleoverloadexample;

/**
 *
 * @author Jakexz
 */
class Circle{
    double x, y , radius;
    
    Circle(double radius){
            this.radius = radius;
    }
    
    Circle(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
        }
    
    void move(double x){
        this.x = x;
    }
    
    void move(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    void scale(double a){
        radius *= a;
    }
}
public class CircleOverloadExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c = new Circle(4);// TODO code application logic here
        c.move(3);
        c.scale(.5);
        
        System.out.println("c.x = " + c.x);
        System.out.println("c.y = " + c.y);
        System.out.println("c.radius = " + c.radius);
        
        c.move(-2, -2);
        c.scale(2);
        System.out.println("c.x = " + c.x);
        System.out.println("c.y = " + c.y);
        System.out.println("c.radius = " + c.radius);
    }
    
}
