/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Example1;

/**
 *
 * @author Jakexz
 */
public class PrivateConstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Person p1 = new Person("John", 21); // TODO code application logic here
       System.out.println(p1.name);
       System.out.println(p1.age);
    }
    
}
