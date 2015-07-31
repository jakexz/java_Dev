/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeadLockDemo;

/**
 *
 * @author Jakexz
 */
public class DeadLockDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create objects 
        A a = new A();
        B b = new B();
        a.b = b;
        b.a = a;
        
        //Create threads
        Thread1 t1 = new Thread1(a);
        Thread2 t2 = new Thread2(b);
        t1.start();
        t2.start();
        
        //Wait for threads to complete
        try{
            t1.join();
            t2.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        //display message
        System.out.println("Done");
    }
    
}
//a1 will lock class B because it will call b2()
//meanwhile, b1 will lock class A because it will call a2()
//thus creating a deadlock
class A {
    B b;
    synchronized void a1(){
        System.out.println("Starting class A, method a1");
        b.b2();//
    }
    
    synchronized void a2(){
        System.out.println("Starting class A, method a2");
    }
}

class B{
    A a;
    
    synchronized void b1(){
        System.out.println("Starting class B, method b1");
        a.a2();
    }
    
    synchronized void b2(){
        System.out.println("Starting class B, method b2");
    }
}

class Thread1 extends Thread{
    A a;
    
    Thread1(A a){
        this.a = a;
    }
    
    public void run(){
        for(int i = 0; i < 100000; i++){
            a.a1();
        }
    }
}
class Thread2 extends Thread{
    B b;
    
    Thread2(B b ){
        this.b = b;
    }
    
    public void run(){
        for(int i = 0; i < 100000; i++){
            b.b1();
        }
    }
}