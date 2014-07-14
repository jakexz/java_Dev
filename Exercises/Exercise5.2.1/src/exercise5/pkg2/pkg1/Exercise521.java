/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise5.pkg2.pkg1;

/**
 *
 * @author Jakexz
 */

class Person{
    String name;
    int age;
    float salary;
    
    Person(String Name,int Age , float Salary ){
        Name = name; Age = age; Salary = salary;
    }
}

class Sphere{
    double radius,orginX, orginY;
    //using this keyword
    // Sphere(double Radius,double OrginX, double OrginY){
    //   Radius = radius; OrginX = orginX; OrginY = orginY;
    //}
    
    Sphere(double radius, double orginX, double orginY){
        this.radius = radius;this.orginX= orginX; this.orginY = orginY;
    }
}

public class Exercise521 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Person("John Smith", 42, 75834.3232f);// TODO code application logic here
      //  p.name = "John Smith"; p.age = 42; p.salary = 72000;
        System.out.println("Name: " + p.name + " Age:" + p.age + " Salary: " + p.salary);
        
        Sphere s = new Sphere(4.6, 0, 0);
        //handling initialization through constructor
        // s.radius = 4.6; s.orginY = 0; s.orginX = 0;
        
        System.out.println("A sphere of radius of " + s.radius + " is centered at:(" + s.orginX + "," + s.orginY +")");
        
    }
    
}
