/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadDemo1;

/**
 *
 * @author Jakexz
 */
public class ThreadDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Test Complete");// TODO code application logic here
        ThreadX tx = new ThreadX();
        tx.start();
    }
    
}

class ThreadX extends Thread {
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
