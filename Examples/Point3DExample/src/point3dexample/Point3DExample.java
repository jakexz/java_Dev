                    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package point3dexample;

/**
 *
 * @author Jakexz
 */
class Point3D {
double x, y, z;
    Point3D(double ax){
        x = ax;
    }

    Point3D(double ax, double ay){
        x = ax;
        y = ay;
    }

    Point3D(double ax, double ay, double az){
        x = ax;
        y = ay;
        z = az;
    }
}

class Point3DExample{
    public static void main(String[] args)
    {
       Point3D p = new Point3D(1.1, 3.4, -2.8);


      /* p.x = 1.1;
       p.y = 3.4;
       p.z = -2.8;   
       the assigment system is now handled through constructors*/ 
       
       System.out.println("Point x is " + p.x);
       System.out.println("Point y is " + p.y);
       System.out.println("Point z is " + p.z);
              Point3D p2 = new Point3D(1.1, 3.4);
       System.out.println("Point2 x is " + p2.x);
       System.out.println("Point2 y is " + p2.y);
       System.out.println("Point2 z is " + p2.z);
              Point3D p3 = new Point3D(1.1);
       System.out.println("Point3 x is " + p3.x);
       System.out.println("Point3 y is " + p3.y);
       System.out.println("Point3 z is " + p3.z);
    }
    
}