/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package staticvariable;

/**
 *
 * @author Jakexz
 */
class Thing{
    static int count;
    String name;
    
    Thing(String name)
    {
        this.name = name;
        ++count;
    }
}

//Enhancement 
class MyObject {
    static short s = 400; 
    int i = 200;
    
    void f(){
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        short s = 300;
        int i = 100;
        double d = 1E100;
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("d = " + d);
    }
}

public class StaticVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thing t1 = new Thing("Bowling Ball");// TODO code application logic here
        Thing t2 = new Thing("Ping Pong Ball");
        Thing t3 = new Thing("Football");
        System.out.println(t1.name + " " + t1.count);
        System.out.println(t2.name + " " + t2.count);
        System.out.println(t3.name + " " + t3.count);
        
        //enhancement
        MyObject myObject = new MyObject();
        myObject.f();
    }
    
}
