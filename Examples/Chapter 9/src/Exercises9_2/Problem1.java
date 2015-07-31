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
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThreadX tx = new ThreadX();// TODO code application logic here
        ThreadY ty = new ThreadY();
        tx.start();ty.start();
    }
    
}

class ThreadX extends Thread {
    public void run(){
        int i= 0;
        try{
            while(i <19){
                Thread.sleep(1000);
                System.out.println("This is thread A");
                i++;
            }
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
}

class ThreadY extends Thread {
    public void run(){
        int i = 0;
        try{
            while(i < 19){
                Thread.sleep(3000);
                System.out.println("This is thread B");
                i++;
            }
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
}