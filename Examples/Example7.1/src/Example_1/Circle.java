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
 class Circle extends Shape implements Shape2D{
     Point3D center, p;
     
     Circle(Point3D center,Point3D p){
         this.center = center;
         this.p = p;
     }
     
     @Override
     public void display(){
         System.out.println("Circle");
    }
     
     @Override
     public double getArea(){
         double dx = center.x - p.x;
         double dy = center.y - p.y;
         double d = dx*dx + dy*dy;
         double radius = Math.sqrt(d);
         return Math.PI*radius*radius;
     }

    
}
