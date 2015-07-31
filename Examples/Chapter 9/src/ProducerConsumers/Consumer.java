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
public class Consumer extends Thread{
    Queue queue;
    String string;
    
    Consumer(Queue queue, String string){
        this.queue = queue;
        this.string = string;
    }
    
    @Override
    public void run(){
        while(true)
            System.out.println(string + ": " + queue.remove());
    }
}
