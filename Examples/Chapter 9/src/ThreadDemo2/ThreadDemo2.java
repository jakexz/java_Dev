/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadDemo2;

/**
 *
 * @author Jakexz
 */
public class ThreadDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RunnableY ry = new RunnableY();// TODO code application logic here
        Thread t = new Thread(ry);
        t.start();
    }
    
}

class RunnableY implements Runnable{
    public void run(){
        try{
            while(true){
                Thread.sleep(2000);
                System.out.println("Hello");
            }
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
}