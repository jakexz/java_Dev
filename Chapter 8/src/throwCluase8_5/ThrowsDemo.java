/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throwCluase8_5;

/**
 *
 * @author Jakexz
 */
public class ThrowsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        a();// TODO code application logic here
    }
    
    public static void a() {
        try{
            b();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    //easier way to catch errors
    public static void b() throws ClassNotFoundException{c();}
    
    public static void c() throws ClassNotFoundException{
        Class cls = Class.forName("java.lang.Integer");
        System.out.println(cls.getName());
        System.out.println(cls.isInterface());
    }
    
    
}
