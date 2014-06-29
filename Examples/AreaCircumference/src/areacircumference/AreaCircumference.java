/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package areacircumference;

/**
 *
 * @author Jakexz
 */
public class AreaCircumference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radius = 5;// TODO code application logic here
        double area = Math.PI * radius*radius ; 
        double circumference = 2* Math.PI*radius;
        
        System.out.println("Radius is " + radius );
        System.out.println("Area is " + area);
        System.out.println("circumference is " + circumference);
        
        
    }
    
}
