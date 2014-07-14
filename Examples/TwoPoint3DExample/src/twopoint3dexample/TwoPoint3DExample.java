/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twopoint3dexample;

/**
 *
 * @author Jakexz
 */

class Point3D {
    double x, y , z;
}
public class TwoPoint3DExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point3D p1 = new Point3D(); // TODO code application logic here
        Point3D p2 = new Point3D();
        
        
        //point p1 
        p1.x = 1.1;
        p1.y = 3.4;
        p1.z = -2.8;
        
        //point p2 
        p2.x = 100.1;
        p2.y = 103.4;
        p2.z = -202.8;
        
        System.out.println("Point x in 1 is  " + p1.x);
        System.out.println("Point x in 1 is  " + p1.y);
        System.out.println("Point x in 1 is  " + p1.z);
        System.out.println("Point x in 1 is  " + p2.x);
        System.out.println("Point x in 1 is  " + p2.y);
        System.out.println("Point x in 1 is  " + p2.z);
    }
    
}
