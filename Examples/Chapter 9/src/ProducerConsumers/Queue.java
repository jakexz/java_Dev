/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProducerConsumers;

/**
 *
 * @author Jakexz
 */
public class Queue {
    private final static int SIZE = 10;
    int array[] = new int[SIZE];
    int read = 0;
    int write = 0;
    int count = 0;
    
    synchronized void add(int i){
        //wait while the queue is full
        while(count == SIZE){
            try{
                wait();
            }catch(InterruptedException ex){
                ex.printStackTrace();
                System.exit(0);
            }
        }
        //Add data to array and adjust write pointer 
            array[write++] = i;
            if(write >= SIZE)
                write = 0;
            
            //increment count 
            ++count;
            
            //notify all threads lock has been lifted
            notifyAll();
    }
    
    synchronized int remove(){
            //wait for queue to empty
            while (count == 0){
                try{
                    wait();
                }catch(InterruptedException ex){
                    ex.printStackTrace();
                    System.exit(0);
                }
            }
            
            //read data from array and adjust read pointer
                int element = array[read++];
                if(read >= SIZE)
                    read = 0;
                
                //decrement count
                --count;
                
                //Notify all threads lock has been lifted
                notifyAll();
                
                //return element from array
                return element;    
        }    
}
