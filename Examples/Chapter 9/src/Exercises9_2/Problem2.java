/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercises9_2;

/**
 *
 * @author Jakexz
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RunnableY ry = new RunnableY();// TODO code application logic here
        RunnableX rx = new RunnableX();
        Thread t1 = new Thread(ry);
        Thread t2 = new Thread(rx);
        t1.start();t2.start();
    }
    
}

class RunnableY implements Runnable{
    public void run(){
        int i = 0;
        try{
            while(i < 19){
                Thread.sleep(1000);
                System.out.println("This is Thread A");
                i++;
            }
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
}

class RunnableX implements Runnable{
    public void run(){
        int i = 0;
        try{
            while(i < 19){
                Thread.sleep(3000);
                System.out.println("This is Thread B");
                i++;
            }
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
}