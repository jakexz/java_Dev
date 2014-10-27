/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example_1;

/**
 *
 * @author Jakexz
 */
public class Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c = new Circle(new Point3D(0,0,0), new Point3D(1,0,0));
        c.display();
        System.out.println(c.getArea());// TODO code application logic here
        
        Sphere s = new Sphere( new Point3D(0,0,0), 1);
        s.display();
        System.out.println(s.getVolume());
        
    }
    
}
