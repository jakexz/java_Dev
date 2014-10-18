/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package point3doverloadmethods;

/**
 *
 * @author Jakexz
 */
class Point3D{
    double x, y, z;
    
    Point3D(double x, double y, double z){
        this.x = x; this.y = y; this.z = z;
    }
    
    Point3D(double x){
        this(x, 0, 0);
    }
    
    Point3D(double x, double y){
        this(x, y,0);
    }
    
    void move(double x){
        this.x = x;
    }
    void move(double x, double y){
        this.x = x;
        this.y = y;
    }
    void move(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

public class Point3DOverloadMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point3D p = new Point3D(1.1, 3.4, -2.8);// TODO code application logic here
        p.move(5);
        System.out.println("p.x = " + p.x);
        System.out.println("p.y = " + p.y);
        System.out.println("p.z = " + p.z);
        
        p.move(6,6);
        System.out.println("p.x = " + p.x);
        System.out.println("p.y = " + p.y);
        System.out.println("p.z = " + p.z);
        
        p.move(7, 7, 7);
        System.out.println("p.x = " + p.x);
        System.out.println("p.y = " + p.y);
        System.out.println("p.z = " + p.z);        
        
    }
    
}
