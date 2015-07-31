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
public class Producer extends Thread{
    Queue queue;
    
    Producer(Queue queue){
        this.queue = queue;
    }
    
    @Override
    public void run(){
        int i = 0;
        while(true)
            queue.add(i++);
    }
}
