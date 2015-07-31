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
public class ProducerConsumers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue queue = new Queue();
        new Producer(queue).start();
        new Consumer(queue, "Consumer 1").start();
        new Consumer(queue, "Consumer 2").start();
        new Consumer(queue, "Consumer 3").start();
    }
    
}
