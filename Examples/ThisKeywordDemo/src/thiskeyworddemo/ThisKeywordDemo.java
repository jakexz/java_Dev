/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thiskeyworddemo;

/**
 *
 * @author Jakexz
 */

class Point3D{
    double x, y , z;
    Point3D(double x, double y, double z){
        this.x = x; this.y = y; this.z = z;
    }
            
    
}
public class ThisKeywordDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point3D p  = new Point3D(1.1, 3.4, -2.8);// TODO code application logic here
        System.out.println("Point x is " + p.x);
        System.out.println("Point y is " + p.y);
        System.out.println("Point z is " + p.z);
    }
    
}
