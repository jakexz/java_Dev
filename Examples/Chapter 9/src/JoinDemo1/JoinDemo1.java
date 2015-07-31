/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JoinDemo1;

/**
 *
 * @author Jakexz
 */
public class JoinDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThreadM tm = new ThreadM();// TODO code application logic here
        ThreadN tn = new ThreadN();
        tm.start();
        tn.start();
        try{
            tm.join();
            tn.join();
            System.out.println("Both threads have finished");
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
    
}

class ThreadM extends Thread{
    public void run(){
        try{
            for(int i = 0; i < 10; i++){
                Thread.sleep(1000);
                System.out.println("ThreadM");
                
            }
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
}

class ThreadN extends Thread{
    public void run(){
        try{
            for(int i = 0; i < 20; i++){
                Thread.sleep(1000);
                System.out.println("ThreadN");
                
            }
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
}