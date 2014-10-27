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
 class Sphere extends Shape implements Shape3D {
    Point3D center;
    double radius;
    
    Sphere(Point3D center, double radius){
        this.center = center;
        this.radius = radius;
    }
    
    @Override
    public void display(){
        System.out.println("Sphere");
    }
    
    @Override
    public double getVolume(){
        return 4* Math.PI * Math.sqrt(radius) * radius /3;
    }
}
