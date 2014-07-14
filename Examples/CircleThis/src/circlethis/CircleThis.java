/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circlethis;

/**
 *
 * @author Jakexz
 */

class Circle{
    double x, y , radius;
    
    Circle(double x){
        this(x, 0, 1);
    }
    
    Circle(double x, double y){
        this(x, y, 1);
    }
    
    Circle(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    void move(double x, double y){
        this.x = x; this.y = y;
    }
    
    void scale(double a ){
        radius *= a;
    }
}
public class CircleThis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c = new Circle(1.1, 3.4, 10);// TODO code application logic here
        System.out.println("c.x = " + c.x);
        System.out.println("c.y = " + c.y);
        System.out.println("c.radius = " + c.radius);
    }
    
}
