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
public class Problem3 {
    
    /**
     * @param args the command line arguments
     */
    private static int NUMBER_OF_THREADS = 5;
    public static void main(String[] args) {
        
        //create threads
        ThreadM threads[] = new ThreadM[NUMBER_OF_THREADS];// TODO code application logic here
        for(int i = 0; i<5 ; i++){
            threads[i] = new ThreadM();
        }
        
        //start threads 
        for(int i = 0; i<NUMBER_OF_THREADS; i++){
            threads[i].start();
        }
        
        
        //thread waiting loop
        for(int i = 0; i<NUMBER_OF_THREADS; i++){
            try{
                threads[i].join();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        
        //finished loop, print final message
        System.out.println("\nAll threads have finished");
    }
    
}

class ThreadM extends Thread{
    public void run(){
        try{
            for(int i = 0; i< 10; i++){
                int msec = (int)(300 + 500*Math.random());
                Thread.sleep(msec);
                System.out.println("x," + "waited for " + msec + " milliseconds");
            }
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
}